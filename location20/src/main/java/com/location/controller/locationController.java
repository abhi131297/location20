package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.dto.saveLocation;
import com.location.entity.location;
import com.location.services.LocationService;
import com.location.util.emailutil;

@Controller
public class locationController {

	@Autowired
	private LocationService locationService;
	
	@Autowired
	private emailutil eutil;
	

	@RequestMapping("/showLocation")
	public String showLocation() {
		return "saveLocationjsp";
	}

	@RequestMapping("/saveLocation")
	public String saveLocationinfo(@ModelAttribute("loca") location loca, ModelMap model) {
		locationService.saveLocation(loca);
		eutil.sendSimpleMessage("abhib13121997@gmail.com", "test email", "record is saved!!!");
		
		model.addAttribute("msg","record is saved!!!");
		return "saveLocationjsp";
	}

//	@RequestMapping("/saveLocation")
//	public String saveLocationinfo(@RequestParam("id") long id, @RequestParam("code") String code,
//			@RequestParam("name") String name, @RequestParam("type") String type, ModelMap model) {
//		location loca = new location();
//		loca.setId(id);
//		loca.setCode(code);
//		loca.setName(name);
//		loca.setType(type);
//		locationService.saveLocation(loca);
//		model.addAttribute("msg", "record is saved!!!");
//		return "saveLocationjsp";
//	}
	
//	@RequestMapping("/saveLocation")
//	public String saveLocationinfo(saveLocation saveloc, ModelMap model) {
//		location loca = new location();
//		loca.setId(saveloc.getId());
//		loca.setCode(saveloc.getCode());
//		loca.setName(saveloc.getName());
//		loca.setType(saveloc.getType());
//		locationService.saveLocation(loca);
//		model.addAttribute("msg", "record is saved!!!");
//		return "saveLocationjsp";
//	}
	
	@RequestMapping("/getLocations")
	public String getLocations(ModelMap model) {
		List<location> locations = locationService.getAllLocations();
		model.addAttribute("loca", locations);
		return "searchResults";
	}
	
	@RequestMapping("/delete")
	public String deleteLocation(@RequestParam("id") long id, ModelMap model) {
	locationService.deleteLocationById(id);	
	
	List<location> locations = locationService.getAllLocations();
	model.addAttribute("loca", locations);
	return "searchResults";
	}
	
	@RequestMapping("/update")
	public String updateLocation(@RequestParam("id") long id, ModelMap model) {
		location loca = locationService.getLocationById(id);
		model.addAttribute("location", loca);
		return "updateLocationinfo";
}
	@RequestMapping("/UpdateLoc")
	public String updateLocationDetails(saveLocation saveloc, ModelMap model) {
		location loca = new location();
		loca.setId(saveloc.getId());
		loca.setCode(saveloc.getCode());
		loca.setName(saveloc.getName());
		loca.setType(saveloc.getType());
		locationService.saveLocation(loca);

		List<location> locations = locationService.getAllLocations();
		model.addAttribute("loca", locations);
		return "searchResults";
	}
}
