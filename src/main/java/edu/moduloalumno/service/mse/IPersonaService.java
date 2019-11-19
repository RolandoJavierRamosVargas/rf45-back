package edu.moduloalumno.service.mse;

import java.util.List;

import edu.moduloalumno.entity.mse.AperturaConcepto;
import edu.moduloalumno.entity.mse.Formacion;
import edu.moduloalumno.entity.mse.Nivel;
import edu.moduloalumno.entity.mse.Persona;

public interface IPersonaService {
	Persona findOne(String  codigo);

	void updatePersona(Persona persona);
	AperturaConcepto findOneConcepto(Integer id);
	void saveFormacion(Formacion formacion);
	List<Formacion> findFormacion(Integer id);
	List<Nivel> findNivel();
	void deleteFormacion(Integer formacion);
	
}
