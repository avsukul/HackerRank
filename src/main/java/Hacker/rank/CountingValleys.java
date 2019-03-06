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
		int g = 0, v = 0;
		boolean below = false; // track if previously under ground
		for (int i = 0; i <= s.length() -1; i++) {
			if (s.charAt(i) == 'U') {
				g += 1; // step up from/towards ground
			} else if (s.charAt(i) == 'D') {
				g -= 1; //step down from/towards ground
			}
			if (g < 0 || below == true) {
				below = true; // below ground.
				if (g == 0) {
					v += 1; below = false; // made it back to ground. Reset below to false and start again.
				}
			}
		}
		return v;
	}
}
