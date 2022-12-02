package Act5B_MyLinkedList_Celestino_NW2D;

import java.util.Scanner;
public class Act5B_MyLinkedList_Celestino_NW2D {
    
    public int data; 
    public Act5B_MyLinkedList_Celestino_NW2D next; 
    public static Act5B_MyLinkedList_Celestino_NW2D firstNode; 
    public static Act5B_MyLinkedList_Celestino_NW2D lastNode = null;
    public Act5B_MyLinkedList_Celestino_NW2D(int d,Act5B_MyLinkedList_Celestino_NW2D n) {
        data = d;
        next = n;  
    }   
    public static void main(String[] args)  {
       
        String fName ="";String mName =""; String lName =""; String gender="";
        int aCode=0,age=0,telNum=0;
        int numnodes, num;
       
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many members’ information will be entered? ");
        numnodes = scan.nextInt();
        for(int i=0; i<numnodes; i++) {   
            System.out.print("Kindly give the information of member # ");       
            num=scan.nextInt();
            System.out.print("Enter First Name: ");
                fName=sc.nextLine();
            System.out.print("Enter Middle Name: ");
                mName=sc.nextLine();
            System.out.print("Enter Last Name: ");
                lName=sc.nextLine();
            System.out.print("Enter Area Code: ");
                aCode=scan.nextInt();
            System.out.print("Enter Telephone Number: ");
                telNum=scan.nextInt();
            System.out.print("Enter Gender: ");
                gender=sc.nextLine();
            System.out.print("Enter Age: ");
                age=scan.nextInt();
             System.out.println();
                
            
           Act5B_MyLinkedList_Celestino_NW2D n = new Act5B_MyLinkedList_Celestino_NW2D(num, null); 
            if(lastNode != null) 
            {
               lastNode.next= n;
               lastNode = n;
            } else { 
               firstNode = n;
               lastNode = n;
            }
        }
        
        System.out.println("Welcome to the club "+ fName + " " + mName +" " + lName + "!");
        System.out.println("Your area code and telephone number is (" + aCode + ")" + telNum + ".");
        System.out.println("Your are a "+gender+ " member and your age is "+age+ ".");
        
        Act5B_MyLinkedList_Celestino_NW2D n = firstNode;
        while(n != null) { 
            System.out.print(n.data);
            n=n.next; 
        }
     
    }
}
