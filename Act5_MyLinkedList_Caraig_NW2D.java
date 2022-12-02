package act5_mylinkedlist_caraig_nw2d;
import java.io.*;
/**
 *
 * @author Carl
 */
public class Act5_MyLinkedList_Caraig_NW2D {
public String firstname,middlename,lastname,areaCode,telNum, Gender ,Age;
public Act5_MyLinkedList_Caraig_NW2D field;
public static Act5_MyLinkedList_Caraig_NW2D firstNode;
public static Act5_MyLinkedList_Caraig_NW2D lastNode = null;
    /**
     * @param args the command line arguments
     */
public Act5_MyLinkedList_Caraig_NW2D(String fName, String mName ,String lName,String aC,String telephone, String gender,
            String age, Act5_MyLinkedList_Caraig_NW2D f){
      firstname = fName;
       middlename = mName;
       lastname = lName;
       areaCode = aC;
       telNum = telephone;
       Gender = gender;
       Age = age;
       field = f;       
}


    public static void main(String[] args) throws IOException  {
         BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int mem;
        String node, firstname, middlename, lastname, areacode, telNum, Gender, age;
        System.out.print("How many members will Join?");
        mem = Integer.parseInt(input.readLine());
            for (int i=0; i<mem; i++){
            System.out.println("\nKindly give the information of the applying member #"+(i+1)+"");
            System.out.print("Enter First Name :");
            firstname = input.readLine();
            System.out.print("Enter middle Name :");
            middlename = input.readLine();
            System.out.print("Enter last Name :");
            lastname = input.readLine();
            System.out.print("Enter Area Code:");
            areacode = input.readLine();
            System.out.print("Enter Telephone Number :");
            telNum = input.readLine();
            System.out.print("Enter Gender:");
            Gender = input.readLine();
            System.out.print("Enter age :");
            age = input.readLine();
        
           Act5_MyLinkedList_Caraig_NW2D n = new Act5_MyLinkedList_Caraig_NW2D(firstname, middlename, lastname, areacode, telNum, Gender, age, null);
            
            if(lastNode!=null){
            lastNode.field = n;
            lastNode = n;
            }else {
            firstNode = n;
            lastNode = n;

        }
        }
            Act5_MyLinkedList_Caraig_NW2D n=firstNode;
        while(n != null){
        for(int i =0; i<mem; i++ ){
        System.out.println("\nWelcome to the club " +n.firstname+" "+n.middlename+" " +n.lastname+ "!");
        System.out.println("Your area code and telephone number is (" +n.areaCode +") "+ n.telNum+".");
        System.out.println("You are a " +n.Gender+ " member and your age is " +n.Age+ "." );
    n = n.field;
}
}  

    }
    
}