package net.comdava.petproject.bootstrap;

import net.comdava.petproject.model.Owner;
import net.comdava.petproject.model.Pet;
import net.comdava.petproject.model.PetType;
import net.comdava.petproject.model.Vet;
import net.comdava.petproject.service.OwnerService;
import net.comdava.petproject.service.PetTypeService;
import net.comdava.petproject.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private  final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Adog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Acat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("address 1");
        owner1.setCity("New York");
        owner1.setTelephone("01234567");
        ownerService.save(owner1);

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("NameDog1");
        owner1.getPets().add(mikesPet);


        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("address 2");
        owner2.setCity("Boston");
        owner2.setTelephone("9845672");
        ownerService.save(owner2);

        Pet onesCat = new Pet();
        onesCat.setName("JustACat1");
        onesCat.setOwner(owner2);
        onesCat.setPetType(savedCatPetType);
        onesCat.setBirthDate(LocalDate.now());
        owner2.getPets().add(onesCat);


        System.out.println("Owners loaded...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Vets loaded...");
    }
}
