package chap03_di_annotation.com.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary : @Autowired 로 동일한 타입의 여러 빈을 찾게 되는 경우 자동으로 연결 우선시 할 타입으로 설정
// 동일한 타입의 클래스 중 한개만 @primary 어노테이션을 사용할 수 있다.
@Primary
public class Charmander implements Pokemon{
    @Override
    public void attack() {
        System.out.println("파이리 불꽃 공격🔥🔥🔥🔥");
    }
}
