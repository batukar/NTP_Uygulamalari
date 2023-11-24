// Yıkıcılar (Finalize)

class Tool{
	private int kaynakID;
	
	public Tool(int id) {
		kaynakID = id;
		
		if(kaynakID == 1) 
			System.out.println("Kaşık alındı.");
		else 
			System.out.println("Çatal alındı.");
	}
	
	public void kullan(int id) {	
		if(id == 1) 
			System.out.println("Kaşık kullanılıyor.");
		else 
			System.out.println("Çatal kullanılıyor.");
	}
	
	protected void finalize() {
		System.out.println("Yemek aracı olan " + kaynakID + " yok ediliyor.");
	}
}

// auto closeable yöntemi

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tool spoon = new Tool(1);
		Tool fork = new Tool(2);
		
		spoon.kullan(1);
		fork.kullan(2);
		
		spoon = null;
		fork = null;

		
		System.gc();

	}

}


