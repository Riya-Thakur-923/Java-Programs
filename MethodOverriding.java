class CustomA{
    int x;
    
    public int method1(){
        return 10;
    }
    public void method2(){
        System.out.println("Hey! I'm method2 of CustomA");
    }
}
class CustomB extends CustomA{
    
    public void method2(){
        System.out.println("Hey! I'm method2 of CustomB");
    }
    public void method3(){
        System.out.println("Hey! I'm method3 of CustomB");
    }
}

public class Method_Overriding{
    public static void main(String[] args){
        
        CustomA a = new CustomA();
        a.method2();
        //calls method2 of CustomA


        CustomB b = new CustomB();
        b.method2();
        /*calls method2 of CustomB
        bcoz now it has its own method2*/
    }
}
    