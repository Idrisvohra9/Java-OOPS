public class Public_StaticMethod {
    public void pub_printTXT(String s) {
        System.out.println(s);
    }
    static void stat_printTXT(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // For calling a public method making a object of the class:
        Public_StaticMethod Main = new Public_StaticMethod();

        // Calling the public method:
        Main.pub_printTXT("Idris vohra - public method");
        
        // Calling the static method:
        stat_printTXT("Idris vohra - static method");
    }
}
