
package act04b.nw2d.caudilla;
import java.util.*;
public class Act04BNW2DCaudilla {
    
static int num;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		System.out.println("Type the values you want: ");
		int num1 = Integer.parseInt(scanner.next());
		int[] num = new int[num1];
                
                System.out.println("Insert array elemets: ");
                for (int i =0; i<num1;i++){
                   num[i] = scanner.nextInt();
                }
          System.out.println("Index and Values");
            for (int i = 0; i<num.length; i++){
               System.out.println(i+"         " + num[i]); 
            }    
            
            int m;
            System.out.println("The Options are: ");
            System.out.println("1. Insert Value");
            System.out.println("2. Delete Value");
            System.out.println("3. Traverse Array");
            System.out.println("4. Exit");
            
            System.out.println("Please enter your choice: ");
            m = scanner.nextInt();
            
        switch(m)
        {
            case 1:
            System.out.println("Please enter the location index: ");
            int location = scanner.nextInt();
            System.out.println("Please enter the value to be inserted: ");
            int vls = scanner.nextInt();
            
            for(int g = num.length-1; g>location; g--){
                num[g] = num[g-1];
            }
            num[location] = vls;
            System.out.println("After inserting a value: ");
            for(int g:num){
            System.out.println(g);
            }
            break; 
            
            case 2:
            System.out.println("Please enter the location to be deleted: ");
            int dlts = scanner.nextInt();
            for(int p = dlts; p <num.length-1; p++){
                num[p] = num[p+1];
             System.out.println(num[p]);
            }
            break;
            
            case 3:
            System.out.println("The content of the array: ");
            for(int c = 0; c<num.length; c++){
                System.out.println(num[c]);
            }
            break;
            
            case 4:
              System.out.println("Thank you!");
              
              break;
                         
            }
            
        }                  
                }
                    
                
                
                

		
		