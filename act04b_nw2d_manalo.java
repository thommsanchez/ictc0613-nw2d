package Week4_Activity4B;
import java.util.Scanner;

public class Array_Operation {

    static int num;
    public static void main(String[] args)   {   
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter length of an array:");
        int x = Integer.parseInt(sc.next());
        int[] y = new int[x];

        System.out.println("Enter all the "+ x +" elements:");
        for(int i = 0; i < y.length; i++){
            y[i] = sc.nextInt();
        }
            int choice;
            System.out.println("Please Choose an option\n");
            System.out.println("(1) Insert a value ");
            System.out.println("(2) Delete a value ");
            System.out.println("(3) Traverse array ");
            System.out.println("(4) Exit ");

            
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                System.out.println("Enter location index: ");
                int loc = sc.nextInt();
                System.out.println("Enter value to insert: ");
                int val = sc.nextInt();

                for(int a = y.length-1; a>loc; a--){
                    y[a] = y [a-1];
                }
                y[loc] = val;
                System.out.println("After inserting: ");
                for(int a:y){
                    System.out.println(a);
                }
                break;

                case 2:
                System.out.println("Enter index location to delete: ");
                int dlts = sc.nextInt();
                for(int b = dlts; b<y.length-1; b++){
                    y[b] = y[b+1];
                    System.out.println(y[b]);
                }
                break;

                case 3:
                System.out.println("Traverse array: ");
                for(int c = 0; c<y.length; c++){
                    System.out.println(y[c]);
                }
                break;

                case 4:
                System.out.println("End");

                break;

            }
        }
    }
