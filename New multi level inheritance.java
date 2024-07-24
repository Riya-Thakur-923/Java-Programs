//Multi level Inheritance 
class A
{
    void method1()
    {
        System.out.println("\nI am in class A\n");
    }
}

class B extends A
{
    void method2()
    {
        System.out.println("\nI am in class B");
    }
}

class C extends B
{
    void method3()
    {
        System.out.println("\nI am in class C");
    }
}

class Main
{
    public static void main(String args[])
    {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        
        obj1.method1();
        obj2.method1();
        obj3.method1();
        obj2.method2();
        obj3.method2();
        obj3.method3();
    }
}