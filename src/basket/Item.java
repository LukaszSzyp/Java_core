package basket;

public class Item {
    String prodactName;
    double price;

    public double getPrice() {
        return price;
    }

    public String getProdactName() {
        return prodactName;
    }

    public Item(String prodactName, double price) {
        this.price = price;
        this.prodactName = prodactName;
    }
}
