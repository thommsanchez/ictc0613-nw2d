
package com.mycompany.act05b_gajesan_nw2d;
import java.util.Scanner;
public class Act05b_Gajesan_NW2D {

    

    public String FirstName, MiddleName,LastName,AreaCode, TelephoneNumber,Gender;
    public int Age;
    public Act05b_Gajesan_NW2D  next;
    public static Act05b_Gajesan_NW2D FNode;
    public static Act05b_Gajesan_NW2D LNode = null;
    
    public  Act05b_Gajesan_NW2D  (String FNAME,String MNAME,String LNAME,String ACODE,String TELNUM,String GENDER,int AGE, Act05b_Gajesan_NW2D  n){
      FirstName = FNAME;
      MiddleName = MNAME;
      LastName = LNAME;
      AreaCode = ACODE;
      TelephoneNumber = TELNUM;
      Gender = GENDER;
      Age = AGE;
      next =  n;
    }
    
    public static void main(String[] args) {
       
       int numnodes;
        Scanner input = new Scanner(System.in);
        System.out.print("How many member's information will be entered? ");
        numnodes = input.nextInt();
        for(int i = 0; i < numnodes; i++){
            System.out.println("\nKindly give the information of member #" + (i+1));
            M_info();
        }
             Act05b_Gajesan_NW2D  n = FNode;
            
            while(n != null){
                System.out.println("\nWelcome to the club " + n.FirstName + " " + n.MiddleName + " " + n.LastName + "!");
                System.out.println("Your area code and telephone number is (" + n.AreaCode + ")" + n.TelephoneNumber + ".");
                System.out.println("You are a " + n.Gender + " member, and your age is " + n.Age + ".");
                n = n.next;
                
            }

}

   static void M_info()
{
         Scanner input = new Scanner(System.in);
 String FNAME, MNAME, LNAME, ACODE, TELNUM, GENDER;
        int  AGE;
     
            System.out.print("Enter First Name: ");
           FNAME = input.nextLine();
            System.out.print("Enter Middle Name: ");
           MNAME= input.nextLine();
            System.out.print("Enter Last Name: ");
            LNAME = input.nextLine();
            System.out.print("Enter Area Code: ");
            ACODE = input.nextLine();
            System.out.print("Enter Telephone Number: ");           
            TELNUM = input.nextLine();
            System.out.print("Enter Gender: ");
            GENDER= input.nextLine();
            System.out.print("Enter Age: ");
           AGE = input.nextInt();

  Act05b_Gajesan_NW2D  n = new  Act05b_Gajesan_NW2D (FNAME, MNAME, LNAME, ACODE, TELNUM, GENDER, AGE, null);
            if(LNode !=null){
                LNode.next = n;
                LNode = n;
            }
            else {
                FNode = n;
                LNode = n;
            }
        }
}
            
            
     


