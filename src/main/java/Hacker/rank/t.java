package Hacker.rank;


public class t {
	
	public static void main(String[] args) {
		String s ="udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";
		long a = 0;
		for (int i = 0; i <= s.length()-1; i++) {
			if (s.charAt(i) == 'a') {
				a++;
			}
		}
		System.out.println("a: " + a);
		
		long len = s.length(); 
		System.out.println("len: " + len);
		
		long n = 10; 
		System.out.println("n: " + n);
		
		long v = Math.round(n/((len*1.0)/1.0));
		System.out.println(v); 
		
		System.out.println("n/len: " + Math.round(v*1.0/1.0) * a); 
//		System.out.println("n/len: " + Math.round((n/((len*100.0)/100.00))*a)); 
	}
}
