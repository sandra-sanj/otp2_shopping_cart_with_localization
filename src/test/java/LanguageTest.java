import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LanguageTest {
    static Language language;

    @BeforeEach
    void setup() {
        language = new Language("en", "US");
    }

    @Test
    void getLocale() {
        assertEquals("en_US", language.getLocale());
    }
}