import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTests {
    private Library library;
    private Patron patron1;
    private Patron patron2;

    @Before
    public void setUp() {
        library = new Library();
        patron1 = new Patron("John", "P001");
        patron2 = new Patron("Alice", "P002");
    }

    @Test
    public void testRegisterPatron() {
        library.registerPatron(patron1);
        assertTrue(library.getPatrons().contains(patron1));
    }

    @Test
    public void testPatronData() {
        assertEquals("John", patron1.getName());
        assertEquals("P001", patron1.getID());
    }
}
