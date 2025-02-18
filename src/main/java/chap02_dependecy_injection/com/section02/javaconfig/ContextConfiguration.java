package chap02_dependecy_injection.com.section02.javaconfig;

import chap02_dependecy_injection.com.common.Account;
import chap02_dependecy_injection.com.common.MemberDTO;
import chap02_dependecy_injection.com.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator() {
        return new PersonalAccount(20, "110-390-811477");
    }

    @Bean
    public MemberDTO memberDTO() {
        // 생성자 주입
        // MemberDTO 생성자를 통해 Account를 생성하는 메소드를 호출한 리턴값을 전달하여 bean 조립
        // return new MemberDTO(1, "코알라", "010-5884-8494", "koala@gmail.com",accountGenerator());

        // setter 주입
        // setter를 통해 Account를 생성하는 메소드를 호출한 리턴값을 전달하여 bean 조립


        MemberDTO member = new MemberDTO();

        member.setSequence(1);
        member.setName("호랑이");
        member.setPhone("010-7777-7777");
        member.setEmail("tiger@gmail.com");
        member.setPersonalAccount(accountGenerator());
        return member;
    }
}
