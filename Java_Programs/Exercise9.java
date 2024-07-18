/*import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int counter=0;
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            counter++;
            
            int largest = numbers[0];
            for (int j = 1; j <= i; j++) {
                if (numbers[j] > maxNumber) {
                    largest = numbers[j];
                }
            }
            System.out.println("Largest number after iteration " + (i + 1) + ": " + largest);
        }
    }
}*/


import java.util.Scanner;
class Exercise9
{
Scanner sc=new Scanner(System.in);
int[] numbers=new int[10];
System.out.println("Enter 10 integers");
int counter=0;
for(int i=1;i<=counter;i++)
{
number[i]=sc.nextInt();
counter++;
if(number[i]>largest)
System.out.println("Largest Number in iteration "+i+ " :"+ number[i]);

}
}
}
























