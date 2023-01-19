public class SubClass extends SuperClass {
    public void Invoker(){
        System.out.println(super.i);
        super.message();
    }
    public static void main(String[] args) {
        SubClass s = new SubClass();
        // the super method cannot be called in a static method i.e. it cannot be called in the main static method. We have to make another public method and then make the object of the class it is situated in and then call that method.
        // this is the process of using a super method.
        s.Invoker();
    }
}
