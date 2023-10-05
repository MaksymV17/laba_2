public class Book extends Item {
    private String author;

    // Конструктор з параметрами
    public Book(String title, String uniqueID, String author) {
        super(title, uniqueID);
        this.author = author;
    }

    // Геттер та сеттер для атрибуту author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Перевизначення методів borrowItem та returnItem з Item
    @Override
    public void borrowItem() {
        super.borrowItem(); // Викликаємо метод базового класу для позначення як взятий в позику
    }

    @Override
    public void returnItem() {
        super.returnItem(); // Викликаємо метод базового класу для позначення як повернутий
    }

    // Перевизначення методу displayInfo для виведення інформації про книгу
    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Unique ID: " + getUniqueID());
        System.out.println("Status: " + (isBorrowed() ? "Borrowed" : "Available"));
    }
}
