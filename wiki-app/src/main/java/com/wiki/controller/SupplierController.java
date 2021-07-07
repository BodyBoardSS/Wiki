package com.wiki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiki.dto.Mensaje;
import com.wiki.dto.SupplierDto;
import com.wiki.entity.Supplier;
import com.wiki.service.SupplierService;

@RestController
@RequestMapping("/supplier")
@CrossOrigin(origins = "*")
public class SupplierController {

	@Autowired
	SupplierService supplierService;

	@GetMapping("/list")
	public ResponseEntity<List<Supplier>> list() {
		List<Supplier> list = supplierService.findAll();
		return new ResponseEntity(list, HttpStatus.OK);
	}

	@GetMapping("/detail/{supId}")
	public ResponseEntity<Supplier> getById(@PathVariable("supId") int id) {
		if (!supplierService.existsById(id))
			return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);

		Supplier Supplier = supplierService.getOne(id).get();

		return new ResponseEntity(Supplier, HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody SupplierDto SupplierDto) {

		Supplier Supplier = new Supplier();
		supplierService.save(Supplier);

		return new ResponseEntity(new Mensaje("Supplier creado"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/update/{supId}")
	public ResponseEntity<?> update(@PathVariable("supId") int id, @RequestBody SupplierDto SupplierDto) {
		if (!supplierService.existsById(id))
			return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);

		Supplier supplier = supplierService.getOne(id).get();
		supplierService.save(supplier);

		return new ResponseEntity(new Mensaje("Supplier actualizado"), HttpStatus.OK);
	}
}
