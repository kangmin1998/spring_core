package chap03_di_annotation.com.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Pikachu implements Pokemon{
    @Override
    public void attack() {
        System.out.println("피카츄 백반볼트⚡⚡⚡");
    }
}
