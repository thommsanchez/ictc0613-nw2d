
package act4b_alki;

import java.util.Scanner;
import java.util.Arrays;

public class Act4B_Alki {

    public static int[] insElement(int n, int [] array)
    {
        Scanner input = new Scanner (System.in);
        int i, z, loc;
            System.out.print("Element you want to insert: ");
            z = input.nextInt();
            System.out.print("Index of the element: ");
            loc = input.nextInt();
    
        int nArray[] = new int[n + 1];

            for (i = 0; i < n + 1; i++) 
            {
                if (i < loc - 1)
                nArray[i] = array[i];
                else if (i == loc - 1)
                nArray[i] = z;
                else
                nArray[i] = array[i - 1];
            }    
            return nArray; 
    }     
    public static int [] findLocationDelete(int[] y){
        int index;
        Scanner scan = new Scanner (System.in);
        System.out.print("Index of the element you to remove: ");
        index = scan.nextInt();
       
        if (y == null || index < 0
            || index >= y.length) {
 
            return y;
        }
        int[] aArray = new int[y.length - 1];
        for (int i = 0, m = 0; i < y.length; i++) {
            if (i == index) {
                continue;
            }
            aArray[m++] = y[i];  }  
        return aArray;
    }
    
    public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
                int n =5;
                String option;
                int arr[] = {13, 10, 22, 8, 6};
         
        System.out.println("This is the element of array: "  + Arrays.toString(arr));    
        System.out.println();
        System.out.println("Type 'insert' if you want to input or 'remove' if you want to delete an element: ");
        option = sc.nextLine();      
        
            switch (option){
                case "insert":
                    arr = insElement(n, arr);
                    int [] elmnt = arr;
                    System.out.println(Arrays.toString(elmnt));    
                    System.out.println("The array is already full!");
                    
                break;
                case "remove":
                    arr = findLocationDelete(arr);
                    int [] elmnt2 = arr;
                    System.out.println(Arrays.toString(elmnt2));                 
                    System.out.println("The array is not full!");     
                break;
               
            }                      
        }
    }

    
    
