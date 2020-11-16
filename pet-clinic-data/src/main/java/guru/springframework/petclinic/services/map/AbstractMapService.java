package guru.springframework.petclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

import javax.management.RuntimeErrorException;

import guru.springframework.petclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {
	protected Map<Long, T> hashMap = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<T>(hashMap.values());
	}
	
	Optional<T> findById(ID id) {
		return Optional.ofNullable(hashMap.get(id));
	}
	
	T save(T object) {
		if(object != null) {
			if(object.getId() == null) {
				object.setId(getNextId());
			}
			
			hashMap.put(object.getId(), object);
		}else {
			throw new RuntimeException("Object cannot be null");
		}
		return object;
	}
	
	void deleteById(ID id) {
		hashMap.remove(id);
	}
	
	void delete(T object) {
		hashMap.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	
	private Long getNextId() {
		
		Long nextId = null;
		try {
			nextId =	Collections.max(hashMap.keySet()) + 1;
		}catch(NoSuchElementException e) {
			nextId = 1L;
		}
		return nextId;
	}
}
