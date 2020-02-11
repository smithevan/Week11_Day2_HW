import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;

    @Before
    public void setUp() {
        library = new Library("Central Library", 1000);
        book1 = new Book("Jane Eyre", "Charlotte Bronte", "Literature");
    }

    @Test
    public void can_get_number_of_books_in_library_if_empty(){
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void can_add_book_to_library() {
        library.addBook(book1);
        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void can_fill_library() {
        library.fillLibrary();
        assertEquals(1000, library.numberOfBooks());
    }

    @Test
    public void book_is_not_addded_if_library_is_full() {
        library.fillLibrary();
        library.addBook(book1);
        assertEquals(1000, library.numberOfBooks());
    }





}
