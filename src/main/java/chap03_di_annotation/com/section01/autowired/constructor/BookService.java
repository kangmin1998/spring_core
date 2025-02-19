package chap03_di_annotation.com.section01.autowired.constructor;

import chap03_di_annotation.com.section01.common.BookDAO;
import chap03_di_annotation.com.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceConstructor")
public class BookService {

    private BookDAO bookDAO;


    // BookDAO 타입의 Bean 객체를 생성자에 자동으로 주입해준다.
    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
    // 생성자가 한 개뿐이라면 @Autowired 어노테이션을 생략해도 자동으로 생성자 주입이 동작한다.
    // 단 1개 이상일 경우 명시적으로 작성해야 한다.
    public BookService() {
    }

    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }
}
