import java.util.List;

public interface IManageable {
    void add(Item item); // Додати предмет до колекції
    void remove(Item item); // Видалити предмет із колекції
    List<Item> listAvailable(); // Показати список доступних предметів
    List<Item> listBorrowed(); // Показати список взятих предметів
}
