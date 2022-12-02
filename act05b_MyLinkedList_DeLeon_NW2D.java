package act05b_MyLinkedList_DeLeon_NW2D;

import java.util.*;

public class Act05b_MyLinkedList_DeLeon_NW2D {

 //declare variables

    public String FirstName, 

        MiddleName,

        LastName,

        AreaCode,

        telephoneNumber,

        Gender;

    public int Age;

    public Act05b_MyLinkedList_DeLeon_NW2D  next;

    public static Act05b_MyLinkedList_DeLeon_NW2D firstNode;

    public static Act05b_MyLinkedList_DeLeon_NW2D lastNode = null;

    

    public  Act05b_MyLinkedList_DeLeon_NW2D  (String Fname,String Mname,String Lname,String Acode,String telephonenum,String gender,int age, Act05b_MyLinkedList_DeLeon_NW2D  n){

      //variables name used in initializing

      FirstName = Fname;

      MiddleName = Mname;

      LastName = Lname;

      AreaCode = Acode;

      telephoneNumber = telephonenum;

      Gender = gender;

      Age = age;

      next =  n;

    }

    

    public static void main(String[] args) {

       

        String fName, mName, lName, aCode, telephonenum, gender;

        int numnodes, age;

        Scanner scan = new Scanner(System.in);

        //initialize

        System.out.print("How many member's information will be entered? ");

        numnodes = scan.nextInt();

        

        for(int i = 0; i < numnodes; i++){

            System.out.println("\nKindly give the information of member #" + (i+1));

            System.out.print("Enter first name: ");

            fName = scan.nextLine();

            System.out.print("Enter middle name: ");

            mName = scan.nextLine();

            System.out.print("Enter last name: ");

            lName = scan.nextLine();

            System.out.print("Enter area code: ");

            aCode = scan.nextLine();

            System.out.print("Enter telephone number: ");           

            telephonenum = scan.nextLine();

            System.out.print("Enter gender: ");

            gender = scan.nextLine();

            System.out.print("Enter age: ");

            age = scan.nextInt();

            

             Act05b_MyLinkedList_DeLeon_NW2D  n = new  Act05b_MyLinkedList_DeLeon_NW2D (fName, mName, lName, aCode, telephonenum, gender, age, null);

            if(lastNode !=null){//condition

                lastNode.next = n;

                lastNode = n;

            }

            else {

                firstNode = n;

                lastNode = n;

            }

        }   

            

             Act05b_MyLinkedList_DeLeon_NW2D  n = firstNode;

            //display

            while(n != null){

                System.out.println("\nWelcome to the club " + n.FirstName + " " + n.MiddleName + " " + n.LastName + "!");

                System.out.println("Your area code and telephone number is (" + n.AreaCode + ")" + n.telephoneNumber + ".");

                System.out.println("You are a " + n.Gender + " member, and your age is " + n.Age + ".");

                n = n.next;

            }

        

        

       }

    

}

