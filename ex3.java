import java.util.Scanner;

public class ex3 {
	
	static String sc (String x) {
		Scanner sc = new Scanner(System.in);
		x = sc.nextLine();
		
		return x;
	}

	public static void main(String[] args) {
		String username = "";
		String password = "";
		
		System.out.println("Kullanıcı adınızı girin : ");
		username = sc(username);
		System.out.println("Şifreniz : ");
		password = sc(password);
		
//		if(password.equals("1234")) {
//			if(username.equals("admin")) {
//				System.out.println("Hoşgeldin Admin!!");
//			}else {
//				System.out.println("Merhaba " + username);
//			}
//		}else {
//			System.out.println("Şifreniz hatalı!!");
//		}
		
		if(password.length() <=3) {
			System.out.println("Şifre 4 karakterden az olmamalıdır.");
		}

	}

}
