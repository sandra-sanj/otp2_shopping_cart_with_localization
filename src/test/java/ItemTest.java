import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {
    Item item1;

    @BeforeEach
    void setup() {
        item1 = new Item("apple", 0.65);
    }

    @Test
    void getName() {
        assertEquals("apple", item1.getName());
    }

    @Test
    void getPrice() {
        assertEquals(0.65, item1.getPrice());
    }
}