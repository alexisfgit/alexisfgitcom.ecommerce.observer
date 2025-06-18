public class Order {

    private int itemCount;
    private double itemCost;
    private double shippingCost;
    private String id;
    private OrderObserver observers;

    public void attach(OrderObserver observer) {
    }

    public void detach(OrderObserver observer) {
    }

    public double getTotalPrice() {
        return 0;
    }

    public int getCount() {
        return 0;
    }

    public String toString() {
        return "";
    }

    public void notifyObservers() {
    }

    public void addItem(double price) {
    }
}