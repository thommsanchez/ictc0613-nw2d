/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity5b;

import java.util.Scanner;
public class Act05B_NW2D_Quindoy {
    
        public String fName, lName,mName,gender;
        public int aCode, age, telno;
    public Act05B_NW2D_Quindoy next;
    public static Act05B_NW2D_Quindoy firstNode;
    public static Act05B_NW2D_Quindoy lastNode=null;
    
    public Act05B_NW2D_Quindoy(String firstN, String lastN, String middleN, String gen, int a, int ac, long t, Act05B_NW2D_Quindoy n){
        fName = firstN;
        lName = lastN;
        mName = middleN;
        gender = gen;
        age = a;
        aCode = ac;
        next=n;
    }
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
      int memberNum, aCode, age ;
      String fName, lName,mName,gender;
      int telno;
     
       System.out.print(" Please enter your desire number of information that will be entered: ");
       memberNum = s.nextInt();
      
       for (int i = 0; i<memberNum; i++){
           System.out.println("\nKindly give the information of member # " + (i+1));
           fName=s.nextLine();
           System.out.print("Input First Name: ");
           fName=s.nextLine();
           
           System.out.print("Input Middle Name: ");
           mName=s.nextLine();
           
           System.out.print("Input Last Name: ");
           lName=s.nextLine();
           
           System.out.print("Input Area Code: ");
           aCode=s.nextInt();
           
           System.out.print("Input Telephone Number: ");
           telno=s.nextInt();
           
           gender=s.nextLine();
           System.out.print("Input Gender: ");
           gender=s.nextLine();
           
           System.out.print("Input Age: ");
           age=s.nextInt(); 
           
           Act05B_NW2D_Quindoy n = new Act05B_NW2D_Quindoy (fName, lName, mName, gender, age, aCode, telno, null);
           if (lastNode!=null){
                lastNode.next=n;
                lastNode=n;
            }
            else
            {
                firstNode=n;
                lastNode=n;
            }    
    }
       
         Act05B_NW2D_Quindoy list= firstNode;
         while (list!=null)
         {
             System.out.print("\nWelcome to the club " + list.fName + " "+ list.mName + " " +list.lName + "!" + "\n");
             System.out.print("Your code and telephone number is " + "("+list.aCode+") " + list.telno + "\n");
             System.out.print("You are a "+ list.gender + " and your age is " + list.age + "." + "\n");
             list=list.next;
         }     
}
}
    
    
