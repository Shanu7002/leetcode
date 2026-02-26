public class MegaStore {

    public enum DiscountType {
        Standard,
        Seasonal,
        Weight
    }

    public static double getFinalPrice(double cartWeight, double totalValue, DiscountType type) {
        double discount = 0;

        switch (type) {
            case Seasonal:
                discount = 0.2;
                break;
            case Weight:
                if (cartWeight > 10) {
                    discount = 0.1;
                }
                break;
            case Standard:
            default:
                discount = 0;
        }
        return totalValue * (1 - discount);
    }

    public static void main(String[] args) {
        System.out.println(getFinalPrice(12.5, 100.0, DiscountType.Weight));
    }
}