package mts.homework.starter.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NameService {
    @Value("${application.animal.possible-names}")
    String[] animalNames;

    public String getRandomName() {
        return animalNames[new Random().nextInt(0, animalNames.length)];
    }
}
