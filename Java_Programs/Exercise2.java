import java.util.Scanner;
class Exercise2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three integers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int product=a*b*c;
System.out.println("Product of three integers is "+ product);
}
}