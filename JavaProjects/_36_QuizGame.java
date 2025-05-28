import java.util.Scanner;

public class _36_QuizGame {
    public static void main(String[] args){

        // Quiz Game

        String[] questions = {"What is the capital of France?",
                              "Which data type is used to create a variable that should store text in Java?",
                              "What does HTML stand for?",
                              "Which planet is known as the Red Planet?",
                              "In Java, which keyword is used to create a subclass?"};

        String[][] options = {{"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
                              {"1. int", "2. String", "3. boolean", "4. double"},
                              {"1. HyperText Markup Language", "2. Home Tool Markup Language", "3. Hyperlinks and Text Markup Language", "4. Hyperlinking Textual Machine Language"},
                              {"1. Venus", "2. Mars", "3. Jupiter", "4. Mercury"},
                              {"1. extends", "2. implements", "3. inherits", "4. instanceOf"}};

        int[] answers = {3, 2, 1, 2, 1};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;

            }
            else{
                System.out.println("**********");
                System.out.println("Incorrect!");
                System.out.println("**********");
            }
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);



        scanner.close();
    }
}
