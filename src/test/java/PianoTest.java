import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("wood", "black", InstrumentType.KEYBOARD, 500.0, 700.0, 88);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(500.0, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(700.0, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canChangeSellingPrice() {
        piano.setSellingPrice(750.0);
        assertEquals(750.0, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("ping", piano.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(28.5, piano.calculateMarkup(), 0.1);
    }
}

