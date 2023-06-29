package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Entityservice {
	@Autowired
    public EntityRepository entityrepo1;
	public List<Entitiesclass> getAllEntities()
	
	{
		List<Entitiesclass> ent = new ArrayList<>();
		entityrepo1.findAll().forEach(ent::add);
		return ent;
	}
	
	public void addEntity(Entitiesclass ent) {
		entityrepo1.save(ent);
	}
	
	public void updateEntity(String id, Entitiesclass ent) {
		entityrepo1.save(ent);
	}
	public void deleteEntity(String id) {
		entityrepo1.deleteById(id);
	}
}
