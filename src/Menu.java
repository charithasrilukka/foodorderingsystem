package foodorder;

import java.util.HashMap;

public class Menu {
    private HashMap<Integer, String> items = new HashMap<>();
    private HashMap<Integer, Double> prices = new HashMap<>();

    public Menu() {
        items.put(1, "Pizza");
        prices.put(1, 250.0);

        items.put(2, "Burger");
        prices.put(2, 120.0);

        items.put(3, "Pasta");
        prices.put(3, 180.0);

        items.put(4, "Ice Cream");
        prices.put(4, 90.0);

        items.put(5, "Fried Rice");
        prices.put(5, 150.0);
    }

    public void showMenu() {
        System.out.println("\n------ FOOD MENU ------");
        for (int key : items.keySet()) {
            System.out.println(key + ". " + items.get(key) + " - ₹" + prices.get(key));
        }
        System.out.println("0. Finish Order");
    }

    public String getItem(int id) {
        return items.get(id);
    }

    public double getPrice(int id) {
        return prices.get(id);
    }
}
