package module08._06polymorphism;
import java.util.Scanner;

public class CheckingAccount extends Account {
    private double overDraftFee;

    public CheckingAccount(String name, double balance){
        super(name, balance);
        overDraftFee = 50.0;
    }

    public double withdraw(){
        Scanner scan = new Scanner(System.in);
        double balance = getBalance();
        System.out.println("You have " + balance + " dollars in your account. How much would you like to withdraw?");
        double wdrwn = scan.nextDouble();
        if (wdrwn <= balance){
            balance = balance - wdrwn;
        }
        else if (wdrwn <= balance + overDraftFee){
            System.out.println("Warning going over your balance will incur extra fees. Do you want to proceed?");
            Boolean ans = scan.nextBoolean();
            if (ans == true){
                balance = balance - wdrwn;
            }
        }
        else{
            System.out.println("You cannot withdraw that much money without a loan");
        }


        scan.close();
        return balance;
    }
}
