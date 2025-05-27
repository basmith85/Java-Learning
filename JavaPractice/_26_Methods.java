public class _26_Methods {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()

        String name = "Blake";
        int age = 23;

        happyBirthday(name,age);

        System.out.println(square(3));
        System.out.println(cube(3));

        String fullName = getFullName("Spongebob", "Squarepants");
        System.out.println(fullName);

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must be 18+ to sign up");
        }


    }
    // You can get variables from other methods, as long as the initial method is also calling those
    // variables. The function must declare the type as well as the name
    static void happyBirthday(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!\n");
    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }

}
