public class shoppingbill {

    public static double calculateElectronicsGST(double a, double b) {
        double amount = a + b;
        return amount + (amount * 18 / 100);
    }

    public static double calculateFashionGST(double c, double d) {
        double amount = c + d;
        return amount + (amount * 13 / 100);
    }

    public static double calculateFoodGST(double e) {
        return e + (e * 7 / 100);
    }

    public static double totalBill(double a, double b, double c, double d, double e) {
        return calculateElectronicsGST(a, b)
                + calculateFashionGST(c, d)
                + calculateFoodGST(e);
    }

    public static double calculateDiscountedBill(
            double a, double b, double c, double d, double e) {

        double total = totalBill(a, b, c, d, e);
        double discount = total * 20 / 100;

        return total - discount;
    }

    public static void main(String[] args) {

        double a = 100;
        double b = 100;
        double c = 100;
        double d = 100;
        double e = 100;

        double total = totalBill(a, b, c, d, e);
        double discount = total * 20 / 100;
        double finalAmount = calculateDiscountedBill(a, b, c, d, e);

        System.out.printf("Total after GST = %.2f%n", total);
        System.out.printf("Discount = %.2f%n", discount);
        System.out.printf("Final payable amount = %.2f%n", finalAmount);
    }
}