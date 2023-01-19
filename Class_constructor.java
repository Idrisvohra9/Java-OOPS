class Name {

    public Name(String name){// The name of constructor must be the Same name as class
        System.out.println(String.format("The passed name is: %s", name));
    }
}

// main class:
public class Class_constructor {
    public static void main(String[] args) {// The main method inside the class.
        new Name("Idris");// As we make a object of a class the constructor is automatically invoked
    }
}