class MyClass1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}

class MyClass2 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class{
    public static void main(String[] args){
        
        MyClass1 c1 = new MyClass1();
        MyClass2 c2 = new MyClass2();
        
        c1.setPriority(4);
        c2.setPriority(9);
        
        System.out.println(c1.getPriority());
        System.out.println(c2.getPriority());
        System.out.println(Thread.currentThread().getState());
        
        c1.start();
        c2.start();
    }
}


