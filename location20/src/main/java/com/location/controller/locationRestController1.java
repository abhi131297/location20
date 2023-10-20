package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entity.location;
import com.location.entityrepository.locationRepository;

@RestController
@RequestMapping("/location")
public class locationRestController1 {
	
	@Autowired
	private locationRepository locationrepo;

	@GetMapping
	public List<location> getlocation() {                                //read operation
		List<location> locations = locationrepo.findAll();
		return locations;
	}
	
	@PostMapping															//insert operation
	public void savelocation(@RequestBody location loca) {
		locationrepo.save(loca);
	}
	
	@PutMapping
	public void updatelocation(@RequestBody location loca) {				//update operation
		locationrepo.save(loca);
	}
	
	@DeleteMapping("delete/{id}")
	public void deletelocation(@PathVariable Long id) {
		locationrepo.deleteById(id);
	}
	
}
