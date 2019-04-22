package net.comdava.petproject.service.map;

import net.comdava.petproject.model.Pet;
import net.comdava.petproject.service.CrudService;
import java.util.Set;

public class PetMapService extends AbstractMapService<Pet,Long>  implements CrudService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(),pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }
}
