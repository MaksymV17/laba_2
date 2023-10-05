import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PatronTest {
    private Patron patron;
    private Item book;

    @Before
    public void setUp() {
        patron = new Patron("John", "P001");
        book = new Book("Test Book", "B001", "Test Author");
    }

    @Test
    public void testBorrowItem() {
        patron.borrow(book);
        assertTrue(patron.getBorrowedItems().contains(book));
    }

    @Test
    public void testReturnItem() {
        patron.borrow(book);
        assertTrue(patron.getBorrowedItems().contains(book));
        patron.returnItem(book);
        assertFalse(patron.getBorrowedItems().contains(book));
    }
}
