package com.wiki.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
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

import com.wiki.dto.CityDto;
import com.wiki.dto.Mensaje;
import com.wiki.entity.City;
import com.wiki.service.CityService;

@RestController
@RequestMapping("/city")
@CrossOrigin(origins = "*")
public class CityController {

	@Autowired
	CityService cityService;

	@GetMapping("/list")
	public ResponseEntity<List<City>> list() {
		List<City> list = cityService.findAll();
		return new ResponseEntity(list, HttpStatus.OK);
	}

	@GetMapping("/detail/{ctyId}")
	public ResponseEntity<City> getById(@PathVariable("ctyId") int id) {
		if (!cityService.existsById(id))
			return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);

		City city = cityService.getOne(id).get();

		return new ResponseEntity(city, HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody CityDto cityDto) {
		if (StringUtils.isBlank(cityDto.getCtyName()))
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

		if (cityService.existsByCtyName(cityDto.getCtyName()))
			return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);

		City city = new City(cityDto.getCtyName());
		cityService.save(city);

		return new ResponseEntity(new Mensaje("City creado"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/update/{ctyId}")
	public ResponseEntity<?> update(@PathVariable("ctyId") int id, @RequestBody CityDto cityDto) {
		if (!cityService.existsById(id))
			return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);

		if (cityService.existsByCtyName(cityDto.getCtyName())
				&& cityService.findByCtyName(cityDto.getCtyName()).get().getCtyId() != id)
			return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);

		if (StringUtils.isBlank(cityDto.getCtyName()))
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

		City city = cityService.getOne(id).get();
		city.setCtyName(cityDto.getCtyName());
		cityService.save(city);

		return new ResponseEntity(new Mensaje("City actualizado"), HttpStatus.OK);
	}
}
