import java.util.Scanner;

public class _21_WhileLoops {
    public static void main(String[] args){
        //ex2(args);
        doWhile(args);
        //System.exit(0);

        // while loop = repeat some code forever while some condition remains true
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // make sure to try and avoid an infinite while loop. An infinite while loop is when you will
        // be stuck in the loop forever if there is no way to update a condition
        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");

        scanner.close();
    }
    public static void ex2(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old");

    }
    public static void doWhile(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        // do-while loops differ from while loops in that the condition is checked after the code loops no matter what
        // while loops if the condition is false, the loop will not execute at all
        do{
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        } while(number < 1 || number > 10);

        System.out.println("You picked " + number);

    }
}
