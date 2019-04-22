package net.comdava.petproject.service.map;

import net.comdava.petproject.model.Owner;
import net.comdava.petproject.service.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }
}
