package com.expressanalytics.data.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.expressanalytics.data.models.Datas;
import com.expressanalytics.data.services.DataService;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DataController {
	@Autowired
	private DataService dataService;
	@RequestMapping("/")
	public String home(){
		return "Please Login and goto /data for furhter functions";
	}
	@RequestMapping("/data")
	public List<Datas> getAllData(){
		return dataService.getAllData();
	}
	@RequestMapping("/data/{id}")
	public Optional<Datas> getData(@PathVariable String id) {
		return dataService.getData(id);
	}
	@RequestMapping(method=RequestMethod.POST,value = "/data")
	public void addData(@RequestBody Datas data) {

		dataService.addData(data);
		
	}
	@RequestMapping(method=RequestMethod.PUT,value = "/data/{id}")
	public void updateData(@RequestBody Datas data,@PathVariable String id) {
		dataService.updateData(id,data);
	}
	@RequestMapping(method=RequestMethod.DELETE,value = "/data/{id}")
	public void deleteData(@PathVariable String id) {
		dataService.deleteData(id);
	}
}
