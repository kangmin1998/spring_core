package chap03_di_annotation.com.section02.annotation.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application1 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("chap03_di_annotation.com.section02");

        String[] beanNames = context.getBeanDefinitionNames();
        for(int i = 0; i < beanNames.length; i++) {
            System.out.println(beanNames[i]);
        }

        PokemonService pokemonService = context.getBean("pokemonServicePrimary", PokemonService.class);

        pokemonService.pokemonAttack();
    }
}
