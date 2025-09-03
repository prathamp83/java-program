public class Main {
    public static void main(String[] args) {
        
        double item1Price = 29.99;
        double item2Price = 49.50;
        double item3Price = 9.99;

        
        double totalPrice = item1Price + item2Price + item3Price;
        System.out.println("Total Price: $" + totalPrice);

        
        double discount = totalPrice * 0.10;
        double priceAfterDiscount = totalPrice - discount;
        System.out.println("Price after 10% discount: $" + priceAfterDiscount);
        
        double tax = priceAfterDiscount * 0.08;
        double finalAmount = priceAfterDiscount + tax;
        System.out.println("Final Amount after adding 8% tax: $" + finalAmount);

        int itemCount = 3;
        int itemsPerBox = 2;
        int fullBoxes = itemCount / itemsPerBox;
        int leftoverItems = itemCount % itemsPerBox;

        System.out.println("Full boxes: " + fullBoxes);
        System.out.println("Leftover items: " + leftoverItems);
    }
}
