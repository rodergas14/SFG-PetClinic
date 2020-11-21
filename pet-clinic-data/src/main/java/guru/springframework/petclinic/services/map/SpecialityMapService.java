package guru.springframework.petclinic.services.map;

import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Speciality;
import guru.springframework.petclinic.services.SpecialityService;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService{
	@Override
	public Set<Speciality> findAll(){
		return super.findAll();
	}
	
	@Override
	public Optional<Speciality> findById(Long Id) {
		return super.findById(Id);
	}
	
	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}
}
