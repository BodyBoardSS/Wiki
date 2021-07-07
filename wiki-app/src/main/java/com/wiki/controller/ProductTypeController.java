/**
 * 
 */
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
import com.wiki.entity.ProductType;
import com.wiki.entity.Supplier;
import com.wiki.service.ProductTypeService;

/**
 * @author BodyBoardSS
 * Date: 2021-07-06
 */

@RestController
@RequestMapping("/producttype")
@CrossOrigin(origins = "*")
public class ProductTypeController {
	
	@Autowired
	ProductTypeService productTypeService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Supplier>> list() {
		List<ProductType> list = productTypeService.findAll();
		return new ResponseEntity(list, HttpStatus.OK);
	}

	@GetMapping("/detail/{pdtId}")
	public ResponseEntity<ProductType> getById(@PathVariable("pdtId") int id) {
		if (!productTypeService.existsById(id))
			return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);

		ProductType productType = productTypeService.getOne(id);

		return new ResponseEntity(productType, HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody SupplierDto SupplierDto) {

		ProductType productType = new ProductType();
		productTypeService.save(productType);

		return new ResponseEntity(new Mensaje("Produt Type creado"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/update/{pdtId}")
	public ResponseEntity<?> update(@PathVariable("pdtId") int id, @RequestBody SupplierDto SupplierDto) {
		if (!productTypeService.existsById(id))
			return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);

		ProductType productType = productTypeService.getOne(id);
		productTypeService.save(productType);

		return new ResponseEntity(new Mensaje("Produt Type actualizado"), HttpStatus.OK);
	}
}
