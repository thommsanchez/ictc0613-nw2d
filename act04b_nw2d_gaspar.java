import java.util.Scanner;
import java.util.Arrays;

public class act04b_nw2d_gaspar {   
    
    public static int[] insert(int n, int [] arr)
    {
       
            Scanner user = new Scanner (System.in);
        int i, x, pos;
    System.out.print("Please insert the value of the element: ");
    x = user.nextInt();
    System.out.print("Please insert the index to place the value: ");
    pos = user.nextInt();
    
        int array_1[] = new int[n + 1];

        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                array_1[i] = array_1[i];
            else if (i == pos - 1)
                array_1[i] = x;
            else
                array_1[i] = array_1[i - 1];
        }    
         return array_1; 
    }    
        
    public static int [] findLocationDelete(int[] inVal){
        int index;
        Scanner user = new Scanner (System.in);
        System.out.println("Please type the index to be deleted: ");
        index = user.nextInt();
       
        if (inVal == null || index < 0
            || index >= inVal.length) {
 
            return inVal;
        }
        int[] array_2 = new int[inVal.length - 1];
        for (int i = 0, k = 0; i < inVal.length; i++) {
            if (i == index) {
                continue;
            }
            array_2[k++] = array_2[i];  }  
        return array_2;
    }
    
    public static void main (String args[]){
        Scanner user = new Scanner (System.in);
        int n = 10;
        String type;
         int arr[]
            = { 28, 15, 95, 12, 17, 78, 4, 33, 50, 61};
         
        System.out.println("This is the inital array:\n"
                       + Arrays.toString(arr));
     
        System.out.println();
        System.out.println("Please type 'ENTER' if you want to enter a new element or 'DELETE' if you want to delete an element:");
        type = user.nextLine();      
        
            switch (type){
                case "ENTER":
                    arr = insert(n, arr);
                    int [] el2 = arr;
                 System.out.println(Arrays.toString(el2));   

                 
		boolean b = false;
		for(int i = n; i<el2.length; i++) {
			if(el2[i] == 0) {
				b = true;
			}
		} if ( b == false) {
			System.out.println("The array is full!");
		}
                    break;
                case "DELETE":
                    arr = findLocationDelete(arr);
                   int [] elements = arr;
                 System.out.println(Arrays.toString(elements));
                 
		boolean aa = false;
		for(int i = n; i<elements.length; i++) {
			if(elements[i] == 0) {
				aa = true;
			}
		} if ( aa == false) {
			System.out.println("The array not yet full!");
		}
                    break;
            }
    }
    }
	
