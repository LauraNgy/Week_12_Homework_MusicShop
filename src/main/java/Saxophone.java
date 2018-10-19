public class Saxophone extends Instrument {

    private int numberOfValves;

    public Saxophone(String material, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice, int numberOfValves) {
        super(material, colour, instrumentType, buyingPrice, sellingPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }

    @Override
    public String play() {
        return "toot";
    }
}
