//Single Inheritance 
class Vehicle
{
    void accelerate()
    {
        System.out.println("\nPress Accelerator!");
    }
    void brake()
    {
        System.out.println("Press Brake!");
    }
}

class Car extends Vehicle
{
    int carYear;
    void showCarYear()
    {
        System.out.println("Car Year is: "+carYear);
    }
    void color()
    {
        System.out.println("Red in color");
    }
}

class Main
{
    public static void main(String args[])
    {
        Car nano = new Car();
        nano.carYear=2012;
        nano.showCarYear();
        nano.color();
        nano.accelerate();
        nano.brake();
    }
}