package cl.crojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.crojas.model.Region;
import cl.crojas.repository.RegionRepository;

@Service
public class RegionServiceImp implements RegionService {
	
	@Autowired
	private RegionRepository regionRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Region> findAll() {
		return regionRepository.findAll();
	}

}
