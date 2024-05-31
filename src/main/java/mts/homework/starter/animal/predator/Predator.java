package mts.homework.starter.animal.predator;

import mts.homework.starter.animal.AbstractAnimal;

import java.time.LocalDate;

public class Predator extends AbstractAnimal {
    public Predator(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}
