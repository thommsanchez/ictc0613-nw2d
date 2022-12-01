package DSA;
import java.io.*;
import java.util.*;
public class Act05B_NW2D_Ordonio {
	
	//global Scanner for any method
	static Scanner in = new Scanner(System.in);
	
	// node for head and link
	public String fName, mName, lName, tNum, Gender;
	public int aCode, Age;
	public Act05B_NW2D_Ordonio next;
	public static Act05B_NW2D_Ordonio fNode;
	public static Act05B_NW2D_Ordonio lNode = null;
	
	//global variables for any method
	static String fname, mname, lname, tnum, gender;
	static int acode, age;
	
	//creating parametized constructor
	public Act05B_NW2D_Ordonio(String fName, String mName, String lName, String tNum, 
	String Gender, int aCode, int Age, Act05B_NW2D_Ordonio next) {
		
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.tNum = tNum;
		this.Gender = Gender;
		this.aCode = aCode;
		this.Age = Age;
		this.next = next;
	}
	
	//questionare
	static void form() {
	
			System.out.print("Enter your First Name: ");
			fname = in.nextLine();
			System.out.print("Enter your Middle Name: ");
			mname = in.nextLine();
			System.out.print("Enter your Last Name: ");
			lname = in.nextLine();
			System.out.print("Enter your Area Code: ");
			acode = Integer.parseInt(in.nextLine());
			System.out.print("Enter your Telephone Number: ");
			tnum = in.nextLine();
			System.out.print("Enter your gender: ");
			gender = in.nextLine();
			System.out.print("Enter your age: ");
			age = Integer.parseInt(in.nextLine());
			System.out.println();
			
			Act05B_NW2D_Ordonio n = new Act05B_NW2D_Ordonio(fname, mname,
			lname, tnum, gender, acode, age, null);
			
			//condition of nodes
			if(lNode != null) {
				lNode.next = n;
				lNode = n;
			}
			else 
				fNode = n;
				lNode = n;
		}
	
	//main
	public static void main(String[] args) throws IOException {
		
		System.out.print("How many members do you want to input?: ");
		int numnodes = Integer.parseInt(in.nextLine());
		
		for(int i=0; i<numnodes; i++) {
			System.out.println("Kindly give the information of member #" + (i+1));
			form();
		}
		
		Act05B_NW2D_Ordonio n = fNode;
		
		while(n != null) {
			System.out.println("Welcome to the club, " + n.fName + " " + n.mName + " " + n.lName);
			System.out.println("Your area code and telephone number is " + "(" + n.aCode +")" + " " + n.tNum );
			System.out.println("You are " + n.Gender + " member and your age is " + n.Age);
			System.out.println();
			
			n = n.next;
		}
	}
}
