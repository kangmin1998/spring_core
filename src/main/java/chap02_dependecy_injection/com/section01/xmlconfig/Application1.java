package chap02_dependecy_injection.com.section01.xmlconfig;

import chap02_dependecy_injection.com.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application1 {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("chap02/section01/xmlconfig/spring-context.xml");

        MemberDTO member = context.getBean(MemberDTO.class);

        System.out.println(member.getPersonalAccount());

        System.out.println(member.getPersonalAccount().deposit(10000));
        System.out.println(member.getPersonalAccount().getBalance());
        System.out.println(member.getPersonalAccount().withDraw(5000));
        System.out.println(member.getPersonalAccount().getBalance());

    }
}
