package Hacker.rank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {


	public static void main(String[] args) throws IOException {

		System.out.println(countingValleys(12, ""));
	}

	public static int countingValleys(int n, String s) {
		int g = 0, v =0;
		boolean below = false;
		for (int i = 0; i <= s.length() -1; i++) {
			if (s.charAt(i) == 'U') {
				g += 1; 
			} else if (s.charAt(i) == 'D') {
				g -= 1;
			}
			if (g < 0 || below == true) {
				below = true;
				if (g == 0) {
					v += 1; below = false;
				}
			}
		}
		return v;
	}
}
