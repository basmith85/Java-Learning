public class _16_Ternary {
    public static void main(String[] args) {
        ex2(args);
        ex3(args);
        ex4(args);
        // ternary operator ? = return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

//        if(score >= 60){
//            System.out.println("PASS");
//        }
//        else{
//            System.out.println("FAIL");
//        }


    }
    public static void ex2(String[] args) {

        int number = 4;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);
    }
    public static void ex3(String[] args) {

        int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);

    }
    public static void ex4(String[] args) {
        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);
    }
}
