package Hacker.rank;

import java.io.IOException;
import java.util.Scanner;

public class Merchant {
	
    public static void main(String[] args) throws IOException {
    	int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
    	System.out.println(sockMerchant(9, ar));
    }
    
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	int ind = 0;
    	int tmp = 0;
    	int cnt = 0;
    	for (int i = 0; i <= ar.length; i++) {
    		if (tmp != ar[i] && tmp != ar[0] && tmp == 0) {
    			tmp = ar[i];
    			i = 0;
    			continue;
    		} 
    		else if (tmp == ar[i]) {
    			cnt += 1;
    			ind += 1;
    			tmp = ar[ind];
    			i = ind;
    			continue;
    		}
    	}
    	return cnt;
    }
}