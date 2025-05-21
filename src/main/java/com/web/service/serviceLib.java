package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Library;
import com.web.repo.Libraryrepo;
@Service
public class serviceLib implements Serviceinterface {
	@Autowired
	private Libraryrepo repo;

	@Override
	public Library getone(int id) {
		Library lib=repo.findById(id).get();
		return lib;
	}

	@Override
	public List<Library> getall() {
List<Library> all=repo.findAll();
	return all;
	}

	@Override
	public String register(Library library) {
		repo.save(library);
		System.out.println("print");
		
	return "saved";
	}

	@Override
	public void deletebook(int id) {
		// TODO Auto-generated method stub

	}

}
