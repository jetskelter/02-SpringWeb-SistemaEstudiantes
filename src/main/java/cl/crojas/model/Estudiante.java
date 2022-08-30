package cl.crojas.model;


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
public class Estudiante {
	
	@Id
	@Column(nullable = false, unique = true)
	private Long ID_ESTUDIANTE;
	private String RUT;
	private String NOMBRE;
	private String APELLIDO_PAT;
	private String APELLIDO_MAT;
	private String DIRECCION;

	@ManyToOne
	@JoinColumn(name = "CODIGO_COMUNA")
	Comuna comuna;
	
	@ManyToOne
	@JoinColumn(name = "CODIGO_CURSO")
	Curso curso;
	

}
