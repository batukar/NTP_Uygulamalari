import java.util.Scanner;

public class ex1 {

	static int sc () {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		int y = 0;
		int result = 0;
		
		System.out.println("İlk sayıyı girin : ");
		x = sc();
		System.out.println("İkinci sayıyı girin : ");
		y = sc();
		
		
		result = x + y;
		
		
		System.out.println(x + " + " + y + " = " + result);
		
		
		
		

	}

}
