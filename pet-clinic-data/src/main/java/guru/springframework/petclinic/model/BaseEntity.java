package guru.springframework.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -6852319477180547150L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
