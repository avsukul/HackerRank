package Hacker.rank;

public class JumpingClouds {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int j = 0;
		for (int i = 1; i <= c.length-1; i++) {
			if (c[i] == 1 && i == 3 && c[i-2] == 0) {
			} else if (c[i] == 1 && c[i-1] == 0 && i != 1) {
				j++;
			} else if (c[i] == 0 && i < c.length-2) {
				if (c[i+1] == 0) {
					j++; i++;
				} else if (c[i] == 0) {
					j++; i++;
				}
			} else if (c[i] == 0) {
				j++;
			} 
		}
		return j;
	}

	public static void main(String[] args) {
		int[] c = {0, 0, 0, 1, 0, 0};
		System.out.println(jumpingOnClouds(c));
		int[] c1 = {0,1,0,0,0,1,0};
		System.out.println(jumpingOnClouds(c1));
		int[] c2 = {0, 1, 0, 0, 1, 0};
		System.out.println(jumpingOnClouds(c2));
		int[] c3 = {0, 0, 1, 0, 0, 1,0};
		System.out.println(jumpingOnClouds(c3));
		int[] c4 = {1, 1, 1, 1, 1, 1, 1};
		System.out.println(jumpingOnClouds(c4));
		int[] c5 = {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0};
		System.out.println(jumpingOnClouds(c5));
	}
}
