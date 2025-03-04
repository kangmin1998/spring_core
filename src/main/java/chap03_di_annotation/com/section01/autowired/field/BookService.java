package chap03_di_annotation.com.section01.autowired.field;

import chap03_di_annotation.com.section01.common.BookDAO;
import chap03_di_annotation.com.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Component의 세분화 어노테이션의 한 종류로 Service 계층에서 사용한다.
@Service("bookServiceField")
public class BookService {

    // BookDAO 타입의 bean객체를 이 프로퍼티에 자동으로 주입해준다.
    @Autowired
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }
}
