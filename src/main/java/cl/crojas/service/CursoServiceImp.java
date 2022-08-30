package cl.crojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.crojas.model.Curso;
import cl.crojas.repository.CursoRepository;

@Service
public class CursoServiceImp implements CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAll() {
		
		return cursoRepository.findAll();
	}

}
