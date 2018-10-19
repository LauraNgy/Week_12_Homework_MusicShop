public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private InstrumentType instrumentType;
    private double sellingPrice;
    private double buyingPrice;

    public Instrument(String material, String colour, InstrumentType instrumentType, double sellingPrice, double buyingPrice) {
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }
}
