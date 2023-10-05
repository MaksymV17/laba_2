import java.util.ArrayList;
import java.util.List;

public class Library implements IManageable {
    private List<Item> items; // Список предметів у бібліотеці
    private List<Patron> patrons; // Список зареєстрованих читачів

    // Конструктор без параметрів
    public Library() {
        this.items = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Реалізація методу для додавання предмета до бібліотеки
    @Override
    public void add(Item item) {
        items.add(item);
    }

    // Реалізація методу для видалення предмета із бібліотеки
    @Override
    public void remove(Item item) {
        items.remove(item);
    }

    // Реалізація методу для показу списку доступних предметів
    @Override
    public List<Item> listAvailable() {
        List<Item> availableItems = new ArrayList<>();
        for (Item item : items) {
            if (!item.isBorrowed()) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }

    // Реалізація методу для показу списку взятих предметів
    @Override
    public List<Item> listBorrowed() {
        List<Item> borrowedItems = new ArrayList<>();
        for (Item item : items) {
            if (item.isBorrowed()) {
                borrowedItems.add(item);
            }
        }
        return borrowedItems;
    }

    // Реєстрація нового читача
    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    // Видача предмета читачу
    public void lendItem(Patron patron, Item item) {
        if (patrons.contains(patron) && items.contains(item) && !item.isBorrowed()) {
            patron.borrow(item);
            item.borrowItem();
        }
    }

    // Повернення предмета бібліотеці
    public void returnItem(Patron patron, Item item) {
        if (patrons.contains(patron) && items.contains(item) && patron.getBorrowedItems().contains(item)) {
            patron.returnItem(item);
            item.returnItem();
        }
    }
}
