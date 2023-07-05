package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//@Component
//@ConfigurationProperties
//@PropertySource("file:myfile.properties")
@Entity
@Table(name="entities")
public class Entitiesclass {
	@Id
	private String id;
	private String name;
	
	
	public Entitiesclass() {
		super();
	}
	public Entitiesclass(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}




