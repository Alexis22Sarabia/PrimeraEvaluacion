package com.idat.EC1JormanHuaman.service;

import java.util.List;

import com.idat.EC1JormanHuaman.model.Profesor;

public interface ProfesorService {
	

		void guardarProfesor(Profesor profesor);
		void actualizarProfesor(Profesor profesor);
		void eliminarProfesor(Integer id);
		List<Profesor> listarProfesor();
		Profesor obtenerProfesorId(Integer id);
		
	


}
