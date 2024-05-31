package mts.homework.starter.service;

import mts.homework.starter.animal.Animal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ActiveProfiles("test")
@SpringBootTest
public class NameServiceTest {
    private static final Set<String> names = Set.of("DogName2", "CatName2", "WolfName2", "SharkName2");

    @Autowired
    private AnimalService animalService;

    @Test
    void call_success() {
        Animal animal = animalService.createAnimal();

        assertNotNull(animal.getCharacter());
        assertNotNull(animal.getBreed());
        assertNotNull(animal.getCost());
        assertNotNull(animal.getBirthDate());
        assertTrue(names.contains(animal.getName()));
    }
}
