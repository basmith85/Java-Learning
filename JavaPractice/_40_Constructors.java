public class _40_Constructors {
    public static void main(String[] args){

        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        // by using a constructor, we can create objects with unique values

        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Patrick", 34, 1.5);
        Student student3 = new Student("Sandy", 26, 4.0);

        student1.study();
        student2.study();
        student3.study();
    }
}

class Student{

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){

        // "this" keyword refers to the object we are currently constructing/working with
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        // after assigning values to attributes using constructor, you can use within methods too
        System.out.println(this.name + " is studying");
    }

}
