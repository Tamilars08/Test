package InterviewQuestions;

public class Immutable_Class_2 {
	public static void main(String[] args) {
		Immutable_Class c = new Immutable_Class("123456789");
		String mobNo = c.getMobNo();
		System.out.println(mobNo);
	}

}
