package InterviewQuestions;

public class StringRev {
	public static void main(String[] args) {
		String a = "Tamil";
		char[] charArray = a.toCharArray();
		String b = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.println(charArray[i]);
			b = b + charArray[i];
		}
		if (b.equals(a)) {
			System.err.println("Palindrome");
		} else {
			System.err.println("Not a Palindrome");
		}
	}	

}
