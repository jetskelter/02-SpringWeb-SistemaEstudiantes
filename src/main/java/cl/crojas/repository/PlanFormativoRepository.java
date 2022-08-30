package cl.crojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.crojas.model.PlanFormativo;

@Repository
public interface PlanFormativoRepository extends JpaRepository<PlanFormativo, String> {

}
