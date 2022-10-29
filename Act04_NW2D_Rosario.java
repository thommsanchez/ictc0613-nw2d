
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
    System.out.println("If you wish to insert new value press 1");
    System.out.println("If you wish to delete a value press 2");
    System.out.println("If you wish to traverse the array press 3");
    System.out.println("If you wish to exit press 1");
	
    System.out.println("\nEnter here: ");
		n = see.nextInt();
		
	switch(n)
            {
        case 1:
            System.out.println("Enter the value's location: ");
                    int loc = see.nextInt();
            System.out.println("Enter a new value: ");
                    int ele = see.nextInt();		
                    for(int i=getNum.length - 1; i > loc; i--) 
                {
                    getNum[i]=getNum[i-1];
		}	
                    getNum[loc]=ele;
            System.out.println("\nNew array contents.");
                    for(int i:getNum) 
                {
                    System.out.println(i);
		}
                    break;	
        case 2:	
            System.out.println("What index number do you wish to be deleted? ");
                    int EleDel = see.nextInt();	
            System.out.println("\nNew array contents.");
                    for(int p = EleDel; p < getNum.length - 1 ;p++) 
                {
                    getNum[p] = getNum[p+1];
                    System.out.println(getNum[p]);
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
		System.out.println("Restart program? Yes or No");
		start = see.next();
		}
		while (start.equalsIgnoreCase("Yes"));
		see.close();
	}
}