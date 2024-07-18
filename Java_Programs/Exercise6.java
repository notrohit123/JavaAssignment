import java.util.Scanner;
class Exercise6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two integers");
int a=sc.nextInt();
int b=sc.nextInt();
if(a>b)
{
System.out.println(a+" is larger");
}
else if(b>a)
{
System.out.println(b+" is larger");
}
else
{
System.out.println(" Both are equal");
}
}
}