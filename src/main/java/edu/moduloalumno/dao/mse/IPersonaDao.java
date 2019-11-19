package edu.moduloalumno.dao.mse;


import java.util.List;

import edu.moduloalumno.entity.mse.Persona;
import edu.moduloalumno.entity.mse.AperturaConcepto;
import edu.moduloalumno.entity.mse.Formacion;
import edu.moduloalumno.entity.mse.Nivel;

public interface IPersonaDao {
	Persona findOne(String  codigo);

	void updatePersona(Persona persona);
	AperturaConcepto findOneConcepto(Integer numero);
	void saveFormacion(Formacion formacion);
	List<Formacion> findFormacion(Integer id);
	List<Nivel> findNivel();
	void deleteFormacion(Integer formacion);
	
}
