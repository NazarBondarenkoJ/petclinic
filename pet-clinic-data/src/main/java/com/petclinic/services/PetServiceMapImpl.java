package com.petclinic.services;

import com.petclinic.model.Pet;
import com.petclinic.services.map.AbstractMapService;

import java.util.Set;

public class PetServiceMapImpl extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
}
