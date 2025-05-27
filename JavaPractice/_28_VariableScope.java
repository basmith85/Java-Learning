public class _28_VariableScope {

    // Java likes to use the local variables first, before class
    // Often good practice to mostly use local variables
    static int x = 3;  //CLASS scope, can be seen by ALL methods

    public static void main(String[] args){

        // variable scope = where a variable can be accessed

        int x = 1; //LOCAL variable = a variable declared inside a method

        System.out.println(x);

        doSomething();
    }
    static void doSomething(){
        int x = 2; //LOCAL

        System.out.println(x);
    }
}
