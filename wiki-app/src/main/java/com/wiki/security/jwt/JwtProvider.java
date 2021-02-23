/**
 * 
 */
package com.wiki.security.jwt;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.wiki.security.entity.PrimaryUser;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

/**
 * @author kevin_orellana
 *
 */

@Component
public class JwtProvider {
	
	private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
	
	@Value("${jwt.secret}")
	private String secret;
	
	@Value("${jwt.expiration}")
	private Integer expiration;
	
	public String generateToken(Authentication authentication) {
		PrimaryUser primaryUser = (PrimaryUser) authentication.getPrincipal();
		return Jwts.builder().setSubject(primaryUser.getUsername())
				.setIssuedAt(new Date())
				.setExpiration(new Date(new Date().getTime()+ expiration * 1000))
				.signWith(SignatureAlgorithm.HS512, secret)
				.compact();
	}
	
	public String getUserNameFromToken(String token) {
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
	}
	
	public Boolean validateToken (String token) {
		try {
			Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
			return Boolean.TRUE;
		} catch (MalformedJwtException e) {
			logger.error("Token malformed");
		}catch (UnsupportedJwtException e) {
			logger.error("Token unSupported");
		}catch (ExpiredJwtException e) {
			logger.error("Token Expired");
		}catch (SignatureException e) {
			logger.error("Fail in the signature");
		}
		return Boolean.FALSE;
	}
}
