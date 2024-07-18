import java.util.Scanner;
class Exercise5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 integers");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Sum "+(a+b));
System.out.println("Product "+(a*b));
System.out.println("Difference "+(a-b));
if(b!=0)
{
System.out.println("Quotient "+(a/b));
}
else
{
System.out.println("Undefined");
}
}
}



