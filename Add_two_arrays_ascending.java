package InterviewQuestions;

import java.util.Arrays;

import javax.sound.midi.SysexMessage;

public class Add_two_arrays_ascending {
	public static void main(String[] args) {
		String[] s = {"Tamily"};
		String[] s1 = {"Arasan"};
		int l3 = s.length+s1.length;
		String[] s2 = new String[l3];
		int t=0;
		for (int i=0; i<s.length; i++) {
			s2[i] = s[i];
		}
		int lenDiv=l3/2;
		for (int i=0; i <s1.length; i++) {
			s2[lenDiv] = s1[i];
			lenDiv++;
		}
		System.out.println(Arrays.toString(s2));
		
//		for (int i=0; i<s2.length; i++) {
//			for (int j=i+1; j<s2.length; j++) {
//				if() {
//					
//				}
//				
//				
//			}
//			
//		}
		
		
		
		
		
		
		
	}

}
