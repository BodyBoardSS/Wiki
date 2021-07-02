/**
 * 
 */
package com.wiki.controller;

import java.util.List;

import com.wiki.dto.CityDto;
import com.wiki.dto.CustomerDto;
import com.wiki.dto.Mensaje;
import com.wiki.entity.City;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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
	
	@GetMapping("/list")
	public ResponseEntity<List<Customer>> list() {
		List<Customer> list = customerService.findAll();
		return new ResponseEntity(list, HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody CustomerDto customerDto) {
		if (StringUtils.isBlank(customerDto.getCusName()))
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

		Customer customer = new Customer();
		customer.setCusName(customerDto.getCusName());
		customer.setCusLastname(customerDto.getCusLastname());
		customer.setCusCode(customerDto.getCusCode());
		customer.setCity(customerDto.getCity());
		customer.setCustomerType(customerDto.getCustomerType());
		customer.setCusCode(customerDto.getCusCode());
		customerService.save(customer);

		return new ResponseEntity(new Mensaje("Customer creado"), HttpStatus.OK);
	}

	@GetMapping("/detail/{cusId}")
	public ResponseEntity<Customer> getById(@PathVariable("cusId") int id) {
		if (!customerService.existsById(id))
			return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);

		Customer customer = customerService.getOne(id).get();

		return new ResponseEntity(customer, HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/update/{cusId}")
	public ResponseEntity<?> update(@PathVariable("cusId") int id, @RequestBody CustomerDto customerDto) {
		if (!customerService.existsById(id))
			return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);

		Customer customer = customerService.getOne(id).get();
		customer.setCusName(customerDto.getCusName());
		customer.setCusLastname(customerDto.getCusLastname());
		customer.setCusCode(customerDto.getCusCode());
		customer.setCity(customerDto.getCity());
		customer.setCustomerType(customerDto.getCustomerType());
		customer.setCusCode(customerDto.getCusCode());
		customerService.save(customer);

		return new ResponseEntity(new Mensaje("Customer actualizado"), HttpStatus.OK);
	}
}
