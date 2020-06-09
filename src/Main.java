import basket.Basket;
import basket.Item;

public class Main {
    public static void main(String[] arg) {
        Basket basket1 = new Basket();
        basket1.addProductToBasket(new Item("Piwo", 2.23),4);
        basket1.addProductToBasket(new Item("Losos", 10.56),1);

        basket1.showBasket();


        }
}