class info_Storage {
    public String Name_storage(String fname, String lname){
        String f= fname, l= lname;
        return f+" "+l;
    }
}

public class Class_no_constructor {
    public static void main(String[] args) {
        
        info_Storage infObj = new info_Storage();

        System.out.println(infObj.Name_storage("Idris", "Vohra"));
    }
}