class MyClass1 extends Thread{
    public MyClass1(String name){
        super(name);
    }
    
    public void run(){
        while(true){
            System.out.println("Hey!" +getName());
        }
    }
}

public class ThreadPriority{
    public static void main(String[] args){
        
        MyClass1 c1 = new MyClass1("Riya");
        MyClass1 c2 = new MyClass1("Riya2");
        MyClass1 c3 = new MyClass1("Riya3");
        MyClass1 c4 = new MyClass1("Riya4");
        
        c1.setPriority(Thread.MAX_PRIORITY);
        c4.setPriority(Thread.MIN_PRIORITY);
        
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        
    }
}