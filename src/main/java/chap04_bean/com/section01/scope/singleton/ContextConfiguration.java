package chap04_bean.com.section01.scope.singleton;

import chap04_bean.com.common.Beverage;
import chap04_bean.com.common.Bread;
import chap04_bean.com.common.Product;
import chap04_bean.com.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread() {
        return new Bread("붕어빵", 1000, new Date());
    }

    @Bean
    public Product milk() {
        return new Beverage("딸기우유", 1500, 500);
    }

    @Bean
    public Product water() {
        return new Beverage("지리산암반수", 3000, 500);
    }

    @Bean
    @Scope ("singleton") // singleton : 명시적으로 작성하지 않아도 기본 설정이 singleton 이다.
    public ShoppingCart cart() {
        return new ShoppingCart();
    }




}
