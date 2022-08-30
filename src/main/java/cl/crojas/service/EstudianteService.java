package cl.crojas.service;

import java.util.List;

import cl.crojas.model.Estudiante;

public interface EstudianteService {

	public List<Estudiante> findAll();
	public List<Estudiante> findByRegionCurso(String region, String Curso);
}
