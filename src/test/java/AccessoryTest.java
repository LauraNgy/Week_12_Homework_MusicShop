import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AccessoryTest {

    Accessory guitarStrings;

    @Before
    public void before() {
        guitarStrings = new Accessory("guitar strings", 5.0, 7.9);
    }

    @Test
    public void hasDescription() {
        assertEquals("guitar strings", guitarStrings.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(5.0, guitarStrings.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(7.9, guitarStrings.getSellingPrice(), 0.1);
    }

    @Test
    public void canSetSellingPrice() {
        guitarStrings.setSellingPrice(6.9);
        assertEquals(6.9, guitarStrings.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(36.7, guitarStrings.calculateMarkup(), 0.1);
    }

}
