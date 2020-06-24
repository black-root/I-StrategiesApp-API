package com.strategies.sv.strategies.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdPersona")
	private Integer idPersona;

	@Column(name = "PrimerNombre", nullable = false)
	private String primerNombre;

	@Column(name = "SegundoNombre", nullable = true)
	private String segundoNombre;

	@Column(name = "PrimerApellido", nullable = false)
	private String primerApellido;

	@Column(name = "SegundoApellido", nullable = true)
	private String segundoApellido;
	
	@Column(name = "FechaNacimiento", nullable = false)
	private Date fechaNacimiento;
	
	@Column(name = "Sexo", nullable = false)
	private Integer sexo;
	
	@Column(name = "InformacionAdicional", nullable = true)
	private String informacionAdicional;

	public Persona() {}
	
	public Persona(Integer idPersona, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, Date fechaNacimiento, Integer sexo, String informacionAdicional) {
		super();
		this.idPersona = idPersona;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.informacionAdicional = informacionAdicional;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public String getInformacionAdicional() {
		return informacionAdicional;
	}

	public void setInformacionAdicional(String informacionAdicional) {
		this.informacionAdicional = informacionAdicional;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre
				+ ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", fechaNacimiento="
				+ fechaNacimiento + ", sexo=" + sexo + ", informacionAdicional=" + informacionAdicional + "]";
	}
	
	
	
	
}
