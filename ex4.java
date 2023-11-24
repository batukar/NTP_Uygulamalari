import java.util.Scanner;

public class ex4 {
	
	public static int usAlma (int x, int y) {
		if(y == 0) {
			return 1;
		}else {
			return x * usAlma(x, y-1);
		}
	} // O(n)
	
	
	static int sc (int x) {
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		return x;
	}

	public static void main(String[] args) {
		int taban = 0;
		int us = 0;
		int result = 1;
		
		System.out.println("sayı girin :");
		taban = sc(taban);
		us = sc(us);
		
		
		result = usAlma(taban, us);
		
		System.out.println(taban + " üssü " + us + " = " + result);

	}

}
