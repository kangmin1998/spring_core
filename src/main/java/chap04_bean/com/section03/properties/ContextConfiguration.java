package chap04_bean.com.section03.properties;


import chap04_bean.com.common.Beverage;
import chap04_bean.com.common.Bread;
import chap04_bean.com.common.Product;
import chap04_bean.com.common.ShoppingCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
// resource 하위 경로
@PropertySource("chap03/section03/properties/product_info.properties")
public class ContextConfiguration {

    @Value("${bread.carpbread.name}")
    private String carpBreadName;
    @Value("${bread.carpbread.price}")
    private int carpBreadPrice;
    @Value("${beverage.milk.name}")
    private String milkName;
    @Value("${beverage.milk.price}")
    private int milkPrice;
    @Value("${beverage.milk.capacity}")
    private int milkCapacity;

    @Bean
    public Product carpBread() {
        return new Bread(carpBreadName, carpBreadPrice, new Date());
    }

    @Bean
    public Product milk() {
        return new Beverage(milkName, milkPrice, milkCapacity);
    }

    @Bean
    public Product water(@Value("${beverage.water.name:지리산암바수}") String waterName,
                         @Value("${beverage.water.price:3000}") int waterPrice,
                         @Value("${beverage.water.capacity:500}") int waterCapacity) {
        return new Beverage(waterName, waterPrice, waterCapacity);
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart() {
        return new ShoppingCart();
    }

}
