package guru.springframework.petclinic.services;

import java.util.List;

import guru.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	List<Owner> findByLastName(String lastName);
	
}
