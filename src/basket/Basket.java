package basket;

import java.util.LinkedHashMap;
import java.util.Map;

public class Basket {
    Map<Item, Integer> order = new LinkedHashMap<>();

    public void addProductToBasket(Item item, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException(String.format("Illegal quantity %d!", quantity));
        }
        if (order.containsKey(item)) {
            quantity = order.get(item) + quantity;
        }
        order.put(item, quantity);
    }

    public Item selectedProduct(String nameOfProduct) {
        for (Map.Entry<Item, Integer> entry : order.entrySet()) {
            if (entry.getKey().prodactName == nameOfProduct) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void subtractionProductFromBasket(Item item, int quantity) {
        if ((quantity > order.get(item)) || quantity < 0) {
            throw new IllegalArgumentException(String.format("Illegal quantity %d!", quantity));
        }
        if (quantity < order.get(item).intValue()) {
            order.put(item, order.get(item).intValue() - quantity);
        } else {
            order.remove(item);
        }
    }

    public void showBasket() {
        for (Map.Entry<Item, Integer> entry : order.entrySet()) {
            System.out.println(entry.getKey().prodactName + " Cena " + entry.getKey().price + " zl ilosc: " + entry.getValue());
        }
    }

}
