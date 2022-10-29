
package celestinonw2d;

import java.util.Scanner;
import java.util.Arrays;
public class Act04_Nw2d_Celestino {
     
    public static int[]Element(int n, int [] array)
    {
      
            Scanner user_input = new Scanner (System.in);
        int a, b, val;
        String start;
    System.out.print("Please enter the following value for the element: ");
    b = user_input.nextInt();
    System.out.print("Please specify the index where the element should be placed: ");
    val = user_input.nextInt();
    
        int newVal[] = new int[n + 1];

        for (a = 0; a < n + 1; a++) {
            if (a <val - 1)
                newVal[a] = array[a];
            else if (a == val - 1) 
               newVal[a] = b;
            else
                newVal[a] = array[a- 1];
        }    
         return newVal; 
    }    
        
    public static int [] LocDelete(int[] val){
        int ind;
        Scanner user_input = new Scanner (System.in);
        System.out.print("kindly enter the precise index you want to delete: ");
        ind = user_input.nextInt();
       
        if (val == null || ind < 0
            || ind >= val.length) {
 
            return val;
        }
        int[] anotherVal = new int[val.length - 1];
        for (int i = 0, k = 0; i < val.length; i++) {
            if (i == ind) {
                continue;
            }
            anotherVal[k++] = val[i];  }  
        return anotherVal;
    }
    
    public static void main (String args[]){
        Scanner user_input = new Scanner (System.in);
        int n = 3;
        String enterVal;
         int arr[]
            = { 34, 37, 56};
         
        System.out.println("It starts with this array:"
                       + Arrays.toString(arr));
     
        System.out.println();
        System.out.println("If you want to add a new element, type 'sure,' and if you want to remove one, use 'delete'");
        enterVal= user_input.nextLine();      
        
            switch (enterVal){
                case "sure":
                    arr = Element(n, arr);
                    int [] n11 = arr;
                 System.out.println(Arrays.toString(n11));   

		boolean b = false;
		for(int i = n; i<n11.length; i++) {
			if(n11[i] == 0) {
				b = true;
			}
		} if ( b == false) {
			System.out.println("The array is already complete!");
		}
                    break;
                case "delete":
                    arr = LocDelete(arr);
                   int [] elements = arr;
                 System.out.println(Arrays.toString(elements));
              
		boolean aa = false;
		for(int i = n; i<elements.length; i++) {
			if(elements[i] == 0) {
				aa = true;
			}
		} if ( aa == false) {
			System.out.println("The array is already complete!");
		}
                 
		break;
            }
                System.out.println("Have a nice day and Thankyou!");
            }
                
}

            
  

