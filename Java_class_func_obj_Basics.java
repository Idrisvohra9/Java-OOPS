public class Java_class_func_obj_Basics {
    // Public class:
    // This is the main class of the file^
    // In java, in order to make a main class that returns a main value and or can be used to make objects for other class/s the keyword "public class" is used. That said the public class contains the main public method "public static void main(String[] args)" and compulsorily needs the java file named after the public class's name in order to run it as a main class of the file.

    // main method:
    public static void main(String[] args) {
        // class:
        // In java more than one normal classes can be made with the use of "class" keyword that does not require the java file name to be the same as the class name.

        // constructor:
        //  In order to initialize certain variables in the class that we are passing as a parameter, the constructor method is defined.

        //  The constructor is identified differently as compared to other methods in a class as the name of the constructor is the same as the class's name.
        
        // Function/method:
        // A function/method is defined with the "static" keyword and can be made public with the "public" keyword As we know that methods have a return type that can be String, Int, Or other data types, if the method does'nt return anything the return type void is used.

        // Diff b/w static & public method:
        // The difference between static methods and public methods is that the public method needs an object of the class it is defined in to be used like "class_obj.func_name();". And static method does not need object to be created as it can be called like this "function_name();".

        // Attributes:
        // Variables inside a class but not inside a main method are considered to be attributes of the class to access it the syntax is OBJname.ATTRIBname, Notice how the .(dot) operator is used.
        // for example:
        class Myclass{
            // These are attributes:
            int i=5;
            final float pi=3.14f;
            // final keyword is a modifier, used when we don't want the value to be changed/modified.
            String s="This is a attribute of Myclass.";
        }
        Myclass c= new Myclass();
        System.out.println(c.i);// 5
        System.out.println(c.s);// This is a attribute of my class.

        // We can also modify the values of the attributes:
        c.i= 10;// i is now 10
        System.out.println(c.i);

        // c.pi = 9.0f;// modifying the final value will throw an error
        // similarly more than one objects can be made.
        
    }
}