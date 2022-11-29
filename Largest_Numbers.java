package InterviewQuestions;

import java.util.Scanner;

public class Largest_Numbers {
	public static void main(String[] args) {
//		int x = 10;
//		int y = 20;
//		int z = 30;
		int x,y,z;
		int large = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 3 numbers10");
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		if (x > y && x > z) {
			large = x;
		} else if (y > x && y > z) {
			large = y;
		} else if (z > x && z > y) {
			large = z;
		}
		System.out.println("Largest numbers is = " + large);
	}

}
