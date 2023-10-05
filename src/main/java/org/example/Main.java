import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення бібліотеки
        Library library = new Library();

        // Додавання предметів до бібліотеки (книги та DVD)
        Book book1 = new Book("Book 1", "B001", "Author 1");
        Book book2 = new Book("Book 2", "B002", "Author 2");
        DVD dvd1 = new DVD("DVD 1", "D001", 120);
        DVD dvd2 = new DVD("DVD 2", "D002", 90);

        library.add(book1);
        library.add(book2);
        library.add(dvd1);
        library.add(dvd2);

        // Реєстрація читачів
        Patron patron1 = new Patron("Max", "P001");
        Patron patron2 = new Patron("Natali", "P002");

        library.registerPatron(patron1);
        library.registerPatron(patron2);

        // Показ списку доступних предметів
        List<Item> availableItems = library.listAvailable();
        System.out.println("Available Items:");
        for (Item item : availableItems) {
            item.displayInfo();
        }

        // Позика предметів читачам
        library.lendItem(patron1, book1);
        library.lendItem(patron2, dvd1);

        // Показ списку взятих предметів
        List<Item> borrowedItems = library.listBorrowed();
        System.out.println("\nBorrowed Items:");
        for (Item item : borrowedItems) {
            item.displayInfo();
        }

        // Повернення предметів у бібліотеку
        library.returnItem(patron1, book1);
        library.returnItem(patron2, dvd1);

        // Повторний показ списку доступних предметів
        availableItems = library.listAvailable();
        System.out.println("\nAvailable Items:");
        for (Item item : availableItems) {
            item.displayInfo();
        }
    }
}
