import java.util.Scanner;

public class UserInput_3 {
    public static void main(String[] args) {
        //commonIssue(args);
        exercise(args);
        Scanner scanner = new Scanner(System.in);

        // print is same line, println on new line (\n)
        System.out.print("Enter your name: ");

        // You can use scanner.next or .nextLine. nextLine will include spaces, next will not
        // (Sees Blake vs Blake A Smith)
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are NOT enrolled as a student");
        }

        scanner.close();
    }

    public static void commonIssue(String [] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        // This scanner line is entered since there is a java error that causes it to print before you
        // enter your next input. So it is seeing "age\n" where color = \n. This line helps to avoid
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);


    }

    public static void exercise(String[] args) {

        // Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area is: " + area + "cm^2");

        // Good practice to have. Not closing here because already closed in main.
//        scanner.close()

    }


}
