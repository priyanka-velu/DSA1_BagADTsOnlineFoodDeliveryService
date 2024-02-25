import java.util.List;

public interface Bag {
    void addItem(Item item);
    boolean removeItem(Item item);
    boolean isEmpty();
    int size();
    void clear();
    List<Item> getItems();
}
