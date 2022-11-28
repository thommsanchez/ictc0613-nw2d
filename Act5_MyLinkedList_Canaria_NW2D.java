package Activity5B;
import java.io.IOException;
import java.util.Scanner;
public class Act5_MyLinkedList_Canaria_NW2D {
	public String firstName, middleName, lastName, telephoneNumber,nGender;
	public int areaCode, nAge;
	public Act5_MyLinkedList_Canaria_NW2D next;
	public static Act5_MyLinkedList_Canaria_NW2D firstNode;
	public static Act5_MyLinkedList_Canaria_NW2D lastNode = null;
	public static Scanner scan = new Scanner(System.in);
	
	public Act5_MyLinkedList_Canaria_NW2D(String fName, String mName, String lName, int aCode, String tNumber, String Gender, int Age, Act5_MyLinkedList_Canaria_NW2D n) {
		firstName = fName; 
		middleName = mName;
		lastName = lName;
		areaCode = aCode;
		telephoneNumber = tNumber;
		nGender = Gender;
		nAge = Age;
		next = n;
	}
	
	public static void main(String[] args) throws IOException {
		int numNodes;
		
		System.out.print("How many members information will be entered?");
		numNodes = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < numNodes; i++) {
			System.out.println("Kindly give the information of member #" + (i + 1));
			memberInfo();
		}
		
		Act5_MyLinkedList_Canaria_NW2D n = firstNode;
		while(n != null) {
			System.out.println("Welcome to the club " + n.firstName + " " + n.middleName + " " + n.lastName + "!"); 
			System.out.println("Your area code and telephone number is (" + n.areaCode + ")" + n.telephoneNumber + ".");
			System.out.println("You are a " + n.nGender + " member and your age is " + n.nAge + ".");
			System.out.println();
			n = n.next;
			}
		
		scan.close();
	}
	static void memberInfo() {
		String fName, mName, lName, tNumber, Gender;
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
		tNumber = scan.nextLine();
		System.out.print("Enter Gender:");
		Gender = scan.nextLine();
		System.out.print("Enter Age:");
		Age = Integer.parseInt(scan.nextLine());
		
		Act5_MyLinkedList_Canaria_NW2D n = new Act5_MyLinkedList_Canaria_NW2D(fName, mName, lName, aCode, tNumber, Gender, Age, null);
		if(lastNode != null) {
			lastNode.next = n;
			lastNode = n;
		} else {
			firstNode = n;
			lastNode = n;
		}
		System.out.println();
	}

}