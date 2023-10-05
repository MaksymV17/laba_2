public abstract class Item {
    private String title;
    private String uniqueID;
    private boolean isBorrowed;

    // Конструктор з параметрами
    public Item(String title, String uniqueID) {
        this.title = title;
        this.uniqueID = uniqueID;
        this.isBorrowed = false; // По замовчуванню елемент не взятий в позику
    }

    // Геттери та сеттери для атрибутів
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    // Метод, який позначає елемент як взятий в позику
    public void borrowItem() {
        isBorrowed = true;
    }

    // Метод, який позначає елемент як повернутий
    public void returnItem() {
        isBorrowed = false;
    }

    // Абстрактний метод, який буде реалізований в підкласах
    public abstract void displayInfo();
}
