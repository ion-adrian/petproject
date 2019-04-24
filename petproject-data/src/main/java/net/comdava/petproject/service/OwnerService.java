package net.comdava.petproject.service;
import net.comdava.petproject.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
