package com.example.VeterinarySystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Adminstrador")

public class Administrador extends Persona {
<<<<<<< HEAD
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Usuario;

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	
=======
	   
>>>>>>> branch 'master' of https://github.com/Jeffersonch97/VeterinarySystem.git

}
