import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Item, Integer> items = new HashMap<>();

    public Map<Item, Integer> getItems() {
        return items;
    }

    public void addItem(Item item, int quantity) {
        this.items.put(item, quantity);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void emptyCart() {
        this.items.clear();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Item, Integer> entry : this.items.entrySet()) {
            double price = entry.getKey().getPrice();
            int quantity = entry.getValue();
            totalPrice += price * quantity;
        }
        return Math.round(totalPrice * 100.0) / 100.0;
    }
}
