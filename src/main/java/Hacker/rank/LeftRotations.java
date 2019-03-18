package Hacker.rank;

import java.util.*;

public class LeftRotations {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
		List<Integer> aa = new ArrayList<Integer>();
		for (int i = 0; i <= a.length-1; i++) {
			if (aa.size() < a.length) {
				aa.add(a[i]);
				if (i == a.length-1) {
					i = 0;
					Collections.rotate(aa, -d);
				}
			}
			if (aa.size() == a.length) {
				a[i] = aa.get(i);
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5};
		System.out.println(Arrays.toString(rotLeft(a, 4)));
	}
}
