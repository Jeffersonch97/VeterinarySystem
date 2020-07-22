package com.example.VeterinarySystem.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Promocion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Nombre;
	private String Imagen;

}
