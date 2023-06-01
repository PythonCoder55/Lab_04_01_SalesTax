public class Main {
    public static void main(String[] args) {
        double purchasePrice = 10;
        double salesTax = 0.05;
        double totalCost;
        double taxCost;

        taxCost = purchasePrice * salesTax;
        totalCost = purchasePrice + taxCost;

        System.out.println("The computed sales tax cost for a purchase of " + purchasePrice + " With a sales tax of " + salesTax + " is " + taxCost);
        System.out.println("The total price is " + totalCost);
    }
}