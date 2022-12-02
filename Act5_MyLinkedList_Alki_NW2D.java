package act5b;

import java.util.Scanner;
public class Act5_MyLinkedList_Alki_NW2D {

	public  String fName, mName, lName, telNum, gender;
	public int Acode, age;
	public Act5_MyLinkedList_Alki_NW2D next;
	public static Act5_MyLinkedList_Alki_NW2D firstNode;
	public static Act5_MyLinkedList_Alki_NW2D lastNode = null;

	public Act5_MyLinkedList_Alki_NW2D(String Fname, String Mname, String Lname, String telnum, 
	String Gender, int aCode, int Age,Act5_MyLinkedList_Alki_NW2D nxt) {
		
            fName=Fname;
            mName=Mname;
            lName=Lname;
            telNum=telnum;
            gender=Gender;
            Acode=aCode;
            age=Age;     
            next=nxt;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);
            Scanner sc = new Scanner (System.in);
            
            String fName, mName, lName, telNum,gender;
            int Acode,age;
            int num;
            System.out.print("How many members' information will be entered? : ");
		num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
                    System.out.println("Kindly give the information of member #" + (i+1));
                    
                    System.out.print("Enter your First Name: ");
                    fName = scan.nextLine();
		System.out.print("Enter your Middle Name: ");
                    mName = scan.nextLine();
		System.out.print("Enter your Last Name: ");
                    lName = scan.nextLine();
		System.out.print("Enter your Area Code: ");
                    Acode= sc.nextInt();
		System.out.print("Enter your Telephone Number: ");
                    telNum = scan.nextLine();
		System.out.print("Enter your Gender: ");
                    gender = scan.nextLine();
		System.out.print("Enter your Age: ");
                    age = sc.nextInt();
		System.out.println();
                
                Act5_MyLinkedList_Alki_NW2D n = new Act5_MyLinkedList_Alki_NW2D(fName, mName, lName, telNum, gender, Acode, age, null);
			
		if(lastNode != null) {
                    lastNode.next = n;
                    lastNode = n;
		}
		else 
                    firstNode = n;
                    lastNode = n;
		}  
                  
		    
                Act5_MyLinkedList_Alki_NW2D n = firstNode;
                
                while(n != null){
                System.out.println("Welcome to the club " + n.fName + " " + n.mName + " " + n.lName + "!");
		System.out.println("Your area code and telephone number is " + "(" + n.Acode +")" + "" + n.telNum );
		System.out.println("You are a " + n.gender + " member and your age is " + n.age + ".");
                System.out.println();
		n = n.next;
            }
        }
}
