package cl.crojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class PlanFormativo {
	
	@Id
	@Column(nullable = false, unique = true)
	private String CODIGO_PLAN_FORMATIVO;
	private String DESCRIPCION;
	private Integer DURACION_HORAS;
	

}
