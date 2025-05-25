import java.util.Scanner;

public class _06_ShoppingCart {
    public static void main(String[] args) {

        // Shopping Cart Program
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        if(quantity > 1){
            System.out.println("\nYou have bought " + quantity + " " + item + "s");
        }
        else{
            System.out.println("\nYou have bought " + quantity + " " + item);
        }
        //System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("Your total is " + currency + total);


        scanner.close();
    }
}
