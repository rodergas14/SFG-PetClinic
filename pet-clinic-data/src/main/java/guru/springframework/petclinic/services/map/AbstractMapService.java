package guru.springframework.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public abstract class AbstractMapService<T,ID> {
	protected Map<ID, T> hashMap = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<T>(hashMap.values());
	}
	
	Optional<T> findById(ID id) {
		return Optional.ofNullable(hashMap.get(id));
	}
	
	T save(ID id, T object) {
		
		hashMap.put(id, object);
		
		return object;
	}
	
	void deleteById(ID id) {
		hashMap.remove(id);
	}
	
	void delete(T object) {
		hashMap.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
}
