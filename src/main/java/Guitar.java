public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(material, colour, instrumentType, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "brung";
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
