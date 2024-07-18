import java.util.*;
class Date
{
int month;
int day;
int year;

public Date(int month, int day, int year)
{
this.month=month;
this.day=day;
this.year=year;
}
public void setMonth(int month)
{
this.month=month;
}
public int getMonth()
{
return month;
}
public void setDay(int day)
{
this.day=day;
}
public int getDay()
{
return day;
}
public void setYear(int year)
{
this.year=year;
}
public int getYear()
{
return year;
}
public void displayDate(int month, int day, int year)
{
System.out.println(month+ "/" +day+ "/" +year);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println(" Date To be Displayed ");
System.out.println(" Month ");
int month=sc.nextInt();
System.out.println(" Day ");
int day=sc.nextInt();
System.out.println(" Year ");
int year=sc.nextInt();
Date dt=new Date(month,day,year);
dt.displayDate(month,day,year);
}
}





