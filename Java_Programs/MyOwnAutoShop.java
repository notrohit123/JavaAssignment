class Car {
    int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.regularPrice * 0.9; 
        } else {
            return super.regularPrice * 0.8;         }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) 
    {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return super.regularPrice - manufacturerDiscount;
    }
}

class Sedan extends Car {
    int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return super.regularPrice * 0.95;
 } 
else {
return super.regularPrice * 0.9; 
     }
    }
}

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(180, 20000, "Red", 25);
        Ford ford1 = new Ford(200, 30000, "Blue", 2015, 2000);
        Ford ford2 = new Ford(220, 35000, "Black", 2018, 2500);
        Car car = new Car(150, 15000, "Silver");

        System.out.println("Sale price of Sedan: $" + sedan.getSalePrice());
        System.out.println("Sale price of Ford 1: $" + ford1.getSalePrice());
        System.out.println("Sale price of Ford 2: $" + ford2.getSalePrice());
        System.out.println("Sale price of Car: $" + car.getSalePrice());
    }
}
