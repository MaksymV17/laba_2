import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DVDTest {
    private DVD dvd;

    @Before
    public void setUp() {
        dvd = new DVD("Test DVD", "D001", 120);
    }

    @Test
    public void testBorrowItem() {
        assertFalse(dvd.isBorrowed());
        dvd.borrowItem();
        assertTrue(dvd.isBorrowed());
    }

    @Test
    public void testReturnItem() {
        dvd.borrowItem();
        assertTrue(dvd.isBorrowed());
        dvd.returnItem();
        assertFalse(dvd.isBorrowed());
    }
}
