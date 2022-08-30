package cl.crojas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.crojas.model.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
	
	@Query(value = "SELECT * FROM ESTUDIANTE E "
			+ " LEFT JOIN CURSO C ON E.CODIGO_CURSO = C.CODIGO_CURSO "
			+ " LEFT JOIN plan_formativo PF ON c.codigo_plan_formativo = pf.codigo_plan_formativo "
			+ " LEFT JOIN COMUNA CO ON e.codigo_comuna = co.codigo_comuna "
			+ " LEFT JOIN REGION R ON co.codigo_region = r.codigo_region "
			+ " WHERE r.codigo_region = :Region AND c.codigo_curso = :Curso",
			nativeQuery = true)
	public List<Estudiante> findByRegionCurso(String Region, String Curso);

}
