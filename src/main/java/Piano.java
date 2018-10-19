public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String material, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice, int numberofKeys) {
        super(material, colour, instrumentType, buyingPrice, sellingPrice);
        this.numberOfKeys = numberofKeys;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    @Override
    public String play() {
        return "ping";
    }
}
