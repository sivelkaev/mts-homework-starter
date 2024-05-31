package mts.homework.starter.animal.pet;

import mts.homework.starter.animal.AbstractAnimal;

import java.time.LocalDate;

public class Pet extends AbstractAnimal {
    public Pet(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}
