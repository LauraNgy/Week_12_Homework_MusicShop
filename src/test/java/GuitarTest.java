import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("wood", "cream", InstrumentType.STRING, 60.0, 99.9, 6);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("cream", guitar.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(60.0, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(99.9, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canChangeSellingPrice() {
        guitar.setSellingPrice(89.9);
        assertEquals(89.9, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("brung", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(39.9, guitar.calculateMarkup(), 0.1);
    }
}
