import java.util.Scanner;
import java.util.Arrays;

public class Activity4B {   
    // Inserting opertation in arrays
    public static int[] insertElement(int n, int [] arr)
    {
       
            Scanner user_input = new Scanner (System.in);
        int i, x, pos;
    System.out.print("Value of the element to be inserted: ");
    x = user_input.nextInt();
    System.out.print("Specific index at which element to be inserted: ");
    pos = user_input.nextInt();
    
        int newarr[] = new int[n + 1];

        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }    
         return newarr; 
    }    
        // Deleting operation in arrays
    public static int [] findLocationDelete(int[] arr){
        int index;
        Scanner user_input = new Scanner (System.in);
        System.out.print("Input the specific index you wish to eliminate: ");
        index = user_input.nextInt();
       
        if (arr == null || index < 0
            || index >= arr.length) {
 
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];  }  
        return anotherArray;
    }
    
    public static void main (String args[]){
        Scanner user_input = new Scanner (System.in);
        int n = 10;
        String choice;
         int arr[]
            = { 22, 14, 30, 13, 15, 8, 29, 89, 97, 35};
         // printing the arrays
        System.out.println("This is the inital array:\n"
                       + Arrays.toString(arr));
     
        System.out.println();
        System.out.println("Type 'insert' if you like to input new element or 'delete' if you wish to eliminate an element:");
        choice = user_input.nextLine();      
        
            switch (choice){
                case "insert":
                    arr = insertElement(n, arr);
                    int [] el2 = arr;
                 System.out.println(Arrays.toString(el2));   

                 // cheking if the array is full
		boolean b = false;
		for(int i = n; i<el2.length; i++) {
			if(el2[i] == 0) {
				b = true;
			}
		} if ( b == false) {
			System.out.println("The array is already full!");
		}
                    break;
                case "delete":
                    arr = findLocationDelete(arr);
                   int [] elements = arr;
                 System.out.println(Arrays.toString(elements));
                 // cheking if the array is full
		boolean aa = false;
		for(int i = n; i<elements.length; i++) {
			if(elements[i] == 0) {
				aa = true;
			}
		} if ( aa == false) {
			System.out.println("The array is already full!");
		}
                    break;
            }
             
            
    }
    }

