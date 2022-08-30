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
public class Comuna {

	@Id
	@Column(nullable = false, unique = true)
	private Long CODIGO_COMUNA;
	private String NOMBRE;
	
	@ManyToOne
	@JoinColumn(name = "CODIGO_REGION")
	Region region;
	
}
