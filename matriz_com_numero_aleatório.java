import java.util.Random;


import java.util.Scanner;


public class matriz {

    
	public static void main(String[] args) {
        
	Random num = new Random();
       
	 Scanner tcl = new Scanner(System.in);

       	 int matriz[][] = new int[5][4];

	
	// criar os for
        
	for (int L = 0; L < matriz.length; L++) {

              		for (int C = 0; C < matriz[0].length; C++) {
 
               	matriz[L][C] = num.nextInt(20);
 
           }
       
 }
        for (int L = 0; L < matriz.length; L++) {
    
        	for (int C = 0; C < matriz[0].length; C++) {
     
           	System.out.print("[" + matriz[L][C] + "] \t");
            }
       
     	      System.out.println("");

        
	            }
    
       }

}

