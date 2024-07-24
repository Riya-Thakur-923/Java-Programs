//java program can have only one public class

//Custom Class
class Employee{
    int id;
    String name;
    int salary;
    
    public void printDetails(){
        System.out.println("My id is" +id);
        System.out.println("My name is" +name);
    }
    
    public int getSalary(){
        return salary;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void call(){
        System.out.println("Calling....");
    }
}

class Square{
    int side;
    
    public int perimeter(){
        return 4*side;
    }
    public int area(){
        return side*side;
    }
}

class Rectangle{
    int length;
    int breadth;
    
    public int perimeter(){
        return 2*(length+breadth);
    }
    public int area(){
        return length*breadth;
    }
}

class Circle{
    int radius;
    
    public float circumference(){
        return 2*3.14*radius;
    }
    public float area(){
        return 3.14*radius*radius;
    }
}


public class ClassName{
    public static void main(String[] args){
        
//Class Employee     
        //Instantiation of objects
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        //Setting Attributes
        e1.id = 12;
        e1.name = "Harry";
        e1.salary = 50;
        
        e2.id = 19;
        e2.name = "Riya";
        e2.salary = 90;
        
        //Calling Functions
        e1.printDetails();
        e1.getSalary();
        
        e2.printDetails();
        e2.getSalary();
        
        
//Class CellPhone    
        CellPhone oppo = new CellPhone();
        oppo.ring();
        oppo.vibrate();
        oppo.call();
        
//Class Square
        Square sq = new Square();
        sq.side = 5;
        sq.perimeter();
        sq.area();    
        
//Class Rectangle        
        Rectangle rect = new Rectangle();
        rect.length = 12;
        rect.breadth = 5;
        rect.perimeter();
        rect.area();
        
//Class Circle
        Circle o = new Circle();
        o.radius = 5;
        o.circumference();
        o.area();    
        
    }
}