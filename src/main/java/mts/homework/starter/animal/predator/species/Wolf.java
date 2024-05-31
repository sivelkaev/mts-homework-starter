package mts.homework.starter.animal.predator.species;

import mts.homework.starter.animal.predator.Predator;

import java.time.LocalDate;

public class Wolf extends Predator {
    public Wolf(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}
