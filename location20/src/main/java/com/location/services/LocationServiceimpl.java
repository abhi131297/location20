package com.location.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entity.location;
import com.location.entityrepository.locationRepository;

@Service
public class LocationServiceimpl implements LocationService {
	
	@Autowired
	private locationRepository locationrepo;

	@Override
	public void saveLocation(location loca) {
		locationrepo.save(loca);
	}

	@Override
	public List<location> getAllLocations() {
		List<location> location = locationrepo.findAll();
		return location;
	}

	@Override
	public void deleteLocationById(long id) {
		locationrepo.deleteById(id);
		
	}

	@Override
	public location getLocationById(long id) {
		Optional<location> findById = locationrepo.findById(id);
		location location = findById.get();
		return location;
	}

}
