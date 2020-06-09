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
    
    public void showBasket(){
        for (Map.Entry<Item,Integer> entry : order.entrySet()) {
            System.out.println(entry.getKey().prodactName +" Cena "+entry.getKey().price +" zl ilosc: " + entry.getValue());
            
        }
    }
}
