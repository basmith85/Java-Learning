public class _02_Variables {
    public static void main(String[] args) {

        // variable = a reusable container for a value
        //            a variable behaves as if it was the value it contains

        /*
    2 Steps to creating a variable
    1. declaration
    2. assignment
     */
        // Primitive - simple value stored directly in memory (stack)
        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temp = -10.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;



        System.out.println("The year is " + year);
        System.out.println("$" + price);
        System.out.println(grade);
        System.out.println(isStudent);

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are NOT a student!");
        }

        // Reference = memory address (stack) that points to the (heap)

        // Strings will use double quotes "..."
        String name = "Blake";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }


        String name1 = "Blake";
        int age1 = 23;
        double pi = 3.14;
        char gender = 'M';
        boolean isStudent1 = false;


    }
}
