package module08._06polymorphism;
import java.util.Scanner;

public class Bank {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Bank of Diyaville Online Hub");
        System.out.println("Please Select An Option to Proceed");
        System.out.println("1. Create a Checking Account");
        System.out.println("2. Create a Savings Account");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        int option = scan.nextInt();
            if (option == 1){
                System.out.println("What is your name?");
                String name = scan.next();
                System.out.println("How much would you like to deposit?");
                double dep = scan.nextDouble();
                CheckingAccount a1 = new CheckingAccount(name, dep);
            }
            if (option == 2){
                System.out.println("What is your name?");
                String name = scan.next();
                System.out.println("How much would you like to deposit?");
                double dep = scan.nextDouble();
                SavingsAccount a2 = new SavingsAccount(name, dep);
                a2.compoundInterest();
                System.out.println(a2.balance);
            }
            if (option == 3){
                System.out.println("Please select your account type");
            }

            
        //Account a2 = new Account("Emma", 200.05);
        //System.out.println("Your new balance is:" + a1.withdraw());
        //scan.close();
    }
}
