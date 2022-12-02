
package act5_mylinkedlist_caudilla_nw2d;
import java.io.*;
public class Act5_MyLinkedList_Caudilla_NW2D {
	public String firstname, middlename, lastname, areacode, telnumber, gender, age;
	 public Act5_MyLinkedList_Caudilla_NW2D field; 
	public static Act5_MyLinkedList_Caudilla_NW2D firstNode; 
	public static Act5_MyLinkedList_Caudilla_NW2D lastNode=null; 

	    public Act5_MyLinkedList_Caudilla_NW2D (String unangpangalan, String gitnangpangalan, String hulingpangalan,
	    		String codes, String phonenumber, String gender, String age, Act5_MyLinkedList_Caudilla_NW2D mg){
	       firstname = unangpangalan;
	       middlename = gitnangpangalan;
	       lastname = hulingpangalan;
	       areacode = codes;
	       telnumber = phonenumber;
	      this.gender = gender;
	      this.age = age;
	       field = mg;
	    }
	    
	    public static void main(String[] args) throws IOException {
	 
	           
	  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	        int m;
	        String firstname, middlename, lastname, areacode, telnum, gender, age;
	        System.out.print("Please enter how many members will participate: ");
	        m = Integer.parseInt(input.readLine());
	        
	        for (int g=0; g<m; g++){
	        System.out.println("\nKindly give the information of the applying member # "+(g+1)+"");
	        System.out.print("\nInput your First Name: ");
	        firstname = input.readLine();
	        System.out.print("Input your Middle Name: ");
	        middlename = input.readLine();
	        System.out.print("Input your Last Name: ");
	        lastname = input.readLine();
	        System.out.print("Please enter Area Code: ");
	        areacode = input.readLine();
	        System.out.print("Please give your Telephone Number: ");
	        telnum= input.readLine();
	        System.out.print("Enter your Gender: ");
	        gender = input.readLine();
	        System.out.print("Enter your age: ");
	        age = input.readLine();
	             
	        Act5_MyLinkedList_Caudilla_NW2D  p = new Act5_MyLinkedList_Caudilla_NW2D (firstname, middlename, lastname, areacode, telnum, gender, age, null);
	            
	            if(lastNode!=null){
	            lastNode.field = p;
	            lastNode = p;
	}           else {
	            firstNode = p;
	            lastNode = p;

	        } }
	        Act5_MyLinkedList_Caudilla_NW2D c=firstNode;
	        while(c != null){
	        for(int g =0; g<m; g++ ){
	        System.out.println("\nWelcome to the club " +c.firstname+" "+c.middlename+" " +c.lastname+ "!");
	        System.out.println("Your area code and telephone number is (" +c.areacode +") "+ c.telnumber+".");
	        System.out.println("You are a " +c.gender+ " member and your age is " +c.age+ "." );
	        c = c.field;
	}
	}  
	}
}

