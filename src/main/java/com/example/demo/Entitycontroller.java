package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Entitycontroller {
	@Autowired
	private Entityservice entsvc;
	@RequestMapping(method = RequestMethod.GET, value="/Entity")
	public List<Entitiesclass> getAllEntities(){
		
		return entsvc.getAllEntities();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/Entity" )
	public void addEntity(@RequestBody Entitiesclass entcls)
	{
		entsvc.addEntity(entcls);
	}
	@RequestMapping(method = RequestMethod.PUT, value="/Entity/{id}")
	public void updateEntity(@PathVariable String id, @RequestBody Entitiesclass entcls)
	
	{
		entsvc.updateEntity(id, entcls);
	}
	public void deleteEntity(@PathVariable String id)
	{
		entsvc.deleteEntity(id);
	}

	
}
	


