
package MagdatoNW2D;

import java.util.Scanner;
public class act4b_nw2d_magdato {
	
	static int valNum;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String start;
		do {
		System.out.println("How many values do you want? ");
		int num = Integer.parseInt(in.next());
		int[] valNum = new int[num];
		
		System.out.println();
		System.out.println("Insert array elements: ");
		for(int i = 0; i < num; i++) {
			valNum[i] = in.nextInt();
		}
	
		System.out.println();
		System.out.println("Index        Value");
		for (int i = 0; i < valNum.length; i++) {
			System.out.println(i + "             " + valNum[i]);
		}
		
		boolean b = false;
		for(int i = num; i<valNum.length; i++) {
			if(valNum[i] == 0) {
				b = true;
			}
		} if ( b == false) {
			System.out.println("\nIt is already full!");
		}
		
		
		System.out.println("\n-------------------------\n");
		
		
		int n;
		System.out.println("Options:");
		System.out.println("1. Insert a value");
		System.out.println("2. Delete a value");
		System.out.println("3. Traverse array");
		System.out.println("4. Exit");
	
		System.out.println("\nWhat did you choice?");
		n = in.nextInt();
		System.out.println("\n-------------------------\n");
		
		switch(n)
		{
		case 1:
			System.out.println("Enter the value's location: ");
			int insertLoc = in.nextInt();
			System.out.println("Enter the value to be inserted: ");
			int value = in.nextInt();
			
			for(int i=valNum.length - 1; i > insertLoc; i--) {
				valNum[i]=valNum[i-1];
			}
			
			valNum[insertLoc]=value;
			System.out.println("\nAfter inserting a value.");
			for(int i:valNum) {
				System.out.println(i);
			}
			break;
			
		case 2:
			System.out.println("Enter the index location to be deleted: ");
			int deleteLoc = in.nextInt();
			
			System.out.println("\nAfter deleting a value.");
			for(int i = deleteLoc; i < valNum.length - 1;i++) {
				valNum[i] = valNum[i+1];
				System.out.println(valNum[i]);
			}
			break;
			
			
		case 3:
			System.out.println("Content of the Array: ");
			for(int i = 0; i<valNum.length; i++) {
				System.out.println(valNum[i]);
			}
			break;
			
		
		case 4:
			System.out.println("Thank you!");
			return;
		
		default: System.out.println("Try Again!");
		
		}
		
		System.out.println("\n-------------------------\n");
		System.out.println("Do you want to go back to the beginning? Yes or No");
		start = in.next();
		}
		while (start.equalsIgnoreCase("Yes"));
		System.out.println("\n-------------------------\n");
		in.close();
	}
	}
