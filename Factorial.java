package InterviewQuestions;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the value");
//		int nextInt = s.nextInt();
//		int fact = 1;
//		for (int i1 = 1; i1 <= nextInt; i1++) {
//			fact = fact * i1;
//		}
//		System.out.println(fact);
		System.out.println("===========================================");

//		int i = 1;
//        int fact = 1;
//		while (i <= 5) {
//			fact = fact * i;
//			i++;
//
//		}
//		System.out.println(fact);

//		System.out.println("====================================");
//		int f = 1;
//		for (int i = 1; i <=5; i++) {
//			f=f*i;
//			
//		}
//		System.out.println(f);

		String ip = "babcadaefhef";

		int z = 0;
		int t;

		char arr[] = ip.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			t = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j])

				{
					t++;
				}
			}

			if (t > 1) {

				System.out.println(arr[i]);

				z++;
			}
		}

		System.out.println(z);

	}

}
