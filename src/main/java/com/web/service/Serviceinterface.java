package com.web.service;

import java.util.List;

import com.web.model.Library;

public interface Serviceinterface {
	public Library getone(int id);
	public List<Library> getall();
	public String register(Library library);
	public void deletebook(int id);
	
	
	

}
