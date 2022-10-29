
package act04b_nw2d_pabiton;

import java.util.Scanner;

public class Act04b_nw2d_pabiton{

static int r;

    public static void main(String[] args) {
       
        Scanner in = new Scanner (System.in);
		
        System.out.println("Enter the array's length: ");
        
        int m = in.nextInt();
        int[] n = new int[m];
    
    System.out.println("Enter a number which is  all the "+ m +" elements: ");
        for(int i = 0; i < n.length; i++){n[i] = in.nextInt();
}
     int option;             
     
        System.out.println("*****Select your option*****") ;
        System.out.println("(1) Insert a value ") ;
        System.out.println("(2) Delete a value") ;
        System.out.println("(3) Traverse array") ;
        System.out.println("(4) Exit") ;
        
      System.out.println("Enter your option: ");
      option = in.nextInt();
      
 
  switch (option)
    {
          
    case 1:
        
            System.out.println("Enter the number of location index: ");
    int loca = in.nextInt();
            System.out.println("Enter the value to insert: ");
    int val = in.nextInt();
    
        for(int f = n.length-1; f>loca; f--){n[f] = n [f-1];}
        n[loca] = val;
            System.out.println("After placing the value: ");
        for(int f:n){
            System.out.println(f);
}
        
    break;
    
    case 2:
        
            System.out.println("Enter index location to delete: ");
        int del = in.nextInt();
        
        for(int p = del; p<n.length-1; p++){
        n[p] = n[p+1];
            System.out.println(n[p]);
}
    break;
    
    case 3:
        
            System.out.println("Traverse array: ");
        for(int o = 0; o<n.length; o++){
            System.out.println(n[o]);
}
    break;
    
    case 4:
   
        System.out.println("The End");
    
    break;
}
}
}

		

