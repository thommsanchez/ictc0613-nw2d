
package week.pkg4.activity.pkg4b;

import java.util.Scanner;
public class Act4B_NW2D_Dabu {

    public static void main (String [] args){
        myMethod();
    }
    
    public static void myMethod(){    
    Scanner input = new Scanner (System.in);    
    int size;
    
    		System.out.print("Please enter the size of Array: ");
 		size = input.nextInt();
		int [] ArrayElem = new int[size];
  
    		System.out.println("Please enter the Array Elements: ");
			for (int i = 0; i < size; i++) {
				ArrayElem [i] = input.nextInt();
			}
                                                                 
                 if ( ArrayElem.length == 0){  
                   System.out.println("THE ARRAY IS EMPTY");
                   System.out.println("");     
                   myMethod();
                      }                                        
                 
                 
                 else{
                  System.out.println ("Your Array Elements");
                      for ( int i = 0; i < size; i++) {
                   System.out.println("[" +i +"]" +" = " +ArrayElem[i]);
                      }
                   System.out.println("THE ARRAY IS FULL");                                      
                 }
                 
         System.out.println("");            
         System.out.println("Enter 1 if you want to Insert a Value");
         System.out.println("Enter 2 if you want to Delete a Value");        
         System.out.println("Enter 3 if you want to Traverse array");
         System.out.println("Enter 4 if you want to Exit");
         System.out.println("");
         System.out.print("Please enter here:");

         int options = input.nextInt();
         
         switch(options){
             
             case 1 :                  
                 System.out.print ("Please enter the value that you want to insert: ");
                    int newValue = input.nextInt();                
                 System.out.print ("Please enter the index position to insert it from: ");
                    int position = input.nextInt();
                                 
                 for (int i=ArrayElem.length-1; i> position; i--){
                     ArrayElem[i] = ArrayElem[i-1]; 
                 }
                    ArrayElem[position]=newValue;
                    
                    System.out.println("");
                    System.out.println("Your new Array Elements:");
                    
                   for ( int i = 0; i < size; i++) {
                        System.out.println("[" +i +"]" +" = " +ArrayElem[i]);
                    }   
                 break;
        
      
            case 2 :
                 System.out.print ("Please enter the index position you want to delete: ");
                    int delete = input.nextInt();
                    
                for (int i = delete; i < size - 1; i++) {
		ArrayElem [i] = ArrayElem[i + 1];			
			size--;  
                }
                    System.out.println("");
                    System.out.println("Your new Array Elements:");                   
                    for ( int i = 0; i < size; i++) {
                    System.out.println("[" +i +"]" +" = " +ArrayElem[i]);
			}                    
                 break;
                 
            case 3 :
                    System.out.println("");
                    System.out.println("Elements of Array: ");
                    
                    for ( int i = 0; i < size; i++) {
                        System.out.println("[" +i +"]" +" = " +ArrayElem[i]);                        
			}                                          
                 break;     
             
            case 4:
                 System.out.println ("PROGRAM ENDED");                 
                 break;
                 
            default:
              System.out.println ("Error");              
              break;
         }      
         System.exit(0);
    } 
}



 
                    




