package guru.springframework.petclinic.services.map;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.services.OwnerService;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService{
	
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
		return super.save(object.getId(), object);
	}

	@Override
	public List<Owner> findByLastName(String lastName) {

		return hashMap.entrySet().stream()
		.map(entry -> entry.getValue())
		.filter(value -> value.getLastName().equals(lastName))
		.collect(Collectors.toList());

	}

	
}
