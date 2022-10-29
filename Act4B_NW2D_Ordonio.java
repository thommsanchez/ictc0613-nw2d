package DSA;
import java.util.*;
public class Act4B_NW2D_Ordonio {

	static int i, size, val, ins, loc, del, repeat;
	static int num[] = new int[size];
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {

		do {
		System.out.print("Enter size of Array: ");
		size = Integer.parseInt(in.next());
		int num[] = new int[size];
		
		System.out.println("Enter value in Array: ");
		for(val = 0; val<num.length; val++) {
			num[val] = Integer.parseInt(in.next());
		}
		System.out.println("---------------------");
		System.out.println("""
							Printing the Array 
							Index\tValue
							""");
		for(i = 0; i<num.length; i++) {
			System.out.println("[" + i +"]\t" + num[i]);
		}
		
			isFull();
		
		System.out.print("""
							---------------------
							Option 
							1. Insert a value
							2. Delete a value
							3. Traverse Array
							4. Exit
							---------------------
							""");
		System.out.print("Enter your choice: ");
		int choice = in.nextInt();
		
		switch (choice) {
			case 1: 
				System.out.print("Enter the location index: ");
				loc = Integer.parseInt(in.next());
				System.out.print("Enter value to be inserted: ");
				ins = Integer.parseInt(in.next());
				
				for(int j = num.length-1; j>loc; j--) {
					num[j] = num[j-1];
				}
				
				num[loc] = ins;
				System.out.print("""
								---------------------
								New Array Value
								""");
				for(int j:num) {
					System.out.print(j + " ");
				}
					break;
					
			case 2:
				System.out.print("Enter the index that is need to be deleted: ");
				del = in.nextInt();
				
				if(num == null || del < 0 || del > num.length) {
					System.out.println("No removal operation can be performed!!");
				}
				
				 int[] copyArray = new int[num.length - 1]; 
				 System.arraycopy(num, 0, copyArray, 0, del);
				 System.arraycopy(num, del + 1, copyArray, del, num.length - del - 1);
				 System.out.println("\nArray size after deleting an element\n" + Arrays.toString(copyArray)); 
					break;
				
			case 3:
				System.out.println("\nTraverse Array");
				for(i=0; i<num.length; i++) {
					System.out.print(num[i] + "  ");
				}
					break;
				
			case 4:
				System.out.print("""
						---------------------
						Goodbye!
						""");
					break;
				
			default:
				System.out.print("""
						---------------------
						Error Input!
						""");
					break;
		}
		System.out.print("""
				\n---------------------
				Do you want to do it again?\n
				Press 1 if YES
				Press 2 if NO\n
				Answer: """);
		 	repeat = in.nextInt();
		 	System.out.println("---------------------");
		 	
		 	if(repeat == 2) {
		 		System.out.println("Thank You!");
		 	}

		}
		while(repeat == 1);
	}
	
	public static void isFull() {
		
		if(val == 0) {
			System.out.println("\nThe Array is empty");
		}
		else
			System.out.println("\nThe Array is now full.");
	
		}
}
