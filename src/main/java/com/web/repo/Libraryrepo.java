package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Library;
@Repository
public interface Libraryrepo extends JpaRepository<Library, Integer> {

}
