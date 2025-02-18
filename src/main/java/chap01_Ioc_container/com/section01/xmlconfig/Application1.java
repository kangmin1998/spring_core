package chap01_Ioc_container.com.section01.xmlconfig;

import chap01_Ioc_container.com.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application1 {
    public static void main(String[] args) {

        // xml 컨피그 방식!
        // ApplicationContext 생성할 수 있다.
        ApplicationContext context = new GenericXmlApplicationContext("chap01/section01/xmlconfig/spring-context.xml");

        // 1. bean의 id를 이용해서 bean을 가져오는 방법
        // MemberDTO member = (MemberDTO)context.getBean("member");

        // 2.bean의 클래스의 메타 정보를 전달하여 가져오는 방법
        // MemberDTO member = context.getBean(MemberDTO.class);

        // 3.bean의 id 와 클래스 메타정보를 전달하여 가져오는 방법 (둘다 가져옴)
        MemberDTO member = context.getBean("member", MemberDTO.class);

        System.out.println(member);


    }
}
