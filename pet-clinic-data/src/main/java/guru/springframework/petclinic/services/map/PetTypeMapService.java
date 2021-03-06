package guru.springframework.petclinic.services.map;

import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.model.PetType;
import guru.springframework.petclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService{

	@Override
	public Set<PetType> findAll(){
		return super.findAll();
	}
	
	@Override
	public Optional<PetType> findById(Long Id) {
		return super.findById(Id);
	}
	
	@Override
	public void delete(PetType object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public PetType save(PetType object) {
		return super.save(object);
	}

}
