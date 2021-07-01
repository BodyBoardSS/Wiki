/**
 * 
 */
package com.wiki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiki.entity.Customer;
import com.wiki.service.CustomerService;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "*")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Customer>> list() {
		List<Customer> list = customerService.findAll();
		return new ResponseEntity(list, HttpStatus.OK);
	}
}
