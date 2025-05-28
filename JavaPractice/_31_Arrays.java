import java.util.Arrays;

public class _31_Arrays {

    public static void main(String[] args){

        // array = a collection of values of the same data type
        //       = * think of it as a variable that can store more than 1 value *

        // add [] to a data type to create an array
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //fruits[0] = "pineapple";
        //int numOfFruits = fruits.length;

        //System.out.println(numOfFruits);
        //System.out.println(fruits[0]);

//        for (int i = 0; i < fruits.length; i++){
//            System.out.print(fruits[i] + " ");
//        }

        // sorts array alphabetically / ascending order
        //Arrays.sort(fruits);

        // fills chosen array with new value
        Arrays.fill(fruits, "pineapple");

        // enhanced for-loop / for-each loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }



    }
}
