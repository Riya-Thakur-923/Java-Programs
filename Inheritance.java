class Base{
    int x;
    
    public void setx(int x){
        x=x;
    }
    public int getx(){
        return x;
    }
}
class Derived extends Base{
    
    /*These properties of Base class are also available in Derived class bcoz of 'extends' keyword so, you don't have to write it again.
    
    int x;
    
    public Base(int x){
        x=x;
    }
    
    public void setx(int x){
        x=x;
    }
    public int getx(){
        return x;
    }
    */
    
    int y;
    
    public void sety(int y){
        y=y;
    }
    public int gety(){
        return y;
    }
}

public class Inheritance{
    public static void main(String[] args){
        
        Base c1 = new Base();
        c1.setx(20);
        System.out.println(c1.getx());
        
        
        Derived c2 = new Derived();
        c2.setx(20);
        c2.sety(40);
        System.out.println(c2.getx()); 
        System.out.println(c2.gety()); 
    }
}