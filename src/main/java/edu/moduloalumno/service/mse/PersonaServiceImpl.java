package edu.moduloalumno.service.mse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.mse.IPersonaDao;
import edu.moduloalumno.entity.mse.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDao personaDao;
	
	@Override
	public Persona findOne(String codigo) {
		return personaDao.findOne(codigo);
	}

	@Override
	public void updatePersona(Persona persona) {
		personaDao.updatePersona(persona);
		
	}

}
