public class shippingCostCalculator {
    public static void main(String[] args) {
        double shippingPercent = .02;
        double itemPrice = 117;
        System.out.println("What is the price of your item?");
        if(itemPrice >= 100)
        {
            System.out.println("You have recived free shipping! Total cost is " + itemPrice);
        }
        else
        {
            double shippingPrice = itemPrice * shippingPercent;
            double totalPrice = itemPrice * shippingPercent + itemPrice;
            System.out.println("The item price is $" + itemPrice);
            System.out.println("Shipping will cost $" + shippingPrice);
            System.out.println("Your total price wil be $" + totalPrice);
        }
    }
}
