import java.util.Scanner;
import java.io.*;
class Exercise7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Three integers");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int sum=a+b+c;
int average=sum/3;
int product=a*b*c;
int largest=a;
if(b>largest)
{
largest=b;
}
if(c>largest)
{
largest=c;
}
int smallest=Math.min(a,Math.min(b,c));
System.out.println("Smallest of three "+ smallest);
System.out.println("Largest of three "+ largest);
System.out.println("Sum "+sum);
System.out.println("Average "+average);
System.out.println("Product "+product);
}
}