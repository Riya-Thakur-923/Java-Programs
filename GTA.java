package com.rockstargames

class GTA{
    public void walk(){
        System.out.println("Walking...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void drive(){
        System.out.println("Driving...");
    }
    public void shoot(){
        System.out.println("Shooting...");
    }
}

public class Game{
    public static void main(String[] args){
        
        GTA cj = new GTA();
        cj.walk();
        cj.run();
        cj.drive();
        cj.shoot();
    }
}