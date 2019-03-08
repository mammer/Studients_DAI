package com.probuilders.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Etudiant {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;

}
