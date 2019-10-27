package edu.moduloalumno.dao.mse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.entity.mse.AlumnoMse;
import edu.moduloalumno.entity.mse.Persona;
import edu.moduloalumno.rowmapper.mse.AlumnoMseRowMapper;
import edu.moduloalumno.rowmapper.mse.PersonaRowMapper;


@Transactional
@Repository
public class PersonaDaoImpl implements IPersonaDao{

	@Autowired
	private JdbcTemplate jdbcTemplate; 
	
	@Override
	public Persona findOne(String codigo) {
		String sql="select persona_id,persona_dni,persona_apaterno,persona_amaterno,persona_nombres,persona_fnacimiento,persona_edad,persona_ubigeo_nac,persona_nhijos,ecivil_id,persona_ultimo,estado_id from PERSONA WHERE PERSONA_NOMBRES=(SELECT NOM_ALUMNO FROM ALUMNO_PROGRAMA WHERE cod_alumno='"+codigo+"');";
		System.out.println(sql);
		//RowMapper<Alumno2> rowMapper = new BeanPropertyRowMapper<Alumno2>(Alumno2.class);
		RowMapper<Persona> rowMapper = new PersonaRowMapper();
		Persona persona = this.jdbcTemplate.query(sql, rowMapper).get(0);
		System.out.println(persona);
		return persona;
		
		
		
		
	}

	@Override
	public void updateAlumno(Persona persona) {
		
		
	}

}
