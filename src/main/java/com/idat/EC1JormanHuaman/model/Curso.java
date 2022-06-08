package com.idat.EC1JormanHuaman.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table (name = "Curso")
@Entity
public class Curso {
	private Integer idCurso;
	private String curso;
	private String descripcion;
	@OneToMany
	@JoinColumn(
			name = "id_malla" ,
			nullable=false, 
			unique=true, 
			foreignKey = @ForeignKey(foreignKeyDefinition =
			"foreign key (id_malla) references MallaCurricular(id_malla)")
			)
	@ManyToMany(mappedBy ="Curso", cascade ={CascadeType.PERSIST, CascadeType.MERGE})
	private List<Profesor> profesor= new ArrayList<>();

	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
