package Algorithms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int l = sc.nextInt();
		int[] arr = new int[l];
		System.out.println("Enter values in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); 
		}
		System.out.println("Enter number to search for");
		int s = sc.nextInt();
		System.out.println("Index : " + linearSearch(arr, s));
		sc.close();
	}

	static int linearSearch(int[] arr, int s) {
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] == s) {
				return i;
			}
		}
		return -1;
	}

}
