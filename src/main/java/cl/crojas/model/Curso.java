package cl.crojas.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Curso {

	@Id
	@Column(nullable = false, unique = true)
	private String CODIGO_CURSO;
	private Date FECHA_INICIO;
	private Date FECHA_TERMNO;
	private Long CODIGO_COMUNA;
	
	@ManyToOne
	@JoinColumn(name = "CODIGO_PLAN_FORMATIVO")
	PlanFormativo planFormativo;
	
	
}
