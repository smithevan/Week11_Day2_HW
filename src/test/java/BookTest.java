import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before(){
        book1 = new Book("Jane Eyre", "Charlotte Bronte", "Literature");
    }

    @Test
    public void test_if_book_has_title(){
        assertEquals("Jane Eyre", book1.getTitle());
    }

    @Test
    public void test_if_book_has_author(){
        assertEquals("Charlotte Bronte", book1.getAuthor());
    }

    @Test
    public void test_if_book_has_genre(){
        assertEquals("Literature", book1.getGenre());
    }

}
