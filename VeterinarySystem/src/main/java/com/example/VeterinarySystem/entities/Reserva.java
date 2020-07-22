package com.example.VeterinarySystem.entities;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Reserva {
	public String Codigo_Reserva;
	public Date Fecha_Reserva;
	public String Direccion_Reserva;
	public Date Fecha_Ejecucion_Reserva;
	public String nombre;
	public String apellido;
	public int cantidad_mascotas;
	public String estado;
	public String getCodigo_Reserva() {
		return Codigo_Reserva;
	}
	public void setCodigo_Reserva(String codigo_Reserva) {
		Codigo_Reserva = codigo_Reserva;
	}
	public Date getFecha_Reserva() {
		return Fecha_Reserva;
	}
	public void setFecha_Reserva(Date fecha_Reserva) {
		Fecha_Reserva = fecha_Reserva;
	}
	public String getDireccion_Reserva() {
		return Direccion_Reserva;
	}
	public void setDireccion_Reserva(String direccion_Reserva) {
		Direccion_Reserva = direccion_Reserva;
	}
	public Date getFecha_Ejecucion_Reserva() {
		return Fecha_Ejecucion_Reserva;
	}
	public void setFecha_Ejecucion_Reserva(Date fecha_Ejecucion_Reserva) {
		Fecha_Ejecucion_Reserva = fecha_Ejecucion_Reserva;
	}
	
	
}
