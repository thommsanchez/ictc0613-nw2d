package activity05b;

import java.util.Scanner;
public class Act05B_MyLinkedList_Ramos_NW2D {
    public int dAcode, dAge;
    public String dName , dMid, dSur, dTel, dGender;
    public Act05B_MyLinkedList_Ramos_NW2D next;
    public static Act05B_MyLinkedList_Ramos_NW2D firstNode;
    public static Act05B_MyLinkedList_Ramos_NW2D lastNode = null;
    
    public Act05B_MyLinkedList_Ramos_NW2D(String fName, String mName, String lName, int aCode, String telNum, String gender, int age, Act05B_MyLinkedList_Ramos_NW2D next){
        this.dName = fName;
        this.dMid = mName;
        this.dSur = lName;
        this.dAcode = aCode;
        this.dTel = telNum;
        this.dGender = gender;
        this.dAge = age;
        this.next = next;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int membersNum;
        String fName, mName, lName, gender, telNum;
        int aCode, age;
        
        System.out.print("How many members will be entered? ");
        membersNum = Integer.parseInt(input.nextLine());
          System.out.println();
          
        for(int i=0; i<membersNum; i++){
            System.out.println("Kindly give the information of member #" +(i+1) );
            
             System.out.print("Enter first name: ");
                fName = input.nextLine();
             System.out.print("Enter middle name: ");
                mName = input.nextLine();
             System.out.print("Enter last name: ");
                lName = input.nextLine();
             System.out.print("Enter area code: ");
                aCode = Integer.parseInt(input.nextLine());
             System.out.print("Enter telephone number: ");
                telNum = input.nextLine();
             System.out.print("Enter gender: ");
                gender = input.nextLine();
             System.out.print("Enter age: ");
                age = Integer.parseInt(input.nextLine());
              System.out.println();
              
          Act05B_MyLinkedList_Ramos_NW2D n = new Act05B_MyLinkedList_Ramos_NW2D(fName, mName, lName, aCode, telNum, gender, age,  null);
            if(lastNode != null)
                {
                lastNode.next = n;
                lastNode = n;
                }
            else
                {
                firstNode = n;
                lastNode = n;
                }
        }
               
            Act05B_MyLinkedList_Ramos_NW2D n = firstNode;
            while(n != null) { 
                System.out.println("Welcome to the club " +n.dName + " " +n.dMid+ " " +n.dSur+ "!");
                System.out.println("Your area code and telephone number are (" +n.dAcode+ ") " +n.dTel);
                System.out.println("You are a " +n.dGender+ " member and your age is " +n.dAge+ ".");
                System.out.println();
                
                n = n.next;
            }
        
         }
     }
    

