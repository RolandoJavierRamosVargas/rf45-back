package edu.moduloalumno.api.mse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.mse.AlumnoMse;
import edu.moduloalumno.entity.mse.Persona;
import edu.moduloalumno.service.mse.IAlumnoService;
import edu.moduloalumno.service.mse.IPersonaService;

@RestController
@RequestMapping("/mse/persona")
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@RequestMapping(value = "/buscar/{idPersona}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Persona> getAlumnoById(@PathVariable("idPersona") String codAlumn) {
		System.out.println("ENTRO A Persona + codigo= " + codAlumn);
		Persona persona = null;
		try {
			persona = service.findOne(codAlumn);
			System.out.println(persona);
			System.out.println("paso persona");
			if (persona == null) {
				persona = null;
			}
			
		} catch (Exception e) {
			
			return new ResponseEntity<Persona>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Persona> updatePersona(@RequestBody Persona persona) {
		System.out.println("ingreso a update persona");
		System.out.println(persona);
		try {
			service.updatePersona(persona);
		}
		catch(Exception e) {
			return new ResponseEntity<Persona>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}
}
