import java.util.Scanner;

public class _25_NestedLoops {
    public static void main(String[] args){

        miniProject(args);
        System.exit(0);
        // nested loop = A loop inside another loop
        //               Used often with matrices or DS&A

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void miniProject(String[] args){

        // Mini Project

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);


        // outer for loop is in charge of rows
        for(int i = 0; i < rows; i++){
            // inner for loop in charge of columns
            for(int j = 0; j < columns; j++){
                // prints desired symbol
                System.out.print(symbol);
            }
            // creates new line to separate column and rows
            System.out.println();
        }

        scanner.close();
    }
}
