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
public class Region {
	
	@Id
	@Column(nullable = false, unique = true)
	private Long CODIGO_REGION;
	private String NOMBRE;

}
