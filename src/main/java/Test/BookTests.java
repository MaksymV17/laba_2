import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTests {
    private Book book;

    @Before
    public void setUp() {
        book = new Book("Test Book", "B001", "Test Author");
    }

    @Test
    public void testBorrowItem() {
        book.borrowItem();
        assertTrue(book.isBorrowed());
    }

    @Test
    public void testReturnItem() {
        book.borrowItem();
        assertTrue(book.isBorrowed());
        book.returnItem();
        assertFalse(book.isBorrowed());
    }

    @Test
    public void testBookInfo() {
        String expectedInfo = "Title: Test Book\nAuthor: Test Author\nUnique ID: B001\nBorrowed: false";
        assertEquals(expectedInfo, book.displayInfo());
    }
}
