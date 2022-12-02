package MagdatoNW2D;

import java.io.IOException;
import java.util.Scanner;
public class Act5_MyLinkedList_Magdato_NW2D {
		
		public String nextLine;
		public String name;
		public int numCode;
		public long numTel;
		public String genderStat;
		public int ageStat;
		public myLinkedList next;
		public static myLinkedList firstNode;
		public static myLinkedList lastNode = null;
		
		
		public Act5_MyLinkedList_Magdato_NW2D(String fname, String mname, String lname, int code, long telNum, String gender, int age, myLinkedList n) {
			name = fname + " " + mname + " " + lname;
			numCode = code;
			numTel = telNum;
			genderStat = gender;
			ageStat = age;
			next = n;
		}
		
		public static void main(String[] args) throws IOException {
			Scanner in = new Scanner(System.in);
			
			String start;
			do {
			System.out.print("How many members' information will be entered? ");
			int numMem = Integer.parseInt(in.nextLine());		
			for(int i = 0; i<numMem; i++) {
				System.out.println("\n---------------------------------------------");
				System.out.println("\nKindly give the information of member #" + (i+1));
				
				System.out.print("Enter first name: ");
					String fname = in.nextLine();
				System.out.print("Enter middle name: ");
					String mname = in.next();
				System.out.print("Enter last name: ");
					String lname = in.next();
				System.out.print("Enter area code: ");
					int code = in.nextInt();
				System.out.print("Enter telephone number: ");
					long telNum = in.nextLong();
				System.out.print("Enter gender: ");
					String gender = in.next();
				System.out.print("Enter age: ");
					int age = in.nextInt();
				
					in.nextLine();
					myLinkedList n = new myLinkedList(fname, mname, lname, code, telNum, gender, age, null);
					if(lastNode != null) {
						lastNode.next = n;
						lastNode = n;
					} else {
						firstNode = n;
						lastNode = n;
					}
			}
				
				System.out.println("\n---------------------------------------------");
				System.out.println();
				myLinkedList n = firstNode;
				
				char[] charArray = n.name.toCharArray();
				boolean foundSpace = true;
				
				for(int i = 0; i < charArray.length; i++) {
					if(Character.isLetter(charArray[i])) {
						if(foundSpace) {
							charArray[i] = Character.toUpperCase(charArray[i]);
							foundSpace = false;
						}
					} else {
						foundSpace = true;
						
					}
				}
				n.name = String.valueOf(charArray);
				
				while(n != null) {
					System.out.println("Welcome to the club " + n.name + "!\n"
					+ "Your area code and telephone number is " + "(" + n.numCode + ")" + n.numTel + "."
					+ "\nYou are a " + n.genderStat.toLowerCase() + " member and your age is " + n.ageStat + ".");
					n = n.next;
					System.out.println("\n---------------------------------------------\n");
				}
				
				
				System.out.println("Do you want to go back to the beginning? Yes or No");
				start = in.nextLine();
				System.out.println("\n---------------------------------------------\n");
				}
				while (start.equalsIgnoreCase("Yes"));
				
				
				in.close();
		}

	}


