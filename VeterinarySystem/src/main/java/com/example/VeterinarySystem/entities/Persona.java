package com.example.VeterinarySystem.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Persona")

public class Persona {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private String Cedula;
private String Nombre;
private String Apellido;
private String Genero;
private String Usuario;
private String Contrasenia;
private String String;

}
