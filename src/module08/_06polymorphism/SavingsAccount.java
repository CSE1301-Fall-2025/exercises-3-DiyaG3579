package module08._06polymorphism;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, double balance){
        super(name, balance);
        interestRate = 0.04;
    }
    
    public void compoundInterest(){
        double balance = getBalance();
        balance = balance*(1+interestRate);
    }
}
