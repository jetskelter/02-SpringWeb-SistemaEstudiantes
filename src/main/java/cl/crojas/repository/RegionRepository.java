package cl.crojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.crojas.model.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

}
