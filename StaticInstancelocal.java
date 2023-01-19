public class StaticInstancelocal {

    int instance_var= 20;
    static int static_var = 20;

    public static void main(String[] args){

        int local_var = 20;
        StaticInstancelocal obj = new StaticInstancelocal();
        System.out.println(obj.instance_var);
        System.out.println(static_var);
        System.out.println(local_var);
    }
}
