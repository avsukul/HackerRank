package Algorithms;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,55,123}; int s = 123;
		System.out.println("non-recursive search Index " + nonRecursivebinarySearch(arr, s));
		System.out.println("recursive search Index " + recursiveBinarySearch(arr, s, 0, arr.length-1));
	}
	
	
	static int nonRecursivebinarySearch(int[] arr, int s) {
		int low = 0;
		int high = arr.length-1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (arr[mid] == s) {
				return mid;
			} else if (arr[mid] < s) {
				low = mid + 1;
			} else if (arr[mid] > s) {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	static int recursiveBinarySearch(int[] arr,  int s, int low, int high) {
		int mid = (low + high) / 2;
		if (low > high) {
			return -1;
		}
		if (arr[mid] == s) {
			return mid;
		} else if (arr[mid] < s) {
			return recursiveBinarySearch(arr, s, mid + 1, high);
		} else { 
			return recursiveBinarySearch(arr, s, low, mid - 1);
		}
	}
}
