package com.probuilders.web.rest;

import java.util.Collection;
import java.util.Optional;

import javax.persistence.PostUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.probuilders.dao.EtudiantRepositorie;
import com.probuilders.entities.Etudiant;

@RestController
public class EtudiantRestService {
	
	@Autowired
	EtudiantRepositorie etudiantRepositorie;
	
	@GetMapping(value="/etudiants")
	public Collection<Etudiant> getEtudiants(){
		return etudiantRepositorie.findAll();
	}
	
	@DeleteMapping(value = "/etudiant/{id}")
	public void delete(@PathVariable(name="id") Long id) {
		etudiantRepositorie.deleteById(id);
	}
	
	@PostMapping(value = "/etudiant")
	public Etudiant addEtudiant(@RequestBody Etudiant e) {
		return etudiantRepositorie.save(e);
	}
	
	@PutMapping(value = "/etudiant/{id}")
	public Etudiant updateEtudiant(@PathVariable(name="id")Long id,@RequestBody Etudiant e) {
		e.setId(id);
		return etudiantRepositorie.save(e);
	}
	
	public void modif() {
		
	}
	
}
