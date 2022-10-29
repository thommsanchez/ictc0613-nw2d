
package Week4Act4b;

import java.util.Scanner;
public class Act04_NW2D_Rosario {
    
public static void main(String[] args) {
	Scanner see = new Scanner(System.in);
		
	String start;
	do {
	System.out.println("Enter your preferred amount of values ");
        System.out.println("TAKE NOTE THAT THE ONLY VALUE YOU CAN INPUT ARE INTEGERS ");
	int num = Integer.parseInt(see.next());
	int[] getNum = new int[num];
		
	System.out.println();
	System.out.println("Insert your array elements:  ");
	for(int i = 0; i < num; i++) {
        	getNum[i] = see.nextInt();
	}
	System.out.println();
	System.out.println("Index        Value");
	for (int i = 0; i < getNum.length; i++) {
	System.out.println(i + "             " + getNum[i]);
		}
            boolean b = false;
            for(int i = num; i<getNum.length; i++) {
                if(getNum[i] == 0) 
                {
                    b = true;
		}
		} if ( b == false) {
                    System.out.println("\nThe array is already full!");
		}	
        int n;
	System.out.println("Options:");
	System.out.println("Please enter 1 if you want to insert a value");
	System.out.println("Please enter 2 if you want to delete a value");
	System.out.println("Please enter 3 if you want to traverse array");
	System.out.println("Please enter 4 if you want to Exit");
	
	System.out.println("\nEnter here: ");
		n = see.nextInt();
		
	switch(n)
            {
            case 1:
		System.out.println("Enter the value's location: ");
                    int insertLoc = see.nextInt();
		System.out.println("Enter the value to be inserted: ");
                    int value = see.nextInt();		
                    for(int i=getNum.length - 1; i > insertLoc; i--) 
                {
                    getNum[i]=getNum[i-1];
		}	
                    getNum[insertLoc]=value;
                System.out.println("\nAfter inserting a value.");
                    for(int i:getNum) 
                {
                    System.out.println(i);
		}
                    break;	
            case 2:	
                System.out.println("Enter the index location to be deleted: ");
                    int EleDel = see.nextInt();	
		System.out.println("\nAfter deleting a value.");
                    for(int i = EleDel; i < getNum.length - 1 ;i++) 
                {
                    getNum[i] = getNum[i+1];
                    System.out.println(getNum[i]);
		}
                    break;  
            case 3:
		System.out.println("Content of the Array: ");
                    for(int i = 0; i<getNum.length; i++) 
                        {
		System.out.println(getNum[i]);
			}
			break;	
            case 4:
		System.out.println("Thank you!");
			return;
		
		default: System.out.println("Try Again!");
		}
		System.out.println("\n-------------------------\n");
		System.out.println("Restart program? Yes or No");
		start = see.next();
		}
		while (start.equalsIgnoreCase("Yes"));
		System.out.println("\n-------------------------\n");
		see.close();
	}
}
