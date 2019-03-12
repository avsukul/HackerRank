package Hacker.rank;

import java.io.IOException;
import java.math.BigDecimal;

public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		int a  = 0, j = 0, aa = 0; long len = n % s.length();
		for (int i = 0 ; i <= s.length()-1; i++) {
			if (s.charAt(i)== 'a') {
				a++;
				if (len > 0) {
					if (s.charAt(j) == 'a') {
						aa++; j = i; len--;
					}
				}
			} else {
				continue;
			}
		}
		long v = (long) (n/(s.length() / 1000.00) * 1000000000000.00);
		System.out.println(v);
		return (long) ((Math.ceil(n/s.length()) * a) + aa);
	}

	public static void main(String[] args) throws IOException {
//		String s = "aba"; long n = 10;
//		System.out.println(repeatedString(s, n));
//		String s1 = "a"; long n1 = 10;
//		System.out.println(repeatedString(s1, n1));
//		String s2 = "abcacg"; long n2 = 10;
//		System.out.println(repeatedString(s2, n2));
//		String s3 = "abcac"; long n3 = 10;
//		System.out.println(repeatedString(s3, n3));
//		String s4 = "gfcaaaecbg"; long n4 = 547602;
//		System.out.println(repeatedString(s4, n4));
		String s5 = "cfimaakj"; long n5 = 554045874191L;
		System.out.println(repeatedString(s5,(long) n5));
	}
}
