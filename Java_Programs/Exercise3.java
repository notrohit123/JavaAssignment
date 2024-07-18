import java.util.Scanner;
class Exercise3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter temperature in fahrenheit");
double fah=sc.nextDouble();
double celsius=(5.0/9.0)*(fah-32.0);
System.out.println("Temperature in celsius is: "+ celsius);
}
}


