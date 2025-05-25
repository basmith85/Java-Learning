import java.util.Random;

public class _08_RandomNums {
    public static void main(String[] args){

        Random random = new Random();

        int number;

        // double generates between 0 and 1
        double num;

        // boolean generate true or false (good for things like flipping coins)
        boolean isHeads;

        // important to keep in mind the first # (or origin) is inclusive, so that number will be included
        // the second # (or bound) is exclusive, so the max will be that # minus 1 (n - 1)
        number = random.nextInt(1,101);
        System.out.println(number);


        isHeads = random.nextBoolean();
        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }



    }
}
