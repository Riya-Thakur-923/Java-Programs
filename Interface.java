package chapter12;

interface InterfaceA{
    void method1();
    void method2();
}

interface InterfaceB{
    void method3();
    void method4();
}

class ClassA implements InterfaceA, InterfaceB{
    
    public void method1(){
        ;System.out.println("Hello!");
    }
    public void method2(){
        System.out.println("Hii!");
    }
    public void method3(){
        System.out.println("Im good");
    }
    public void method4(){
        System.out.println("Thank you");
    }
    public void method5(){
        System.out.println("Okay");
    }
    
}

public class NewInterface1{
    public static void main(String[] args){

        ClassA c1 = new ClassA();
        
        c1.method1();
        c1.method2();
        c1.method3();
        c1.method4();
        c1.method5();
    }
}
    