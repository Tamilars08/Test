package InterviewQuestions;

public class String_Methods {
	public static void main(String[] args) {
		String s = "Welcome THOR";
		String s2 = "Wwlcome HULK";
		String s3 = "Wlcome PANTHER";

		char charAt = s.charAt(3);
		System.out.println(charAt);

		int indexOf = s2.indexOf('o');
		System.out.println(indexOf);

		String upperCase = s3.toUpperCase();
		System.out.println(upperCase);

		char charAt2 = upperCase.charAt(3);
		System.out.println(charAt2);

		String lowerCase = s3.toLowerCase();
		System.out.println(lowerCase);

		boolean empty = s.isEmpty();
		System.err.println(empty);

		boolean startsWith = s.startsWith("c");
		System.err.println(startsWith);

		boolean endsWith = s.endsWith("R");
		System.out.println(endsWith);

		int length = s3.length();
		System.out.println(length);

		int lastIndexOf = s3.lastIndexOf('R');
		System.out.println(lastIndexOf);
		
		boolean contains = s.contains("W");
		System.out.println(contains);
		
		boolean equals = s.equals(s2);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s2);
		System.out.println(equalsIgnoreCase);
		
		int equalsIgnoreCase1 = s.compareTo(s3);
		System.out.println(equalsIgnoreCase1);
		
		String replace = s.replace('W', 'P');
		System.out.println(replace);
		
		String replaceAll = s.replaceAll("e", "o");
		System.out.println(replaceAll);
		
		String t = s.trim();
		System.out.println(t);
	
		
		
		 String substring = s.substring(3);
		System.out.println(substring);
		
		String substring2 = s.substring(3, 9);
		System.out.println(substring2);
		

	}

}
