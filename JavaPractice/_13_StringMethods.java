public class _13_StringMethods {
    public static void main(String[] args) {

        String name = "Password";

//        // checks length of string
//        int length = name.length();
//
//        // checks what char is at index
//        //char letter = name.charAt(4);
//
//        // finds index of first instance of something
//        int index = name.indexOf("a");
//
//        // finds index of last instance of something
//        int lastIndex = name.lastIndexOf("e");
//
//        // converts string to all upper case
//        //name = name.toUpperCase();
//
//        // converts string to all lower case
//        //name = name.toLowerCase();
//
//        // trims the whitespace in a string
//        //name = name.trim();
//
//        // replace letters with another
//        //name = name.replace("a", "o");
//
//
//
//        if(name.isEmpty()){
//            System.out.println("Your name is empty");
//        }
//        else{
//            System.out.println("Hello " + name);
//        }
//        if(name.contains(" ")){
//            System.out.println("Your name contains a space");
//        }
//        else{
//            System.out.println("Your name DOESN'T contain any spaces");
//        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
