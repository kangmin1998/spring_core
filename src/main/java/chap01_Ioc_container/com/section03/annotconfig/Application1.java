package chap01_Ioc_container.com.section03.annotconfig;

import chap01_Ioc_container.com.common.MemberDAO;
import chap01_Ioc_container.com.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application1 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        // spring container에서 생성된 bean들의 이름을 배열로 반환
        String[] beanNames = context.getBeanDefinitionNames();
        for(int i = 0; i < beanNames.length; i++) {
            System.out.println("beanName : " + beanNames[i]);
        }

        MemberDAO memberDAO = context.getBean("memberDAO", MemberDAO.class);
        System.out.println(memberDAO.selectMember(1));
        System.out.println(memberDAO.insertMember(new MemberDTO(3,"user03", "pass03", "양")));
        System.out.println(memberDAO.selectMember(3));
    }
}
