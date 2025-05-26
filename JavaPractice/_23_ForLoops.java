import java.util.Scanner;

public class _23_ForLoops {
    // had to add throws InterruptedException due to the Thread timeout
    public static void main(String[] args) throws InterruptedException {
        countdown(args);
        System.exit(0);

        // for loop - execute some code a CERTAIN amount of times
        // for(initialization; condition; update){}

//        for(int i = 10; i > 0; i-=3){
//            System.out.println(i);
//        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }

        scanner.close();
    }
    public static void countdown(String[] args) throws InterruptedException {

        // Simulate Countdown Mini Project

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");
    }
}
