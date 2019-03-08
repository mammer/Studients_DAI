package com.probuilders.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.probuilders.entities.Etudiant;

public interface EtudiantRepositorie extends JpaRepository<Etudiant, Long> {
	
}
