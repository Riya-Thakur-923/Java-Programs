class Custom{
    int a;
    
    //Constructor
    Custom(int a){
        this.a = a;
    }
    
    //a=a; error
    // this.a=a; ✓
    
    public int returnsInt(){
        return 1;
    }
}

public class This_Super{
    public static void main(String[] args){
        
        Custom c1 = new Custom(5);
        System.out.println(c1.returnsInt());
    }
}
    