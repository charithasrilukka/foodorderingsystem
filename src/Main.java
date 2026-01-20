package foodorder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Order order = new Order();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        Customer customer = new Customer(name);

        while (true) {
            menu.showMenu();
            System.out.print("\nEnter item number to order: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            String item = menu.getItem(choice);
            double price = menu.getPrice(choice);

            if (item != null) {
                order.addItem(item, price);
                System.out.println(item + " added to cart.");
            } else {
                System.out.println("Invalid choice!");
            }
        }

        System.out.print("\nDo you have a coupon? (yes/no): ");
        String couponChoice = sc.next();

        if (couponChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter coupon code: ");
            String code = sc.next();
            order.applyCoupon(code);
        }

        order.showBill(customer.getName());

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Cash");

        int pay = sc.nextInt();

        switch (pay) {
            case 1:
                System.out.println("Payment successful via UPI ✅");
                break;
            case 2:
                System.out.println("Payment successful via Card ✅");
                break;
            case 3:
                System.out.println("Payment successful via Cash ✅");
                break;
            default:
                System.out.println("Invalid payment option!");
        }

        System.out.println("🎉 Thank you for ordering!");
        sc.close();
    }
}

