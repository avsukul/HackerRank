package Hacker.rank;

import java.io.IOException;

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
			}
		}
		if ((n/s.length()) > 1000000.0) {
			return (long) Math.round(Math.ceil((n/(s.length()*1.0)*1.00)/1.00 * a)) + aa;
		}
		return n/s.length() * a + aa;
	}

	public static void main(String[] args) throws IOException {
		switch ("S9") {
		case "s": 
			String s = "aba"; long n = 10;
			System.out.println(repeatedString(s, n));
			break;

		case "s1":
			String s1 = "ojowrdcpavatfacuunxycyrmpbkvaxyrsgquwehhurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt";
			long n1 = 685118368975L;
			System.out.println(repeatedString(s1, n1));
			break;

		case "s2":
			String s2 = "abcacg"; long n2 = 10;
			System.out.println(repeatedString(s2, n2));
			break;

		case "s3":
			String s3 = "abcac"; long n3 = 10;
			System.out.println(repeatedString(s3, n3));
			break;

		case "s4":
			String s4 = "gfcaaaecbg"; long n4 = 547602;
			System.out.println(repeatedString(s4, n4));
			break;

		case "s5":
			String s5 = "cfimaakj"; long n5 = 554045874191L;
			System.out.println(repeatedString(s5,(long) n5));
			break;

		case "s7":
			String s7 = "a"; long n7 = 1000000000000L;
			System.out.println(repeatedString(s7,(long) n7));
			break;

		case "s8":
			String s8 = "aab"; long n8 = 882787;
			System.out.println(repeatedString(s8, n8));
			break;

		case "s9":
			String s9 = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
			long n9 = 549382313570L;
			System.out.println(repeatedString(s9, n9));
			break;
		
		case "s10":
			String s911 = "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";
			long n911 = 872514961806L;
			System.out.println(repeatedString(s911, n911));
			break;

		default:
			String s11 = "aba"; long n100 = 10;
			System.out.println(repeatedString(s11, n100));

			String s111 = "ojowrdcpavatfacuunxycyrmpbkvaxyrsgquwehhurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt";
			long n11 = 685118368975L;
			System.out.println(repeatedString(s111, n11));

			String s21 = "abcacg"; long n21 = 10;
			System.out.println(repeatedString(s21, n21));

			String s31 = "abcac"; long n31 = 10;
			System.out.println(repeatedString(s31, n31));

			String s41 = "gfcaaaecbg"; long n41 = 547602;
			System.out.println(repeatedString(s41, n41));

			String s51 = "cfimaakj"; long n51 = 554045874191L;
			System.out.println(repeatedString(s51,(long) n51));

			String s71 = "a"; long n71 = 1000000000000L;
			System.out.println(repeatedString(s71,(long) n71));

			String s81 = "aab"; long n81 = 882787;
			System.out.println(repeatedString(s81, n81));

			String s91 = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
			long n91 = 549382313570L;
			System.out.println(repeatedString(s91, n91));
			
			String s9111 = "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";
			long n9111 = 872514961806L;
			System.out.println(repeatedString(s9111, n9111));
			
			break;
		}
	}
}


