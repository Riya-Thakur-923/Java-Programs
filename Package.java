package com.codewithharry.shape;

class Circle{
    double radius;
    double pi = 3.14;
    void setRadius(double r){
        radius = r;
    }
    double getCf(){
        return 2*pi*radius;
    }
    double getArea(){
        return pi*radius*radius;
    }
}
class Square{
    double side;
    void setSide(double s){
        side = s;
    }
    double getPerimeter(){
        return 4*side;
    }
    double getArea(){
        return side*side;
    }
}
class Rectangle{
    double length;
    double breadth;
    
    void Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    /*
    void setLength(double l){
        length = l;
    }
    void setBreadth(double b){
        breadth = b;
    }
    */
    
    double getPerimeter(){
        return 2*(length+breadth);
    }
    double getArea(){
        return length*breadth;
    }
}

public class Package{
    public static void main(String[] args){
        
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println(c1.getCf());
        System.out.println(c1.getArea());
        
        Square s1 = new Square();
        s1.setSide(4);
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getArea());
        
        Rectangle r1 = new Rectangle(12,5);
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
        
    }
}