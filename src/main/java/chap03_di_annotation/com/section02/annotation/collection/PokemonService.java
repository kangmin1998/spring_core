package chap03_di_annotation.com.section02.annotation.collection;

import chap03_di_annotation.com.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceCollection")
public class PokemonService {

    // 1. List 타입으로 주입
    private List<Pokemon> pokemonList;

    @Autowired
    public PokemonService(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }


    public void pokemonAttack() {
        for( int i = 0; i < pokemonList.size(); i++) {
            Pokemon pokemon = pokemonList.get(i);
            pokemon.attack();
        }
//        for (Pokemon pokemon : pokemonList) {
//            pokemon.attack();  // 각 Pokemon 객체에 대해 attack() 메서드 호출
//        }
    }

    // 2. Map 타입으로 주입

//    private Map<String, Pokemon> pokemonMap;
//
//    @Autowired
//    private PokemonService(Map<String,Pokemon> pokemonMap) {
//        this.pokemonMap = pokemonMap;
//    }
//
//    public  void pokemonAttack() {
////        for(Map.Entry<String, Pokemon> entry : pokemonMap.entrySet()) {
////            System.out.println("key : " + entry.getKey());
////            System.out.println("공격 : " );
////            entry.getValue().attack();
////        }
//
//        pokemonMap.forEach((k, v) -> {
//            System.out.println("key : " + k);
//            System.out.print("공격 : ");
//            v.attack();
//        });
//    }


}


