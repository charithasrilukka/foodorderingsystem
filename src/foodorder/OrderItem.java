package foodorder;

public class OrderItem {
    private FoodItem item;
    private int quantity;

    public OrderItem(FoodItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public FoodItem getItem() { return item; }
    public int getQuantity() { return quantity; }

    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }
}
