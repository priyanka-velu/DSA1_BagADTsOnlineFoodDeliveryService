import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Bag {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void clear() {
        items.clear();
    }

    @Override
    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}

