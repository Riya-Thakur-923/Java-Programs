class MyClass1 implements Runnable{
    
    public void run(){
        
        int i = 0;
        while(i<5){
            System.out.println("Im in MyClass1");
            i++;
        }
   
    }
    
}

class MyClass2 implements Runnable{
    
    public void run(){
        int i = 0;
        while(i<5){
            System.out.println("Im in MyClass2");
            i++;
        }
    }
    
}


public class Runnable_Interface{
    public static void main(String[] args){
        
        MyClass1 bullet1 = new MyClass1();
        Thread gun1 = new Thread(bullet1);
        
        MyClass2 bullet2 = new MyClass2();
        Thread gun2 = new Thread(bullet2);
        
        gun1.start();
        gun2.start();
        
    }
}