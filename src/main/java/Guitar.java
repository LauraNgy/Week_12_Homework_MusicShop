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

    @Override
    public double calculateMarkup() {
        return (getSellingPrice() - getBuyingPrice()) / getSellingPrice() * 100;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
