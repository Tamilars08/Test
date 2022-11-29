package InterviewQuestions;

public class Vowels_Count {
	public static void main(String[] args) {

		String s = "This is a mad thing in my mind";
		String l = s.toLowerCase();
		char[] c = l.toCharArray();
		int vcount = 0;
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				vcount = vcount++;
			} else if (c[i] <= 'a' && c[i] >= 'z') {
				count = count++;
			}

		}
           System.out.println("Vcount =" + vcount);
           System.out.println("Count =" + count);
	}
}