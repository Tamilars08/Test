package InterviewQuestions;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class stringMaxCharCount {
	private static void maxValueCharArray() {

		String s = "selenium selenium tamil tamil tamil tamimmmmmmmmmmmml tamil tamil suresh kanda";
		Map<Character, Integer> m = new LinkedHashMap();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			if (m.containsKey(c)) {
				Integer in = m.get(c);
				m.put(c, in + 1);
			} else {
				m.put(c, 1);
			}
		}
		
		System.out.println(m);
		Collection<Integer> values = m.values();
		System.out.println(values);
		Integer max = Collections.max(values);
		System.out.println(max);
//		for (Entry<Character, Integer> entry : m.entrySet()) {
//			if (entry.getValue() == max) {
//				System.out.println(entry);
//			}
		//}

	}
//	private static void maxValueChar() {
//
//		String s = "selenium selenium tamil tamil tamil tamimmmmmmmmmmmml tamil tamil suresh kanda";
//		Map<Character, Integer> m = new LinkedHashMap();
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (m.containsKey(c)) {
//				Integer in = m.get(c);
//				m.put(c, in + 1);
//			} else {
//				m.put(c, 1);
//			}
//		}
//		System.out.println(m);
//		Collection<Integer> values = m.values();
//		System.out.println(values);
//		Integer max = Collections.max(values);
//		System.out.println(max);
//		for (Entry<Character, Integer> entry : m.entrySet()) {
//			if (entry.getValue() == max) {
//				System.out.println(entry);
//			}
//		}
//
//	}
//
//	private static void maxValue() {
//		String s = "selenium selenium tamil tamil tamil tamil tamil tamil suresh kanda";
//		String[] split = s.split(" ");
//		Map<String, Integer> m = new LinkedHashMap();
//		for (String s1 : split) {
//			if (m.containsKey(s1)) {
//				Integer in = m.get(s1);
//				m.put(s1, in + 1);
//			} else {
//				m.put(s1, 1);
//			}
//		}
//		System.out.println(m);
//		Collection<Integer> values = m.values();
//		System.out.println(values);
//		Integer max = Collections.max(values);
//		System.out.println(max);
//		for (Map.Entry<String, Integer> entry : m.entrySet()) {
//			if (entry.getValue() == max) {
//				System.out.println(entry);
//			}
//		}
//
//	}

//	public static void main(String[] args) {
//		maxValueCharArray();
//		maxValueChar();
//		maxValue();
//	}
	/*
	 * public static void main(String[] args) { String s =
	 * "my roommates are my roommates of my roommates"; String[] split =
	 * s.split(" "); System.out.println(Arrays.toString(split)); Set<String> obj =
	 * new LinkedHashSet<>(); for (String split5 : split) { obj.add(split5); }
	 * System.out.println(obj); // int count = 0; for (String obj2 : obj) { int
	 * count = 0; for (String split1 : split) {
	 * 
	 * if (obj2.equals(split1)) { count++; // System.out.println(count);
	 * 
	 * }
	 * 
	 * } if (count > 1) { System.out.println(obj2 + "=" + count);
	 * 
	 * } } }
	 */}

//		int count = 0;
//		for (int i = 0; i < split.length; i++) {
//			count = 1;
//			for (int j = i+1; j < split.length; j++) {
//				count++;
//				if (split[i].equals(split[j])) {
//					count++;
//					split[j] = "0";
//
//				}
//			}
//			if (count > 1 && split[i] != "0") {
//				System.out.println(split[i]);
//
//			}
//
//		}
