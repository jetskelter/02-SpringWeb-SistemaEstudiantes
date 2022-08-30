package cl.crojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.crojas.model.Comuna;

@Repository
public interface ComunaRepository extends JpaRepository<Comuna, Long> {

}
