package foodorder;

import java.util.ArrayList;

public class Menu {
    private ArrayList<FoodItem> items;

    public Menu() {
        items = new ArrayList<>();
        items.add(new FoodItem("Burger", 120));
        items.add(new FoodItem("Pizza", 250));
        items.add(new FoodItem("Pasta", 180));
        items.add(new FoodItem("French Fries", 90));
        items.add(new FoodItem("Coke", 50));
    }

    public void displayMenu() {
        System.out.println("\n------ MENU ------");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName() + " - ₹" + items.get(i).getPrice());
        }
        System.out.println("0. Finish Order");
        System.out.println("------------------");
    }

    public FoodItem getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }
}
