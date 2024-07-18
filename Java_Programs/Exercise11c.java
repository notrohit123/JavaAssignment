import java.util.Scanner;
class Exercise11c
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int[] bestScore=new int[5];
for(int i=0;i<5;i++)
{
bestScore[i]=sc.nextInt();
}
for(int i=0;i<5;i++)
{
System.out.println(bestScore[i]);
}
}
}