import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ShoppingCartTest {
    static ShoppingCart shoppingCart;

    @BeforeEach
    void setup() {
        shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("apple", 0.65), 3);
        shoppingCart.addItem(new Item("milk", 0.90), 1);
        shoppingCart.addItem(new Item("granola", 3.49), 1);
        shoppingCart.addItem(new Item("candy", 1.55), 2);
    }

    @Test
    void getItems() {
        Map<Item, Integer> items = shoppingCart.getItems();
        assertEquals(4, items.size());
    }

    @Test
    void addItem() {
        shoppingCart.addItem(new Item("cookies", 2.29), 5);
        assertEquals(5, shoppingCart.getItems().size());
    }

    @Test
    void getTotalPrice() {
        assertEquals(9.44, shoppingCart.getTotalPrice());
    }

    @Test
    void removeItem() {
        Item item = new Item("pasta", 1.89);
        shoppingCart.addItem(item, 1);
        shoppingCart.removeItem(item);
        assertEquals(4, shoppingCart.getItems().size());
    }

    @Test
    void emptyCart() {
        shoppingCart.emptyCart();
        assertEquals(0, shoppingCart.getItems().size());
    }
}