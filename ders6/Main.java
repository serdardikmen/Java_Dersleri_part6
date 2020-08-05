package javadersleri.ders6;

public class Main {
	public static void main (String [] args) {
	
	ATM atm = new ATM();
	 
	Hesap hesap  = new Hesap("Serdarhan Dikmen","123456",5000);
	
	atm.calis(hesap);
	System.out.println("Programdan Çıkılıyor. ");


}
}

