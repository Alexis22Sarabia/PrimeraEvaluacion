package com.idat.EC1JormanHuaman.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name = "Universidades")
@Entity
public class Universidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private MallaCurricular mallaCurricular;
	
	private Integer idUniversidad;
	private String Universidad;
	@OneToOne
	@JoinColumn(name = "id_malla" ,
	nullable=false, 
	unique=true, 
	foreignKey = @ForeignKey(foreignKeyDefinition =
	"foreign key (id_malla) references MallaCurricular(id_malla)"))
	public Integer getIdUniversidad() {
		return idUniversidad;
	}
	public void setIdUniversidad(Integer idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	public String getUniversidad() {
		return Universidad;
	}
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}

}
