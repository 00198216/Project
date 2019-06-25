package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Showcase;

@Repository
public interface ShowcaseRepository extends JpaRepository<Showcase, Integer> {

	public List<Showcase> findAll();
	public Showcase findOne(int id);
}
