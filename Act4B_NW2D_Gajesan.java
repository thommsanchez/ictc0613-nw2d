
package com.mycompany.act4b_nw2d_gajesan;

import java.util.Scanner;

public class Act4B_NW2D_Gajesan {
 static int numvalue;
       public static void main(String[] args) {
      
		Scanner g = new Scanner(System.in);
		
		String start;
		do {
		System.out.println("Enter how many values you want to store in an array? ");
		int num = g.nextInt();
                 int numValue[] = new int[num];
                      
		System.out.println();
		System.out.println("Insert elements of array: ");
		for(int i = 0; i < num; i++) {
			numValue[i] = g.nextInt();
		}
	
		System.out.println();
		System.out.println("Value of an index");
		for (int i = 0; i < numValue.length; i++) {
			System.out.println(i + "             " + numValue[i]);
		}
		
		boolean b = false;
		for(int i = num; i<numValue.length; i++) {
			if(numValue[i] == 0) {
				b = true;
			}
		} if ( b == false) {
			System.out.println("\nThe array are already full");
		}
		
		
		System.out.println("\n-------------------------\n");
		
		
		int options;
		System.out.println("What do you want to do? Please enter the number");
		System.out.println("1. Insert a value");
		System.out.println("2. Delete a value");
		System.out.println("3. Traverse array");
		System.out.println("4. Exit");
	
		System.out.println();
		options = g.nextInt();
	
		
		switch(options)
		{
		case 1:
			System.out.println("Enter the location you want to add elements: ");
			int insertLoc = g.nextInt();
			System.out.println("Enter the value you want to insert: ");
			int value = g.nextInt();
			
			for(int i=numValue.length - 1; i > insertLoc; i--) {
				numValue[i]=numValue[i-1];
			}
			
			numValue[insertLoc]=value;
			System.out.println("\nArrays after inserting a value.");
			for(int i:numValue) {
				System.out.println(i);
			}
			break;
			
		case 2:
			System.out.println("Enter the index of the location you want to delete: ");
			int deleteLoc = g.nextInt();
			
			System.out.println("\nArrays after deleting a value.");
			for(int i = deleteLoc; i < numValue.length - 1;i++) {
				numValue[i] = numValue[i+1];
				System.out.println(numValue[i]);
			}
			break;
			
			
		case 3:
			System.out.println("Content of the Array: ");
			for(int i = 0; i<numValue.length; i++) {
				System.out.println(numValue[i]);
			}
			break;
			
		
		case 4:
			System.out.println("Thank you");
			return;
		
		default: System.out.println("Please Try Again!");
		
		}
		
		System.out.println("\n-------------------------\n");
		System.out.println("Do you want to go back to the beginning? YES or NO");
		start = g.next();
		}
		while (start.equalsIgnoreCase("YES"));
		System.out.println();
		g.close();
	}
	}