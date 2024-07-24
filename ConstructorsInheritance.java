class Base{
    
    public Base(){
        System.out.println("This is Base class Constructor");
    }
}

class Derived extends Base{
    
    public Derived(){
        System.out.println("This is Derived class Constructor");
    }
}

public class Constructors_In_Inheritance{
    public static void main(String[] args){
        Base c1 = new Base();
        Derived c2 = new Derived();
    }
}
