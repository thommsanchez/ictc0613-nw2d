/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act4b_nw2d_caraig;
import java.util.Scanner;
/**
 *
 * @author decoy
 */
public class Act4B_NW2D_Caraig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int haba, lugar, i;
        
        char sagot;
        char Y,N;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter array width : ");
        haba = scan.nextInt();
        int[] Arraynum = new int[haba];
        System.out.println("Enter array element : ");
            for (i = 0; i < haba; i++){
                Arraynum[i] = scan.nextInt();               
            }
            System.out.println("Elements of your array : ");
               for (i = 0; i<Arraynum.length; i++){
                   System.out.println(Arraynum [i]);
               }
               
        System.out.println("Would you like to delete an Element? [Y] or [N]");
        sagot = scan.next().charAt(0);
            switch(sagot){
                case 'Y':
                        System.out.println("Enter array position");
                        lugar = scan.nextInt();
                        for(i = sagot; i<haba; i++){
                            Arraynum[i] = Arraynum[i+1];
                        }
                        haba--;
                        break;
                case 'N':
                        System.out.println("Sige");
                        break;
            }
            
            System.out.println("Updated elements of your array");
                for(i = 0; i < haba; i++){
                    System.out.println(Arraynum[i]);
                }
                System.out.println("End of program");
                scan.close();
            
        
        
    } 
    
}
