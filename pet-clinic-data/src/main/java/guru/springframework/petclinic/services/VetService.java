package guru.springframework.petclinic.services;

import java.util.Set;

import guru.springframework.petclinic.model.Vet;

public interface VetService {
	Vet findById();
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
