import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String ID; // Унікальний ідентифікатор читача
    private List<Item> borrowedItems; // Список взятих елементів

    // Конструктор з параметрами
    public Patron(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.borrowedItems = new ArrayList<>();
    }

    // Геттери та сеттери для атрибутів
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<Item> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    // Метод для додавання елемента до списку взятих елементів
    public void borrow(Item item) {
        borrowedItems.add(item);
    }

    // Метод для видалення елемента зі списку взятих елементів
    public void returnItem(Item item) {
        borrowedItems.remove(item);
    }
}
