package guru.springframework.petclinic.services.map;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.services.OwnerService;
import guru.springframework.petclinic.services.PetService;
import guru.springframework.petclinic.services.PetTypeService;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService{
	
	private final PetTypeService petTypeService;
	private final PetService petService;
	
	public OwnerMapService(PetTypeService petTypeService,PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}
	
	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	
	@Override
	public Optional<Owner> findById(Long Id) {
		return super.findById(Id);
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		Owner savedOwner = null;
		if(object != null) {
			if(object.getPets() != null) {
				object.getPets().forEach(pet ->{
					if(pet.getPetType() != null) {
						if(pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}else {
						throw new RuntimeException("Pet Type is required");
					}
					
					if(pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			
			
			return super.save(object);
		}else {
			return null;
		}
		
		
		
	}

	@Override
	public List<Owner> findByLastName(String lastName) {

		return hashMap.entrySet().stream()
		.map(entry -> entry.getValue())
		.filter(value -> value.getLastName().equals(lastName))
		.collect(Collectors.toList());

	}

	
}
