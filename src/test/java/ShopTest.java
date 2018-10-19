import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    Accessory drumSticks;

    @Before
    public void before() {
        shop = new Shop("Mindy's Music");
        piano = new Piano("wood", "black", InstrumentType.KEYBOARD, 500.0, 700.0, 88);
        drumSticks =  new Accessory("drum sticks", 5.0, 7.9);
    }

    @Test
    public void hasName() {
        assertEquals("Mindy's Music", shop.getName());
    }

    @Test
    public void hasEmptyStock() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItem(piano);
        shop.addItem(drumSticks);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItem(piano);
        shop.addItem(drumSticks);
        assertEquals(2, shop.getStockCount());
        shop.removeItem(piano);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canGetTotalProfits() {
        shop.addItem(piano);
        shop.addItem(drumSticks);
        assertEquals(202.4, shop.getTotalProfits(), 0.5);
    }
}
