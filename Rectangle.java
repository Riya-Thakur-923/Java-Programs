class Rectangle{
    double length;
    double breadth;
    
    //Constructor
    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    
    /*Setters
    public void setLength(double l){
        length = l;
    }
    public void setBreadth(double b){
        breadth = b;
    }
    */
    
    //Getters
    public double getPerimeter(){
        return 2*(length+breadth);
    }
    public double getArea(){
        return length*breadth;
    }
}

public class Question3{
    public static void main(String[] args){
        Rectangle r = new Rectangle(12,5);
        //r.setLength(12);
        //r.setBreadth(5);
        System.out.println(r.getPerimeter());
        System.out.println(r.getArea());
        
    }
}