package guru.springframework.petclinic.services.map;

import java.util.Optional;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.VetService;
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Set<Vet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Optional<Vet> findById(Long Id) {
		return super.findById(Id);
	}
	
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}
}
