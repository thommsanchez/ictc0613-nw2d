package Activity4B;
import java.util.Scanner;
public class Act4B_Nw2d_Canaria {

	public static void main(String[] args) {
		int width, loc, i;
		char yesNo;
		char Y,N;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		width = scan.nextInt();
		int [] numArr = new int[width];
		System.out.println("Enter Array Element: ");
			for (i = 0; i < width; i++) {
				numArr [i] = scan.nextInt();
			}
		System.out.println("Elements Of Array: ");
			for (i = 0; i < numArr.length; i++) {
				System.out.println(numArr [i]);
			}
		
		System.out.print("Do you wish to delete an Element?[Y] or [N]: ");
		yesNo = scan.next().charAt(0);
			switch (yesNo) {
				case 'Y':
					System.out.print("Enter Array Position: ");
					loc = scan.nextInt();
						for (i = loc; i < width - 1; i++) {
							numArr [i] = numArr[i + 1];
						}
						width--;
					break;
				case 'N':
					System.out.println("Okay!");
					break;
					}
					
		System.out.println("New Elements Of Array: ");
			for (i = 0; i < width; i++) {
				System.out.println(numArr[i]);
			}
		System.out.print("End Of Program!");
		scan.close();
	}
	

}
