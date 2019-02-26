package Hacker.rank;

import java.io.IOException;
import java.util.Scanner;

public class Merchant {
	
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
    	System.out.println(cnt);
    	return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
    	
    	int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(9, ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}