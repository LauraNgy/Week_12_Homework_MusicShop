import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("brass", "brass", InstrumentType.BRASS, 200.0, 300.0, 12);
    }

    @Test
    public void hasMaterial() {
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("brass", saxophone.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.BRASS, saxophone.getInstrumentType());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(200.0, saxophone.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(300.0, saxophone.getSellingPrice(), 0.01);
    }

    @Test
    public void canChangeSellingPrice() {
        saxophone.setSellingPrice(350.0);
        assertEquals(350.0, saxophone.getSellingPrice(), 0.01);
    }

    @Test
    public void hasNumberOfValves() {
        assertEquals(12, saxophone.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("toot", saxophone.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(33.3, saxophone.calculateMarkup(), 0.1);
    }
}
