package chap03_di_annotation.com.section01.autowired.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application1 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("chap03_di_annotation.com.secation01");

        BookService bookService = context.getBean("bookServiceConstructor", BookService.class);

        // 전체 도서 목록 조회 후 출력 확인
        bookService.selectAllBooks().forEach(System.out::println);

        // 도서 번호 도서 조회 후 출력 확인
        System.out.println(bookService.searchBookBySequence(1));
        System.out.println(bookService.searchBookBySequence(2));
    }

}


