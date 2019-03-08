package com.probuilders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.probuilders.dao.EtudiantRepositorie;
import com.probuilders.entities.Etudiant;

@SpringBootApplication
public class StudentsDaiApplication implements CommandLineRunner {

	@Autowired
	private EtudiantRepositorie etudiantRepositorie;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentsDaiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		etudiantRepositorie.save(new Etudiant(null, "mammer", "bennasri"));
//		etudiantRepositorie.save(new Etudiant(null, "mohamed", "amine"));
//		etudiantRepositorie.save(new Etudiant(null, "lamyae", "saida"));
		
		
	}

}
