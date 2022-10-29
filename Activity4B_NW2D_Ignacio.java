
package com.mycompany.act4b_nw2d_ignacio;
import java.util.Scanner;
public class Act4B_NW2D_Ignacio {
    
    static int Num;
    public static void main(String[] args) {
 

	
		Scanner input = new Scanner(System.in);
		
		String start;
		do {
		System.out.println("Enter how many values you want to store in an array? ");
		int num = input.nextInt();
                 int[] Num = new int[num];
                      
		System.out.println();
		System.out.println("Insert elements of array: ");
		for(int i = 0; i < num; i++) {
			Num[i] = input.nextInt();
		}
	
		System.out.println();
		System.out.println("Value of an index");
		for (int i = 0; i < Num.length; i++) {
			System.out.println(i + "             " + Num[i]);
		}
		
		boolean b = false;
		for(int i = num; i<Num.length; i++) {
			if(Num[i] == 0) {
				b = true;
			}
		} if ( b == false) {
			System.out.println("\nThe array are full");
		}
		
		
		System.out.println("\n-------------------------\n");
		
		
		int n;
		System.out.println("What do you want to do? Please enter the number");
		System.out.println("1. Insert a value");
		System.out.println("2. Delete a value");
		System.out.println("3. Traverse array");
		System.out.println("4. Exit");
	
		System.out.println();
		n = input.nextInt();
		System.out.println("\n-------------------------\n");
		
		switch(n)
		{
		case 1:
			System.out.println("Enter the location you want to add elements: ");
			int insertLoc = input.nextInt();
			System.out.println("Enter the value you want to insert: ");
			int value = input.nextInt();
			
			for(int i=Num.length - 1; i > insertLoc; i--) {
				Num[i]=Num[i-1];
			}
			
			Num[insertLoc]=value;
			System.out.println("\nArrays after inserting a value.");
			for(int i:Num) {
				System.out.println(i);
			}
			break;
			
		case 2:
			System.out.println("Enter the index of the location you want to delete: ");
			int deleteLoc = input.nextInt();
			
			System.out.println("\nArrays after deleting a value.");
			for(int i = deleteLoc; i < Num.length - 1;i++) {
				Num[i] = Num[i+1];
				System.out.println(Num[i]);
			}
			break;
			
			
		case 3:
			System.out.println("Content of the Array: ");
			for(int i = 0; i<Num.length; i++) {
				System.out.println(Num[i]);
			}
			break;
			
		
		case 4:
			System.out.println("Thank you");
			return;
		
		default: System.out.println("Please Try Again!");
		
		}
		
		System.out.println("\n-------------------------\n");
		System.out.println("Do you want to go back to the beginning? Y or N");
		start = input.next();
		}
		while (start.equalsIgnoreCase("Y"));
		System.out.println("\n-------------------------\n");
		input.close();
	}
	}