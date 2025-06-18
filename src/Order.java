public class Order {

    private int itemCount;
    private double itemCost;
    private double shippingCost;
    private String id;
    private OrderObserver observer1;
    private OrderObserver observer2;

    public Order(String id) {
        this.id = id;
        this.itemCount = 0;
        this.itemCost = 0;
        this.shippingCost = 10;
    }

    public void attach(OrderObserver observer) {
        if (observer1 == null) {
            observer1 = observer;
        } else if (observer2 == null) {
            observer2 = observer;
        }
    }

    public void detach(OrderObserver observer) {
        if (observer == observer1) {
            observer1 = null;
        } else if (observer == observer2) {
            observer2 = null;
        }
    }

    public double getTotalPrice() {
        return itemCost + shippingCost;
    }

    public int getCount() {
        return itemCount;
    }

    @Override
    public String toString() {
        return "Order ID: " + id +
                "\nItems: " + itemCount +
                "\nItem Cost: $" + itemCost +
                "\nShipping Cost: $" + shippingCost +
                "\nTotal: $" + getTotalPrice();
    }

    public void notifyObservers() {
        if (observer1 != null) observer1.update(this);
        if (observer2 != null) observer2.update(this);
    }

    public void addItem(double price) {
        itemCount++;
        itemCost += price;
        notifyObservers();
    }

    public void setShippingCost(double cost) {
        this.shippingCost = cost;
    }

    public void applyDiscount(double discount) {
        this.itemCost -= discount;
    }

    public double getItemCost() {
        return itemCost;
    }
}