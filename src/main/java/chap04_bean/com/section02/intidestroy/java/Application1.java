package chap04_bean.com.section02.intidestroy.java;

import chap04_bean.com.common.Beverage;
import chap04_bean.com.common.Bread;
import chap04_bean.com.common.Product;
import chap04_bean.com.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application1 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
//        for(int i = 0; i < beanNames.length; i++) {
//            System.out.println("beanName : " + beanNames[i]);
//        }

        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        /* 첫 번째 손님이 쇼핑 카드를 꺼내서 붕어빵과 우류를 담는다. */
        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
        cart1.addItem(carpBread);
        cart1.addItem(milk);
        System.out.println("cart1 : " + cart1.getItems());

        /* 두 번째 손님이 쇼핑 카트를 꺼낸다. */
        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addItem(water);

        System.out.println("cart2 : " + cart2.getItems());

        // init 메소드는 빈 객체 생성 시점에 동작하므로 바로 확인할 수 있지만,
        // destroy 메소드는 빈 객체 소멸 시점에 동작 하므로 컨테이너가 종료되지 않을 경우 확인할 수 없다.
        // 강제로 컨테이너를 종료 시키면 확인할 수 있다.
        ((AnnotationConfigApplicationContext)context).close();



    }
}
