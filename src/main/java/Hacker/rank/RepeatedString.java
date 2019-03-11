package Hacker.rank;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		long a  = 0, m = 0, index = 0;
		for (int i = 0 ; i <= s.length()-1; i++) {
			if (s.charAt(i) == 'a') {
				a++;
				index = i;
			} else {
				m++;
			}
		}
		long len = s.length();
		long w = n/len;
		long x = n%len;
		long y = 0;
		if (index < x) {
			 y = (x/index) + w;
		}
		y = a * len + x;
		return y;
	}

	public static void main(String[] args) throws IOException {
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		//
		//        String s = scanner.nextLine();
		//
		//        long n = scanner.nextLong();
		//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//    							 1000000000000
		String s = "abcac"; long n = 10;
		//        long result = repeatedString(s, n);
		System.out.println(repeatedString(s, n));
		//        bufferedWriter.write(String.valueOf(result));
		//        bufferedWriter.newLine();
		//
		//        bufferedWriter.close();
		//
		//        scanner.close();
	}
}