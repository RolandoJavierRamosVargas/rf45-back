package edu.moduloalumno.dao.mse;

import java.util.List;

import edu.moduloalumno.entity.mse.Persona;

public interface IPersonaDao {
	Persona findOne(String  codigo);

	void updateAlumno(Persona persona);
	
	
}
