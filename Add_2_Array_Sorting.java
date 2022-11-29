package InterviewQuestions;

import java.util.Arrays;

public class Add_2_Array_Sorting {
	public static void main(String[] args) {
		int[] a = {1,5,6,3,4};
		int[] b = {6,7,4,5,6};
		int l1 = a.length;
		int l2 = b.length;
		int l3 = l1+l2;
		int[] c = new int[l3];
		int t = 0;
		// store all elements in c array
		
		for(int i=0;i<a.length;i++) {
		
			c[i] = a[i];
		}
		
		int lenDiv =l3/2;
		for(int i=0;i<b.length;i++) {
			
			c[lenDiv] = b[i];
			lenDiv++;
		}
		
		
		System.out.println(Arrays.toString(c));
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					t = c[i];
					c[i] = c[j];
					c[j] = t;
				}
			}
	
		}
		
		System.out.println(Arrays.toString(c));
         
	}

}
