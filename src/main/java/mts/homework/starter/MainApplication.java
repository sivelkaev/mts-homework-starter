package mts.homework.starter;

import mts.homework.starter.service.AnimalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(MainApplication.class, args);
        /*var service = ctx.getBean(AnimalService.class);
        var an = service.createAnimal();
        System.out.println(an.getName());*/
    }
}
