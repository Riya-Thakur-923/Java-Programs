class Thread1 extends Thread{
    
    public void run(){
        
        int i = 0;
        while(i<100){
            System.out.println("Thread is running...");
            System.out.println("Im cooking!");
            i++;
        }
        
    }
}

class Thread2 extends Thread{
    
    public void run(){
        
        int i = 0;
        while(i<100){
            System.out.println("Thread is running...");
            System.out.println("Im playing games!");
            i++;
        }
        
    }
}

public class ThreadClass{
    public static void main(String[] args){
        
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        t1.start();
        t2.start();
    }
}