package cl.crojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.crojas.model.Estudiante;
import cl.crojas.repository.EstudianteRepository;

@Service
public class EstudianteServiceImp implements EstudianteService {

	@Autowired
	private EstudianteRepository estudianteRepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Estudiante> findAll() {
		
		return estudianteRepository.findAll();
	}


	@Override
	@Transactional(readOnly = true)
	public List<Estudiante> findByRegionCurso(String Region, String Curso) {
		
		return estudianteRepository.findByRegionCurso(Region, Curso);
	}

}
