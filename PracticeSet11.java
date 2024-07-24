package chapter12;

//Question 1 and 2
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refilling...");
    }
    void changeNib(){
        System.out.println("Changing Nib...");
    }
}

public class Question1and2{
    public static void main(String[] args){
        FountainPen fp = new FountainPen();
        fp.refill();
        fp.write();
        fp.changeNib();
    }
}

//Question 3 and 5
interface Animal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}
class Human extends Monkey implements Animal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
    public void speak(){
        System.out.println("Speaking...");
    }
}

public class Question3and5{
    public static void main(String[] args){
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        //m1.eat();
        //m1.sleep();
        //m1.speak(); 
        /*You cant use other methods bcoz you have given the reference of 'Monkey' which means that you can only use the methods of Monkey*/
    }
}

//Question 4
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone extends Telephone{
    void ring(){
        System.out.println();
    }
    void lift(){
        System.out.println();
    }
    void disconnect(){
        System.out.println();
    }
    void search(){
        System.out.println();
    }
    void watchYouTube(){
        System.out.println();
    }
}
public class Question4{
    public static void main(String[] args){
        Telephone p = new SmartPhone();
        p.ring();
        p.lift();
        p.disconnect();
    }
}
//Question 6 and 7
interface TVRemote{
    void pressButtons();
}
interface SmartTVRemote extends TVRemote{
    void recordTV();
}
class TV implements TVRemote{
    public void pressButtons(){
        System.out.println("Click! Click!");
    }
}
public class{
    public static void main(String[] args){
        TV tv = new TV();
        tv.pressButtons();
    }
}        
        
        
        
        
        
        
        
        