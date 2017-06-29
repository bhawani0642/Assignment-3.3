import java.util.Scanner;

//program to compare the Bitwise AND and logical AND
public class CompareAND {
	 public static void main(String[] args) {
	        byte bit1, bit2; //since we can't just store a single bit, we use byte type for them
	        Scanner keyboard = new Scanner(System.in);
	        
	        //get inputs from user
	        System.out.println("Enter the 2 bits: ");
	        bit1 = keyboard.nextByte(); //get the 1st input
	        bit2 = keyboard.nextByte(); //get the 2nd input
	        
	        
	        //bitwise operator & works on bits (i.e. numeric ) where as && works on boolean values true/false
	        
	        //perform bitwise & 
	        byte bitAND = (byte)(bit1 & bit2);
	        boolean logicAND = false;
	        
	        //use logical opertor && , && outputs true only when both its inputs are true and false otherwise
	        if(bit1 == 1 && bit2 == 1)
	            logicAND = true;
	            
	        System.out.println("Bitwise AND  = " + bitAND);
	        System.err.println("Logic  AND  = " + logicAND);
	    }
	}


