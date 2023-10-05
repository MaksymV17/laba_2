public class DVD extends Item {
    private int duration; // Тривалість у хвилинах

    // Конструктор з параметрами
    public DVD(String title, String uniqueID, int duration) {
        super(title, uniqueID);
        this.duration = duration;
    }

    // Геттер та сеттер для атрибуту duration
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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

    // Перевизначення методу displayInfo для виведення інформації про DVD
    @Override
    public void displayInfo() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Unique ID: " + getUniqueID());
        System.out.println("Status: " + (isBorrowed() ? "Borrowed" : "Available"));
    }
}
