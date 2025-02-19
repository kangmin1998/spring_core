package chap03_di_annotation.com.section02.annotation.qualifier;

import chap03_di_annotation.com.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

    // @Qualifier 어노테이션은 여러 개 빈 객체중에서 득정 객체를 이름으로 지정하는 어노테이션이다.
    // @primary 어노테이션은 함께 쓰였을 때 @Qualifier가 우선으로 연결된다.

    @Autowired
    //@Qualifier("pikachu")
    private Pokemon pokemon;

    // 생성자 주입 방식
//    @Autowired
//    public PokemonService(@Qualifier("squirtle")/* squirtle은 맨앞 S 소문자로 가능*/ Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
