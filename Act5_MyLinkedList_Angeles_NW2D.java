
import java.io.*;
public class Act5_MyLinkedList_Angeles_NW2D {
	public String fName, mName,lName,pnum,Sgender;
    public int aCode,age;
	 public Act5_MyLinkedList_Angeles_NW2D next; 
	public static Act5_MyLinkedList_Angeles_NW2D firstNode; 
	public static Act5_MyLinkedList_Angeles_NW2D lastNode=null; 

	    public Act5_MyLinkedList_Angeles_NW2D (String a,String b, String c,int d,String e,String f,int g, Act5_MyLinkedList_Angeles_NW2D aa){
            fName = a;
            mName = b;
            lName = c;
            aCode = d;
            pnum = e;
            Sgender = f;
            age = g;
	          next = aa;
	    }
	    
	    public static void main(String[] args) throws IOException {
	 
		BufferedReader zz = new BufferedReader(new InputStreamReader(System.in));
        
        int memNum,g,d;
        String a,b,c,e,f;
        
	        System.out.print("Enter Number of members to register: ");
	        memNum = Integer.parseInt(zz.readLine());
	        
	        for (int i=0; i < memNum; i++){
	        System.out.println("\nMember Application #"+(i+1)+"");
	        System.out.print("\nPlease enter your First Name: ");
	        a = zz.readLine();
            
	        System.out.print("Please enter your Middle Name: ");
	        b = zz.readLine();
            
	        System.out.print("Please enter your Last Name: ");
	        c = zz.readLine();
            
	        System.out.print("\nPlease enter Area Code: ");
	        d = Integer.parseInt(zz.readLine());
            
	        System.out.print("Please enter your Telephone Number: ");
	        e = zz.readLine();
            
	        System.out.print("'\nPlease enter your Gender: ");
	        f = zz.readLine();
            
	        System.out.print("Please enter your age: ");
	        g = Integer.parseInt(zz.readLine());
	             
	        Act5_MyLinkedList_Angeles_NW2D  ln = new Act5_MyLinkedList_Angeles_NW2D (a, b, c, d, e, f, g, null);
	            
	            if(lastNode!=null)
				{
	            lastNode.next = ln;
	            lastNode = ln;
				}           
				else 
				{
	            firstNode = ln;
	            lastNode = ln;

	       		} 
		}
	        Act5_MyLinkedList_Angeles_NW2D fn=firstNode;

	        while(fn != null)
			{
	        for(int i = 0; i < memNum; i++ ){
	        System.out.println("\nWelcome to the club " +fn.fName+" "+fn.mName+" " +fn.lName+ "!");
	        System.out.println("Your area code and telephone number is (" +fn.aCode +") "+ fn.pnum+".");
	        System.out.println("You are a " +fn.Sgender+ " member and your age is " +fn.age+ "." );

	        fn = fn.next;
			}
		}  
	}
}
