import java.util.*;
import java.util.Scanner;


public class ACT4B_NW2D_MULI {
    
   static int a;

    public static void main(String[] args) {
       
        Scanner s = new Scanner (System.in);
		
        System.out.println("Enter A Array's Length: ");
        
        int a = s.nextInt();
        int[] n = new int[a];
    
    System.out.println("Enter a number   "+ a +":");
        for(int i = 0; i < n.length; i++){n[i] = s.nextInt();
}
     
        
       
        int menu;             
     
        System.out.println("***Select a Number***") ;
        System.out.println("(1) Insert value ") ;
        System.out.println("(2) Delete value") ;
        System.out.println("(3) Traverse array") ;
        System.out.println("(4) Exit") ;
        
      System.out.println("Enter a number: ");
      menu = s.nextInt();
      
 
  
      switch (menu)
    {
          
    
          case 1:
        
            System.out.println("Index:");
    
            int loca = s.nextInt();
            System.out.println("Insert:");
    
            int val = s.nextInt();
    
        
            for(int f = n.length-1; f>loca; f--){n[f] = n [f-1];}
      
       
            n[loca] = val;
            System.out.println("Value:");
       
            for(int f:n){
         
                System.out.println(f);
}
        
   
            break;
    
                case 2:
        
               System.out.println("Delete: ");
               int del = s.nextInt();
        
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
   
      
                    System.out.println("End");
    
   
                    break;
}
}
      
    
}
