package act5_mylinkedlist_gaspar_nw2d;

import java.util.Scanner;
public class Act5_MyLinkedList_Gaspar_NW2D {
   public String fname;
    public String mname;
    public String lname;
    public String gender;
    public int arcode;
    public int age;
    public long telnum;
    public Act5_MyLinkedList_Gaspar_NW2D next;
    public static Act5_MyLinkedList_Gaspar_NW2D firstNode;
    public static Act5_MyLinkedList_Gaspar_NW2D lastNode=null;
    
    public Act5_MyLinkedList_Gaspar_NW2D(String f, String m, String l, String g, int a, int area, long tn, Act5_MyLinkedList_Gaspar_NW2D n){
        fname = f;
        mname = m;
        lname = l;
        gender = g;
        age = a;
        arcode = area;
        telnum = tn;
        next = n;
    }
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
      int arcode, age, memNum ;
      String fname, mname, lname, gender;
      long telnum;
     
       System.out.print("How many members' information will be entered? ");
       memNum = scan.nextInt();
      
       for (int i = 0; i<memNum; i++){
           System.out.println("\nKindly give the information of member # " + (i+1));
           fname=scan.nextLine();
           System.out.print("Enter first name: ");
           fname=scan.nextLine();
           
           System.out.print("Enter middle name: ");
           mname=scan.nextLine();
           
           System.out.print("Enter last name: ");
           lname=scan.nextLine();
           
           System.out.print("Enter area code: ");
           arcode=scan.nextInt();
           
           System.out.print("Enter telephone number: ");
           telnum=scan.nextLong();
           
           gender=scan.nextLine();
           System.out.print("Enter gender: ");
           gender=scan.nextLine();
           
           System.out.print("Enter age: ");
           age=scan.nextInt(); 
           
           Act5_MyLinkedList_Gaspar_NW2D n = new Act5_MyLinkedList_Gaspar_NW2D (fname, mname, lname, gender, age, arcode, telnum, null);
           if (lastNode!=null){
                lastNode.next=n;
                lastNode=n;
            }
            else
            {
                firstNode=n;
                lastNode=n;
            }    
    }
       
         Act5_MyLinkedList_Gaspar_NW2D n= firstNode;
         while (n!=null)
         {
             System.out.print("\nWelcome to the club " + n.fname + " "+ n.mname + " " +n.lname + "!" + "\n");
             System.out.print("Your code and telephone number is " + "("+n.arcode+") " + n.telnum + "\n");
             System.out.print("You are a "+ n.gender + " and your age is " + n.age + "." + "\n");
             n=n.next;
         }     
}
}