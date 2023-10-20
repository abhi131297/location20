package com.location.services;

import com.location.entity.location;

import java.util.List;

public interface LocationService {
	
	public void saveLocation(location loca);
	public List<location> getAllLocations();
	public void deleteLocationById(long id);
	public location getLocationById(long id);

}
