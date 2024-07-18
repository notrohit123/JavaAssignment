public class SavingsAccount
{
private static double annualInterestRate;
private double savingsBalance;
public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

public SavingsAccount(double savingsBalance,double annualInterestRate )
{
this.annualInterestRate=annualInterestRate;
this.savingsBalance=savingsBalance;
}
public void setAnnualInterestRate(double annualInterestRate)
{
this.annualInterestRate=annualInterestRate;
}
public double getAnnualInterestRate()
{
return annualInterestRate;
}
public void setSavingsBalance(double savingsbalance)
{
this.savingsBalance=savingsBalance;
}
public double getSavingsBalance()
{
return savingsBalance;
}
public void calculateMonthlyInterest()
{
double monthlyinterest=(savingsBalance*annualInterestRate)/12;
savingsBalance+=monthlyinterest;
}
public static void modifyInterestRate(double newInterestRate) 
{
annualInterestRate = newInterestRate;
}
public static void main(String args[])
{
SavingsAccount saver1=new SavingsAccount(2000.0);
SavingsAccount saver2=new SavingsAccount(3000.0);
SavingsAccount.modifyInterestRate(0.04);
System.out.println("Initial Balances (at 4% annual interest rate):");
System.out.println("Saver 1 balance: $" + saver1.getSavingsBalance());
System.out.println("Saver 2 balance: $" + saver2.getSavingsBalance());
saver1.calculateMonthlyInterest();
saver2.calculateMonthlyInterest();
System.out.println("Balances after 1 month:");
System.out.println("Saver 1 balance: $" + saver1.getSavingsBalance());
System.out.println("Saver 2 balance: $" + saver2.getSavingsBalance());
SavingsAccount.modifyInterestRate(0.05);
System.out.println("Setting annual interest rate to 5%.");
saver1.calculateMonthlyInterest();
saver2.calculateMonthlyInterest();
System.out.println("Balances after 2 months:");
System.out.println("Saver 1 balance: $" + saver1.getSavingsBalance());
System.out.println("Saver 2 balance: $" + saver2.getSavingsBalance()); 
}
}       
