
// kapsülleme
class ATM {
	private String hesapSahibi; 
	private double bakiye;
	private String usd;
	private String euro;
	
	public ATM() { // esneklik kazandırır boş yapıcılar //varsayalın değer ataması için boş yapıcı kullanıldı.
		this.hesapSahibi = "Bilinmiyor";
		this.bakiye = 0.0;
		this.usd = "usd";
		this.euro = "euro";
	}

	public ATM(String hesapSahibi, double bakiye, String usd, String euro) {
		this.hesapSahibi = hesapSahibi;
		this.bakiye = bakiye;
		this.usd = usd;
		this.euro = euro;
	}
	
	// değişmesini istemediğimiz için "final" fonksiyon tanımlaması yaptık
	public final void bakiyeGoster() {
		System.out.println(hesapSahibi + " adlı musteriye ait bakiye bilgisi: "  + bakiye + " TL'dir.");
	}
	
	public void paraYatir(int miktar) {
		bakiye += miktar;
		System.out.println(hesapSahibi + " adlı musterinin hesabina " + miktar + " TL yatirilmistir.");
		System.out.println("Yeni bakiye : " + bakiye);
	}
	
	public void paraYatir(int miktar, String tur) {
		switch(tur) {
			case "usd":
				bakiye = bakiye + (miktar * 28);
				System.out.println(hesapSahibi + " adlı musterinin hesabina " + miktar + " USD yatirilmistir.");
				System.out.println("Yeni bakiye : " + bakiye);
				break;
			case "euro":
				bakiye = bakiye + (miktar * 31);
				System.out.println(hesapSahibi + " adlı musterinin hesabina " + miktar + " EURO yatirilmistir.");
				System.out.println("Yeni bakiye : " + bakiye);
				break;
			default:
				System.out.println("Gecersiz islem");
				break;
		}
		
	}
	
	public void paraCek(int miktar) {
		if(miktar > 0 && miktar <= bakiye) {
			bakiye -= miktar;
			System.out.println(hesapSahibi + " adlı musterinin hesabindan " + miktar + " Tl cekilmistir.");
			System.out.println("Yeni bakiye : " + bakiye);
		}else
			System.out.println("Gecersiz islem");
	}
	
	public static void atmInfo() {
		System.out.println("*****************************************************************");
		System.out.println("ATM'ye Hos geldiniz!");
		System.out.println("Bu ATM ile bakiye goruntuleyebilir, para yatirip, cekebilirsiniz.");
		System.out.println("*****************************************************************");
	}
	
}

public class ex6 {

	public static void main(String[] args) {
		ATM hesap1 = new ATM();
		ATM hesap2 = new ATM("Batuhan", 10000.0, "", "");
		
		ATM.atmInfo();
		
		hesap1.bakiyeGoster();
		hesap2.bakiyeGoster();
		
		hesap2.paraYatir(5000);
		
		hesap2.paraCek(3000);
		
		hesap2.paraYatir(200, "usd");
		hesap2.paraYatir(100, "euro");
		
		hesap2.paraCek(10000);
		
		hesap2.bakiyeGoster();
		
		
		
		

	}

}
