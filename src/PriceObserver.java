public class PriceObserver implements OrderObserver {

    private boolean discountApplied = false;

    @Override
    public void update(Order order) {
        if (!discountApplied && order.getItemCost() > 200) {
            order.applyDiscount(20);
            discountApplied = true;
        }
    }
}