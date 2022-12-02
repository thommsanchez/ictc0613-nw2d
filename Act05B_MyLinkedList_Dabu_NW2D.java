
package dabu;

import java.util.Scanner;
public class Act05B_MyLinkedList_Dabu_NW2D {
     
    public int AreaCode, MemberAge;
    public String FirstName , MiddleName, Surname, TelephoneNumber, MemberGender;
    public Act05B_MyLinkedList_Dabu_NW2D next;
    public static Act05B_MyLinkedList_Dabu_NW2D fNode;
    public static Act05B_MyLinkedList_Dabu_NW2D lNode = null;


public Act05B_MyLinkedList_Dabu_NW2D(String fName, String mName, String lName, int aCode, String TelNum, String Gender, int Age, Act05B_MyLinkedList_Dabu_NW2D n) 
    {
	FirstName = fName; 
	MiddleName = mName;
	Surname = lName;
	AreaCode = aCode;
	TelephoneNumber = TelNum;
	MemberGender = Gender;
	MemberAge = Age;
	next = n;
    }
    
     public static void main(String[] args)  {              
        String fName, mName, lName, TelephoneNumber,Gender;
        int memberinfo , Age, aCode;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("How many members’ information will be entered?: ");
        memberinfo = Integer.parseInt(reader.nextLine());
        
        for(int a=0; a<memberinfo; a++) {
            System.out.println("Kindly give the information of member #" +(a+1));          
            
             System.out.print("Enter first name: ");
                fName = reader.nextLine();
             System.out.print("Enter middle name: ");
                mName = reader.nextLine();
             System.out.print("Enter last name: ");
                lName = reader.nextLine();
             System.out.print("Enter area code: ");
                aCode = Integer.parseInt(reader.nextLine());
             System.out.print("Enter telephone number: ");
                TelephoneNumber = reader.nextLine();
             System.out.print("Enter gender: ");
                Gender = reader.nextLine();
             System.out.print("Enter age: ");
                Age = Integer.parseInt(reader.nextLine());            
             System.out.println("");
                
        Act05B_MyLinkedList_Dabu_NW2D n = new Act05B_MyLinkedList_Dabu_NW2D(fName, mName, lName, aCode, TelephoneNumber, Gender, Age, null);
		if(lNode != null) {
			lNode.next = n;
			lNode = n;
		} 
                else {
			fNode = n;
			lNode = n;
		}
            }           
            
            Act05B_MyLinkedList_Dabu_NW2D n = fNode;
        
            while(n != null) {                
		System.out.println("Welcome to the club, " + n.FirstName + " " + n.MiddleName + " " + n.Surname+ "!");
		System.out.println("Your area code and telephone number is " + "(" + n.AreaCode +")" + " " + n.TelephoneNumber );
		System.out.println("You are " + n.MemberGender + " member and your age is " + n.MemberAge);
                System.out.println("");
                n=n.next; 
		}
	}
        }     



     