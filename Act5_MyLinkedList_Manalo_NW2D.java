package week5;

import java.util.Scanner;



public class Act5_MyLinkedList_Manalo_NW2D 
{

    public String nextLine;
    public String name;
    public String user_gender;
    public int user_age;
    public int user_code;
    public long user_telnum;
    public Act5_MyLinkedList_Manalo_NW2D nxt;
    public static Act5_MyLinkedList_Manalo_NW2D firstNode;
    public static Act5_MyLinkedList_Manalo_NW2D lastNode = null;

    public Act5_MyLinkedList_Manalo_NW2D(String fname, String mname, String lname, int areaCode, long tpNum, String gender, int age, Act5_MyLinkedList_Manalo_NW2D n)
    
    {
            name = fname + " " + mname + " " + lname;
            user_code = areaCode;
            user_telnum = tpNum;
            user_gender = gender;
            user_age = age;
            nxt= n;

    }

    public static void main(String[] args)  
    {
            Scanner s = new Scanner(System.in);

            System.out.print("How many members' information will be entered? ");
            int num = Integer.parseInt(s.nextLine());
            
                for(int x = 0; x<num; x++); {
                    System.out.print("\n ");
                    System.out.print("Kindly give the information of member #1 ");
                    System.out.print("\n");

                    System.out.print("Enter first name: ");
                        String fname = s.nextLine();
                    System.out.print("Enter middle name: ");
                        String mname = s.next();
                    System.out.print("Enter last name: ");
                        String lname = s.next();
                    System.out.print("Enter area code: ");
                        int areaCode = s.nextInt();
                    System.out.print("Enter telephone number: ");
                        long tpNum = s.nextLong();
                    System.out.print("Enter gender: ");
                        String gender = s.next();
                    System.out.print("Enter age: ");
                        int age = s.nextInt();

                        s.nextLine();
                        Act5_MyLinkedList_Manalo_NW2D n = new Act5_MyLinkedList_Manalo_NW2D(fname, mname, lname, areaCode, tpNum, gender, age, null);

                            if(lastNode !=null)
                            {
                                lastNode.nxt = n;
                                lastNode = n;
                            }
                            else
                            {
                                firstNode = n;
                                lastNode = n;
                            }


                }

                for(int x = 1; x<num; x++); {
                    System.out.print("\n ");
                    System.out.print("Kindly give the information of member #2 ");
                    System.out.print("\n");

                    System.out.print("Enter first name: ");
                        String fname = s.nextLine();
                    System.out.print("Enter middle name: ");
                        String mname = s.next();
                    System.out.print("Enter last name: ");
                        String lname = s.next();
                    System.out.print("Enter area code: ");
                        int areaCode = s.nextInt();
                    System.out.print("Enter telephone number: ");
                        long tpNum = s.nextLong();
                    System.out.print("Enter gender: ");
                        String gender = s.next();
                    System.out.print("Enter age: ");
                        int age = s.nextInt();

                        s.nextLine();
                        Act5_MyLinkedList_Manalo_NW2D n = new Act5_MyLinkedList_Manalo_NW2D(fname, mname, lname, areaCode, tpNum, gender, age, null);

                            if(lastNode !=null)
                            {
                                lastNode.nxt = n;
                                lastNode = n;
                            }
                            else
                            {
                                firstNode = n;
                                lastNode = n;
                            }


                }
                         System.out.print("\n ");
                         System.out.print("\n ");
                         Act5_MyLinkedList_Manalo_NW2D n = firstNode;

                         char[] charArray = n.name.toCharArray();
                         boolean foundSpace = true;

                         for(int z = 0;  z < charArray.length; z++)
                         {
                            if(Character.isLetter(charArray[z])){
                                if(foundSpace)
                                {
                                    charArray[z] = Character.toUpperCase(charArray[z]);
                                    foundSpace = false;
                                }
                            }
                            else
                            {
                                foundSpace = true;
                            }
                         }
                         n.name = String.valueOf(charArray);

                         while(n !=null)
                         {
                            System.out.println("Welcome to the club " + n.name + "!\n" 
                            + "Your area code and telephone number is " + "(" + n.user_code + ") " + n.user_telnum
                            + "\nYou are a " + n.user_gender + " member and your age is " + n.user_age + ".");
                            n = n.nxt  ;
                            System.out.print("\n ");
                         }

                         

                         s.close();
    }
}