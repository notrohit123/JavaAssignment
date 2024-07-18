import java.util.Scanner;

class Exercise10
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double radius=sc.nextDouble();
System.out.println("Volume is "+sphereVolume(radius));
}
public static double sphereVolume(double rad)
{
double volume=4/3*3.14*rad*rad*rad;
return volume;
}
}
