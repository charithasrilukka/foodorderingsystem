package foodorder;

import java.util.ArrayList;

public class Order {
    private ArrayList<String> orderedItems = new ArrayList<>();
    private double subtotal = 0;
    private double discount = 0;
    private double gst = 0;
    private double finalTotal = 0;

    public void addItem(String item, double price) {
        orderedItems.add(item);
        subtotal += price;
    }

    public void applyCoupon(String code) {
        if (code.equalsIgnoreCase("NEWUSER010")) {
            discount = subtotal * 0.10; // 10% discount
            System.out.println("Coupon applied! You saved ₹" + discount);
        }
        else if (code.equalsIgnoreCase("FOOD20")) {
            discount = subtotal * 0.20; // 20% discount
            System.out.println("Coupon applied! You saved ₹" + discount);
        }
        else {
            System.out.println("Invalid coupon!");
        }
    }

    public void calculateGST() {
        gst = (subtotal - discount) * 0.05; // 5% GST
        finalTotal = subtotal - discount + gst;
    }

    public void showBill(String customerName) {
        calculateGST();

        System.out.println("\n------ FINAL BILL ------");
        System.out.println("Customer: " + customerName);
        System.out.println("Items Ordered:");
        for (String item : orderedItems) {
            System.out.println("- " + item);
        }

        System.out.println("Subtotal: ₹" + subtotal);
        System.out.println("Discount: ₹" + discount);
        System.out.println("GST (5%): ₹" + gst);
        System.out.println("Total Payable: ₹" + finalTotal);
        System.out.println("-------------------------");
    }

    public double getFinalTotal() {
        return finalTotal;
    }
}
