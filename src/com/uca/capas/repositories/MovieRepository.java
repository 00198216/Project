package com.uca.capas.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

	public List<Movie> findAll();
	public Movie findOne(int id);
	
}
