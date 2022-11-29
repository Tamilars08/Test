package InterviewQuestions;

public class Fibonocci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		for (int i = 1; i < 10; i++) {
			int c = a + b;
			System.out.println(c);//2 3
			a = b; //1 1 2 3
			b = c; //1 2 3 5

		}

	}

}
