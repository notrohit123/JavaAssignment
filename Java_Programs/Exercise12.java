import java.util.Scanner;
import java.text.DecimalFormat;
class Exercise12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int[] grades=new int[20];
int counter=0;
System.out.println("Enter Grades");
for(int i=0;i<grades.length;i++)
{
counter++;
grades[i]=sc.nextInt();
if(grades[i]==-1)
{
counter-=1;
break;
}
}
DecimalFormat df=new DecimalFormat("###.00");
System.out.println("Average of grades is "+ df.format(Average(grades,counter)));
}
public static double Average(int grades[],int counter)
{
int sum=0;
for(int i=0;i<counter;i++)
{
sum+=grades[i];
}
double average=(double)sum/counter;
return average;
}
}
