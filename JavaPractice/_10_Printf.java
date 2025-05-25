public class _10_Printf {
    public static void main(String[] args){

        // printf() = is a method used to format output

        // %[flags][width][.precision][.specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("You are %.1f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        // Part 2 (Precision and flags)

        // [flags]
        // + = output a plus  5 -> +5
        // , = comma grouping separator 9000 -> 9,000
        // ( = negative numbers are enclosed in () -50 -> (50)
        // space = display a minus if negative, space if positive (aka aligns numbers)

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;

        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);


        // Part 3
        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);


    }
}
