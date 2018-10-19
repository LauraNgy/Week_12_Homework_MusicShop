import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getStockCount() {
        return this.stock.size();
    }


    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public double getTotalProfits() {
        double totalProfits = 0.0;
        for ( ISell stockItem : this.stock) {
            double markup = stockItem.calculateMarkup();
            double sellPrice = stockItem.getSellingPrice();
            double profit = sellPrice * markup / 100;
            totalProfits += profit;
        }
        return totalProfits;
    }
}
