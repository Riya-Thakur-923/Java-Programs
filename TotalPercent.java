/*WAP to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard.(Marks are out of 100.)*/

import java.util.Scanner;
public class Percentage {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the marks of English: ");
        float sub1 = sc.nextFloat();
        
        System.out.println("Enter the marks of Maths: ");
        float sub2 = sc.nextFloat();
        
        System.out.println("Enter the marks of Hindi: ");
        float sub3 = sc.nextFloat();
        
        System.out.println("Enter the marks of Science: ");
        float sub4 = sc.nextFloat();
        
        System.out.println("Enter the marks of GK: ");
        float sub5 = sc.nextFloat();
        
        
        
        float ObtMarks = sub1+sub2+sub3+sub4+sub5;
        System.out.print("Total Marks Obtained: " +ObtMarks);
        //System.out.println(ObtMarks);
        
        
        float percent = (ObtMarks/500)*100;
        System.out.print("Total Marks Obtained in Percentage% : " +percent);
        //System.out.println(percent);
        
    }
    
}