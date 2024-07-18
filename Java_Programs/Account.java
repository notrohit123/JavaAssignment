import java.util.*;
import java.io.*;
public class Account {
private double balance;
public Account()
{
this.balance=5000;
}
    public double debit(double amnt) {
        
        if (amnt > balance) {
            System.out.println("Debit Amount exceeded Account Balance");
            return 0; 
        } else {
              balance-=amnt;
              return amnt;
               }
}
public double getBalance()
{
return balance;
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account obj=new Account();
        System.out.println("Enter Amount to be withdrawn");
        double amnt = sc.nextDouble();
        
        System.out.println("Your Withdrawn Amount is " + obj.debit(amnt));
        System.out.println("Savings "+obj.getBalance());
    }
}
