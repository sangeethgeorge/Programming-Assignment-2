//***********************************************************************************************************************************************
// Figures.java				Author : Sangeeth George	Date: 2020-08-02
// Programming Fundamentals Fall 2019
//
// Demonstrates the process of printing various stars.
//***********************************************************************************************************************************************

package Week4;

import java.util.Scanner;

public class Figures {
	/**
	 * Prints different types of star figures.
	 * 
	 */
	public static void main(String[] args) {
		/* Asks user to input odd integer*/
		System.out.println("Enter the size of the figure (odd number): ");
		Scanner user = new Scanner(System.in);
		int size = user.nextInt();
		/* if integer is even*/
		while(size%2==0) {
				System.out.println("Invalid figure size - must be odd number: ");
				System.out.println();
				System.out.println("Renter the size of the figure: ");		
				size = user.nextInt();	System.out.println();
						}
		/* If integer is odd, asks user to pick from options 1-4. Option 4 is enclosed in argument.*/
		System.out.println("Menu:"+"\n"+"1. Print box"+"\n"+"2. Print diamond"+"\n"+"3. Print X"+"\n"+"4. Quit program"+"\n");
		System.out.println("Please select an option: ");
		int opt = user.nextInt();
			System.out.println();		
			switch (opt) {
			case 1:
				printBox(size);
				break;
			case 2:
				printDiamond(size);
				break;
			case 3:
				printX(size);
				break;
			case 4:	
				System.out.println("Good bye!");
				break;
			}
		user.close();			
		}
	/* option 1*/
    public static void printBox(int size) {
        for(int i=0; i<size; i++) { 
            for(int j=0; j<size; j++) 
            	{
                System.out.print("* "); 
            	} 
            System.out.println(); 
        	} 
   }
	/* option 2*/
    public static void printDiamond (int size){ 
        int k = 0; 
        for (int i = 1; i <= size; i++) { 
            for (int j = 1; j <= size - i; j++) { 
                System.out.print(" "); 
            } 
            while (k != (2 * i - 1)) { 
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
                k++; 
            } 
            k = 0; 
            System.out.println(); 
        } 
        size--; 
        for (int i = size; i >= 1; i--) { 
            for (int j = 0; j <= size - i; j++) { 
                System.out.print(" "); 
            } 
            k = 0; 
            while (k != (2 * i - 1)) { 
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
                k++; 
            } 
            System.out.println(); 
        } 
    } 
	/* option 3*/
    public static void printX (int size){
    	for (int i = 1; i <= size * 2 + 1; i++){
            for (int j = 0; j <= size * 2 + 1; j++) {
            	if (i == j) 
                	{
                    System.out.print("*");
                	}
                else if (i + j == (size * 2 + 2))
                	{
                    System.out.print("*");
                	}
                else
                	{
                    System.out.print(" ");
                	}
            	}
            System.out.println("");
        }
    }
} 
    