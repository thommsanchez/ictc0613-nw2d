
package act05b_mylinkedlist_pabiton_nw2d;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Act05B_MyLinkedList_Pabiton_NW2D {
    

public String Fname;
public String Mname;
public String Lname;
public String areaCode;
public String TPnum;
public String gender;
public String age;
public String next;
public Act05B_MyLinkedList_Pabiton_NW2D mers; 
public static Act05B_MyLinkedList_Pabiton_NW2D FirstNode;
public static Act05B_MyLinkedList_Pabiton_NW2D LastNode = null;
 

          
public Act05B_MyLinkedList_Pabiton_NW2D(String fname, String mname, String lname, 
   String areaCode, String tpnum, String gender , String age, Act05B_MyLinkedList_Pabiton_NW2D mm) 
{          
            Fname= fname;
            Mname= mname;
            Lname= lname;
            this.gender= gender;
            TPnum= tpnum;
            this.areaCode= areaCode;
            this.age= age;
            mers= mm;
}
public static void main(String[] args) throws IOException{
    

        BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
        
        String Fname, Mname, Lname,TPnum, areaCode, gender, age;
        int n;
        System.out.println ("How many members’ information will be entered?") ;
         n=Integer.parseInt(br.readLine());
            
        for(int i = 0; i<n; i++)
        {  
        System.out.print ("\nKindly give the information of member # "+(i+1)+"");
        System.out.print ("\n");
        
 
            System.out.print ("Enter first name: ");
            Fname= br.readLine();
            
            System.out.print ("Enter middle name: ");
            Mname= br.readLine();
            
            System.out.print ("Enter last name: ");
            Lname= br.readLine();
            
            System.out.print ("Enter area code: ");
            areaCode= br.readLine();
            
            System.out.print ("Enter telephone number: ");
            TPnum= br.readLine();
                    
            System.out.print ("Enter gender: ");
            gender= br.readLine();
            
            System.out.print ("Enter age: ");
            age = br.readLine();
            
       
 
   Act05B_MyLinkedList_Pabiton_NW2D  w = new  Act05B_MyLinkedList_Pabiton_NW2D  
        (Fname, Mname,Lname, areaCode, TPnum, gender, age, null);
            
          
            if (LastNode !=null)
            {
                LastNode.mers= w;
                LastNode= w;
            }
            else
            {
                FirstNode = w;
                LastNode= w;
            }
    }
     
	     Act05B_MyLinkedList_Pabiton_NW2D  E =FirstNode;
             
	     while(E != null){
	     
	     System.out.println("\nWelcome to the club " +E.Fname+" "+E.Mname+" " +E.Lname+ "!");
	     System.out.println("Your area code and telephone number is (" +E.areaCode +") "+ E.TPnum+".");
	     System.out.println("You are a " +E.gender+ " member and your age is " +E.age+ "." );
	     E = E.mers;
            
           
             
	}
             br. close();
             }
}

