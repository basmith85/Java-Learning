public class _35_2DArrays {
    public static void main(String[] args){

        numpad(args);
        System.exit(0);
        // 2D array = An array where each element is an array
        //          = Useful for storing a matrix of data


        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        // can use either the array name or list values in a 2d array
        String[][] groceries = {{"apple", "orange", "banana"},
                                 vegetables,
                                 meats};

        // array[row][column] to replace array location
        groceries[1][2] = "celery";

        for(String[] foods : groceries){
            // since arrays are a reference data type, we have to use a nested loop
            for(String food : foods ){
                System.out.print(food + " ");
            }
            System.out.println();
        }


    }

    static void numpad(String[] args){

        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '8'},
                              {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
