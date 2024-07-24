import java.util.Scanner;
import java.util.Random;

public class Game{
	public static void main (String[] args){
	    
		Scanner in = new Scanner(System.in);
		System.out.println("Rock!Paper!Scissors!\n\nEnter your choice: ");
  	int you = in.nextInt();
		
		
  	Random rdm = new Random();
 	 int comp = rdm.nextInt(3);
	  /*
	  if(comp==0){
	  	System.out.println("Computer choice: Rock");
	  }
	  else if(comp==1){
	  	System.out.println("Computer choice: Paper");
	  }
	  else if(comp==2){
	  	System.out.println("Computer choice: Scissors");
	  }
	  */
	  	 
	  	 
 	 
    if(you==0 && comp==1 || you==1 && comp==2 || you==2 && comp==0){
    	System.out.println("\nComputer won!!");
    }
    
    else if(you==0 && comp==2 || you==1 && comp==0 || you==2 && comp==1){
    	System.out.println("\nYou won!!");
    }
    
    else if(you==0 && comp==0 || you==1 && comp==1 || you==2 && comp==2){
    	System.out.println("\nIt's a tie!");
    }
    
    else{
    	System.out.println("\nEnter a valid move!");
    }
	}
}

