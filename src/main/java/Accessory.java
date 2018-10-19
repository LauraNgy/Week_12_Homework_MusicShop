public class Accessory implements ISell {

    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Accessory(String description, double buyingPrice, double sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    @Override
    public double getSellingPrice() {
        return this.sellingPrice;
    }

    @Override
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double calculateMarkup() {
        return (getSellingPrice() - getBuyingPrice()) / getSellingPrice() * 100;
    }

}
