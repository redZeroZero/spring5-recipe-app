package guru.springframework.spring5recipeapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5RecipeAppApplication {

    Logger LOGGER = LoggerFactory.getLogger(Spring5RecipeAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Spring5RecipeAppApplication.class, args);
    }


}
