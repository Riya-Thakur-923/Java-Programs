abstract class Base{
    
    abstract void method1();
    
    public void method2(){
        System.out.println("Im good");
    }

}
/*
derived class should 
either:-
override abstract method of abstract base class
*/
class Derived1 extends Base{
    
    public void method1(){
        System.out.println("Hello!");
    }
    public void method3(){
        System.out.println("Hii!");
    }
    
}
/*
or:-
declare itself an abstract subclass
*/
abstract class Derived2 extends Base{
    
    public void method4(){
        System.out.println("Have a nice day!");
    }
    public void method5(){
        System.out.println("Wow");
    }
    
}

public class NewAbstract1{
    public static void main(String[] args){
//we can create obj for Derived1 which not an abstract class
        Derived1 d1 = new Derived1();
        d1.method1();
        d1.method3();
    }
}
    