package InterviewQuestions;

public class ReverseNumber {
	public static void main(String[] args) {
		int a = 123432;
		int a1 = a;
		int reverse = 0;
////             1		
		while (a1 > 0) {
////               3			
			int b = a1 % 10;                  //b = 2 - 3 - 4 - 3 - 2 - 1
////                          4			
			reverse = (reverse * 10) + b;    //234321
////               2			
			a1 = a1 / 10;          //123432 - 12343 - 1234 - 123 - 12 -1 -0

			if (reverse == a) {
				System.out.println("The value is PALINDROME");
				
			} else {
				System.out.println("The value is NOT-PALINDROME");

			}
		}
////		            5
		System.out.println(reverse);

//		int a = 123432;
//		int reverse = 0;
////             1		
//		while (a > 0) {
////               3			
//			int b = a % 10;          // b = 2 - 3 - 4 - 3 - 2 - 1
////                          4			
//			reverse = (reverse + b); // 0+2=2,2+3=5,5+4=9,9+3=12,12+2=14,14+1=15
////               2			
//			a = a / 10;             // 123432 - 12343 - 1234 - 123 - 12 -1 -0
//		}
////		            5
		//System.out.println(123432/10);

	}

}
