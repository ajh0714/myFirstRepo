package data;
import vo.BookVO;

import java.util.ArrayList;
import java.util.List;

public class BookData {
    public static List<BookVO> bookList = new ArrayList<BookVO>();
    public static void setBook(){
        bookList.add(new BookVO(1,"자바의 정석","2024-12-20","홍길동"));

    }
}
