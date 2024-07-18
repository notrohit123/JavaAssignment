import java.util.Scanner;
class Exercise8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two integers");
int a=sc.nextInt();
int b=sc.nextInt();
if(a%b==0)
{
System.out.println(a+ " is a multiple of "+ b);
}
else
{
System.out.println("Not a multiple");
}
}
}