package com.wiki.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiki.entity.City;

/**
 * @author kevin_orellana
 *
 */
@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
	Optional<City> findByCtyName(String nombre);

	boolean existsByCtyName(String nombre);
}
