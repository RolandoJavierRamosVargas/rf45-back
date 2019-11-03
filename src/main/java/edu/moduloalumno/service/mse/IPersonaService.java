package edu.moduloalumno.service.mse;

import edu.moduloalumno.entity.mse.Persona;

public interface IPersonaService {
	Persona findOne(String  codigo);

	void updatePersona(Persona persona);
	
}
