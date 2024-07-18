import java.util.Scanner;
class Invoice
{
String part_number;
String part_description;
int quantity;
double price;

public Invoice()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter part number");
this.part_number=sc.nextLine();
System.out.println("Enter part description");
this.part_description=sc.nextLine();
System.out.println("Enter Quantity");
this.quantity=sc.nextInt();
System.out.println("Enter Price");
this.price=sc.nextDouble();
}
String getPart_Number()
{
return part_number;
}
void setPart_Number(String part_number)
{
this.part_number=part_number;
}
String getPart_Description()
{
return part_description;
}
void setPart_Description(String part_description)
{
this.part_description=part_description;
}
int getQuantity()
{
return quantity;
}
void setQuantity(int quantity)
{
if(quantity>0)
{
this.quantity=quantity;
}
else
{
this.quantity=0;
}
}
double getPrice()
{
return price;
}
void setPrice(double price)
{
if(price>0)
{
this.price=price;
}
else
{
this.price=0.0;
}
} 
public double getInvoiceAmount()
{
return quantity*price;
}
public static void main(String args[])
{
Invoice obj=new Invoice();
System.out.println("Invoice Details");
System.out.println("Part Number "+obj.getPart_Number());
System.out.println("Part Description "+obj.getPart_Description());
System.out.println("Quantity "+obj.getQuantity());
System.out.println("Price "+obj.getPrice());
System.out.println("Invoice Amount "+obj.getInvoiceAmount());
}
}














