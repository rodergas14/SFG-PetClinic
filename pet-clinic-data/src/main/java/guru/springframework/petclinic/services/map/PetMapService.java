package guru.springframework.petclinic.services.map;

import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.services.PetService;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService{

	
	@Override
	public Set<Pet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Optional<Pet> findById(Long Id) {
		return super.findById(Id);
	}
	
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}


}
