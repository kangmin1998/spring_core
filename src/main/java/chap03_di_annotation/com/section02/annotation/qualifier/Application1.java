package chap03_di_annotation.com.section02.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("chap03_di_annotation.com.section02");

        PokemonService pokemonService = context.getBean("pokemonServiceQualifier", PokemonService.class);

        pokemonService.pokemonAttack();
    }
}
