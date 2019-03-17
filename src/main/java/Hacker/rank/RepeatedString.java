package Hacker.rank;

import java.io.IOException;

public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		int A  = 0, j = 0, remA = 0; 
		for (int i = 0 ; i <= s.length()-1; i++) {
			j = i; A = s.charAt(i) == 'a' ? A+1 : A;
			if (i < n % s.length() && s.charAt(j) == 'a') {
				remA++; j = i;
			}
		}
		return A * (n / s.length()) + remA;
	}

	public static void main(String[] args) throws IOException {
		switch ("") {
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

		case "s11":
			String s9111 = "jdiacikk";
			long n9111 = 899491;
			System.out.println(repeatedString(s9111, n9111));
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

			String s101 = "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";
			long n101 = 872514961806L;
			System.out.println(repeatedString(s101, n101));

			String s1111 = "jdiacikk";
			long n111 = 899491;
			System.out.println(repeatedString(s1111, n111));
			break;
		}
	}
}


