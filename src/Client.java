public class Client {

    public static void main(String[] args) {
        Order order = new Order("CMD001");

        OrderObserver priceObserver = new PriceObserver();
        OrderObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        order.addItem(80);
        order.addItem(70);
        order.addItem(90);
        order.addItem(5);
        order.addItem(5);
        order.addItem(5);

        System.out.println(order);
    }
}