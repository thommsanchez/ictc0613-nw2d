package Act5B_MyLinkedList_Rosario_NW2D;

import java.io.IOException;
import java.util.Scanner;
public class Act5B_MyLinkedList_Rosario_NW2D {
public String firstName, middleName, lastName, teleNumber,numGender;
public int codeArea, fAge;
public Act5B_MyLinkedList_Rosario_NW2D next;
public static Act5B_MyLinkedList_Rosario_NW2D Fnode;
public static Act5B_MyLinkedList_Rosario_NW2D Lnode = null;
public static Scanner scan = new Scanner(System.in);
	
public Act5B_MyLinkedList_Rosario_NW2D(String fName, String mName, String lName, int aCode, String phoneNumber, String Gender, int Age, Act5B_MyLinkedList_Rosario_NW2D n) 
    {
	firstName = fName; 
	middleName = mName;
	lastName = lName;
	codeArea = aCode;
	teleNumber = phoneNumber;
	numGender = Gender;
	fAge = Age;
	next = n;
    }
static void memberInfo() {
	String fName, mName, lName, phoneNumber, Gender;
	int aCode, Age;
	
	System.out.print("Enter First Name:");
	fName = scan.nextLine();
	System.out.print("Enter Middle Name:");
	mName = scan.nextLine();
	System.out.print("Enter Last Name:");
	lName = scan.nextLine();
	System.out.print("Enter Area Code:");
	aCode = Integer.parseInt(scan.nextLine());
	System.out.print("Enter Telephone Number:");
	phoneNumber = scan.nextLine();
	System.out.print("Enter Gender:");
	Gender = scan.nextLine();
	System.out.print("Enter Age:");
	Age = Integer.parseInt(scan.nextLine());
		
	Act5B_MyLinkedList_Rosario_NW2D n = new Act5B_MyLinkedList_Rosario_NW2D(fName, mName, lName, aCode, phoneNumber, Gender, Age, null);
            if(Lnode != null) 
            {
		Lnode.next = n;
		Lnode = n;
            } else 
            {
		Fnode = n;
		Lnode = n;
            }
		System.out.println();
            }
public static void main(String[] args) throws IOException {
	int nNodes;
		
	System.out.print("How many members information will be entered?: ");
	nNodes = Integer.parseInt(scan.nextLine());
		
	for(int i = 0; i < nNodes; i++) {
            System.out.println("Kindly give the information of member #" + (i + 1));
            memberInfo();
	}	
	Act5B_MyLinkedList_Rosario_NW2D n = Fnode;
	while(n != null) 
        {
            System.out.println("Welcome to the club " + n.firstName + " " + n.middleName + " " + n.lastName + "!"); 
            System.out.println("Your area code and telephone number is (" + n.codeArea + ")" + n.teleNumber + ".");
            System.out.println("You are a " + n.numGender + " member and your age is " + n.fAge + ".");
            System.out.println();
            n = n.next;
	}
		scan.close();
	}
}