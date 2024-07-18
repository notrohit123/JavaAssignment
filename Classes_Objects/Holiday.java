import java.util.Scanner;
import java.lang.*;
public class Holiday
{
private String name;
private int day;
private String month; 

public Holiday(String name, int day, String month)
{
this.name=name;
this.day=day;
this.month=month;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public void setDay(int day)
{
this.day=day;
}
public int getDay()
{
return day;
}
public void setMonth(String month)
{
this.month=month;
}
public String getMonth()
{
return month;
}
public Boolean inSameMonth(Holiday other)
{
String thisMonth = this.month.toUpperCase();
String otherMonth = other.month.toUpperCase();
return thisMonth.equals(otherMonth);
}

public static double avgDate(Holiday[] holidays)
{
int sum=0;
for(Holiday holiday: holidays)
{
sum+=holiday.getDay();
} 
return (double)sum/holidays.length;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println(" Holiday Details");
System.out.println("Enter holiday name ");
String name=sc.nextLine();
System.out.println("Enter holiday day");
int day=sc.nextInt();
sc.nextLine();
System.out.println("Enter holiday month");
String month=sc.nextLine();
Holiday ho=new Holiday(name, day, month);
Holiday independence_day=new Holiday("National Holiday", 4, "July");
System.out.println("Holiday name: " + ho.getName());
System.out.println("Holiday day: " + ho.getDay());
System.out.println("Holiday month: " + ho.getMonth());
System.out.println("Are holidays in the same month? " + ho.inSameMonth(independence_day));
Holiday[] holidays = {
            new Holiday("New Year", 1, "January"),
            new Holiday("Independence Day", 4, "July"),
            new Holiday("Christmas", 25, "December")
        };
double averageDay = avgDate(holidays);
System.out.println("Average day: " + averageDay);

}
}
