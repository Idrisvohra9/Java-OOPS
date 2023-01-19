public class AccessPrivate {
    public static void main(String[] args) {
        Encapsulation e= new Encapsulation();
        System.out.println(e.Hidden_msg);
        e.setHidden_msg("illegal txt");
        System.out.println(e.getHidden_msg());
    }
}
