package Hacker.rank;


public class t {

	public static void main(String[] args) {
		String s ="jdiacikk";
		long n = 899491; 
		int a  = 0, j = 0, aa = 0; long remChar = n % s.length();
		for (int i = 0 ; i <= s.length()-1; i++) {
			j = i;
			if (s.charAt(i)== 'a') {
				a++;
				if (remChar > 0) {
					if (j < remChar) {
						if (s.charAt(j) == 'a') {
							aa++; j = i; remChar--;
						}
					}
				}
			}
		}
		System.out.println("string len: " + s.length() + " | String cannot exceed n: " + n);
		System.out.println("A's: " + a);

		long f = n/s.length();
		System.out.println("string can go into n: " + f); 

		long fa = a*f;
		System.out.println("A's: " + fa);

		long r = n%s.length();
		System.out.println("\nremaining chars: " + r); 
		System.out.println("A's in remaining chars: " + aa);

		long totalA = fa + aa;
		System.out.println("\ntotal combined A's: " + totalA);
	}
}
