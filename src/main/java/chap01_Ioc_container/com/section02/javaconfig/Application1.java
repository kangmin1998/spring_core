package chap01_Ioc_container.com.section02.javaconfig;

import chap01_Ioc_container.com.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application1 {
    public static void main(String[] args) {

        // 생성자에 @Configuration 어노테이션이 달린 설정 클래스의 메타 정보를 전달한다.
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO member = context.getBean("member", MemberDTO.class);

        System.out.println(member);


    }
}
