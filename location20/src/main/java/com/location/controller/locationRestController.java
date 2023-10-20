package com.location.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entity.location;
import com.location.entityrepository.locationRepository;

@RestController
public class locationRestController {
	
	@Autowired
	private locationRepository locationrepo;

	@RequestMapping("/location/{id}")
	public location getlocation(@PathVariable long id) {
		if (id==0) {
			throw new LocationNotFound();
		}
		Optional<location> findById = locationrepo.findById(id);
		location loca = findById.get();
		return loca;
	}
}
