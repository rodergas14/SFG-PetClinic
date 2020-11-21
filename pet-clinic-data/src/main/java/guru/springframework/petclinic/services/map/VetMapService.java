package guru.springframework.petclinic.services.map;

import java.util.Optional;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Speciality;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.SpecialityService;
import guru.springframework.petclinic.services.VetService;
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService{
	
	private final SpecialityService speacilityService;

	public VetMapService(SpecialityService speacilityService) {
		this.speacilityService = speacilityService;
	}

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
		
		if(object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(speciality ->{
				if(speciality.getId() == null) {
					Speciality savedSpeciality = speacilityService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
				
			});
		}
		
		return super.save(object);
	}
}
