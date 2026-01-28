package module08._06polymorphism;
import java.util.Scanner;

public class Account 
{
    private String name;
    private double balance;

    public Account(String name, double balance)
    {
       this.name = name;
       this.balance = balance;
    }

    public double withdraw(){
        System.out.println("What is the name of the account?");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("You have " + balance + " in your account. How much would you like to withdraw?");
        double withdrawn = scan.nextDouble();
        if (withdrawn <= balance){
            balance = balance - withdrawn;
        }
        else {
            System.out.println("You cannot draw that much money, please see an associate");
        }
        scan.close();
        return balance;
    }

    public double deposit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("You have " + balance + " in your account. How much would you like to deposit?");
        double deposite = scan.nextDouble();
        this.balance = deposite + balance;
        scan.close();
        return balance;
    }

    public double getBalance(){
        return balance;
    }
}
