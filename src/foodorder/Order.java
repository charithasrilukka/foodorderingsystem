package foodorder;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderItem> orderedItems = new ArrayList<>();

    public void addItem(FoodItem item, int quantity) {
        orderedItems.add(new OrderItem(item, quantity));
    }

    public void generateBill() {
        System.out.println("\n========== BILL ==========");
        double total = 0;

        for (OrderItem oi : orderedItems) {
            double itemTotal = oi.getTotalPrice();
            total += itemTotal;
            System.out.println(oi.getItem().getName() + " x " + oi.getQuantity() + " = ₹" + itemTotal);
        }

        System.out.println("--------------------------");
        System.out.println("Total Amount: ₹" + total);
        System.out.println("Thank you! Visit again 😋");
        System.out.println("==========================");
    }
}
