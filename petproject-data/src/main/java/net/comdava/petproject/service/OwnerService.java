package net.comdava.petproject.service;
import net.comdava.petproject.model.Owner;


public interface OwnerService extends net.comdava.petproject.service.CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
