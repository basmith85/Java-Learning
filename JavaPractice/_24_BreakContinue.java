public class _24_BreakContinue {
    public static void main(String[] args){

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++){

            if (i == 5){
                //break;
                continue;  // since we are looking at 5, 5 will be skipped and not be in the output
            }
            System.out.print(i + " ");
        }

    }
}
