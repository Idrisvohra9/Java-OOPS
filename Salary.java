public class Salary extends Employee{
    public static void main(String[] args) {
        Salary s = new Salary();
        s.total_sal();
    }
    public void total_sal(){
        super.Emp_id=1;
        super.Emp_name="Lakhan";
        double g_sal, h_rent=1000, travel=200, total_sal;
        g_sal = super.getSalary(10000);
        total_sal=g_sal+h_rent+travel;
        System.out.println(super.Emp_id);
        System.out.println(super.Emp_name);
        System.out.println("Total salary: "+total_sal);
    }
}
