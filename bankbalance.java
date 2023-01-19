import java.util.Scanner;
class BankAccount {
    int min_bal=10000;
}
class MinimumBalance extends BankAccount {
    public void Withdraw(int cash) {
        if (cash >= min_bal) {
            System.out.println("Sorry, you should maintain minimum balance.");
        }
        else{
            System.out.println("Cash is withdrawn.");
        }
    }
}

public class bankbalance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the amount to be withdrawn: ");
        int cash = s.nextInt();
        
        MinimumBalance min = new MinimumBalance();
        
        min.Withdraw(cash);
        s.close();
    }
}