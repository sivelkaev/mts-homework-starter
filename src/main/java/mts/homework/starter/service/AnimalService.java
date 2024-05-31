package mts.homework.starter.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mts.homework.starter.animal.Animal;
import mts.homework.starter.animal.pet.species.Cat;
import mts.homework.starter.animal.pet.species.Dog;
import mts.homework.starter.animal.predator.species.Shark;
import mts.homework.starter.animal.predator.species.Wolf;
import mts.homework.starter.config.NameProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

@Slf4j
@Service
@RequiredArgsConstructor
public class AnimalService {
    List<String> animalTypeList = List.of("Wolf", "Shark", "Dog", "Cat");

    private final NameProperties nameProperties;

    public Animal createAnimal() {
        String animalType = animalTypeList.get(new Random().nextInt(0, 4));

        switch (animalType) {
            case "Wolf":
                Wolf wolf = new Wolf("wolfBreed", getRandomName(), new Random().nextDouble(), "wolfCharacter", getRandomLocalDate());
                wolf.printInfo();
                return wolf;
            case "Shark":
                Shark shark = new Shark("sharkBreed", getRandomName(), new Random().nextDouble(), "sharkCharacter", getRandomLocalDate());
                shark.printInfo();
                return shark;
            case "Dog":
                Dog dog = new Dog("dogBreed", getRandomName(), new Random().nextDouble(), "dogCharacter", getRandomLocalDate());
                dog.printInfo();
                return dog;
            case "Cat":
                Cat cat = new Cat("catBreed", getRandomName(), new Random().nextDouble(), "catCharacter", getRandomLocalDate());
                cat.printInfo();
                return cat;
            default:
                return null;
        }
    }

    private String getRandomName() {
        String result = null;

        var names = nameProperties.getNames();

        if (names == null) {
            names = Set.of("WolfName3", "SharkName3", "DogName3", "CatName3");
        }

        Iterator<String> iterator = names.iterator();
        int currentIndex = 0;
        int randomIndex = new Random().nextInt(names.size());

        while (iterator.hasNext()) {
            var name = iterator.next();
            if (currentIndex == randomIndex) {
                result = name;
                break;
            }
            currentIndex++;
        }

        return result;
    }

    private LocalDate getRandomLocalDate() {
        long minDay = LocalDate.of(2000, 1, 1).toEpochDay();
        long maxDay = LocalDate.now().toEpochDay();
        long randomDay = new Random().nextLong(minDay, maxDay);
        return LocalDate.ofEpochDay(randomDay);
    }
}
