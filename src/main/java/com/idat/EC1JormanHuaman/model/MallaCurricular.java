package com.idat.EC1JormanHuaman.model;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Table(name = "MallaCurricular")
@Entity
public class MallaCurricular {
	private Integer idMalla;
	private Integer Año;
	
@OneToOne(mappedBy ="mallaCurricular")
	private Universidad universidad;
@OneToMany(mappedBy = "mallaCurricular")
private List<Curso> curso = new ArrayList<>();
	
	public Integer getIdMallaCurricular() {
		return idMalla;
	}
	public void setIdMallaCurricular(Integer idMallaCurricular) {
		this.idMalla = idMallaCurricular;
	}
	public Integer getAño() {
		return Año;
	}
	public void setAño(Integer año) {
		Año = año;
	}

	
}
