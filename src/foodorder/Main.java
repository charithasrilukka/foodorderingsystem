package foodorder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Order order = new Order();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            menu.displayMenu();
            System.out.print("Select an item number (0 to finish): ");
            choice = sc.nextInt();

            if (choice == 0) break;

            FoodItem item = menu.getItem(choice - 1);
            if (item == null) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            order.addItem(item, qty);
            System.out.println(item.getName() + " x " + qty + " added ✅");
        }

        order.generateBill();
        sc.close();
    }
}
