package javadersleri.ders6;

import java.util.Scanner;

public class ATM {

	public void calis(Hesap hesap) {
		Login login = new Login();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bankamýza Hoþgeldiniz.");
		System.out.println("****************************");
		System.out.println("Kullanýcý Giriþi ");
		System.out.println("****************************");
		int giris_hakki = 3;

		while (true) {
			if (login.login(hesap)) {
				System.out.println("Giriþ Baþarýlý ");
				break;

			} else {
				System.out.println("Giriþ Baþarýsýz ");
				giris_hakki = -1;
				System.out.println("Kalan Giriþ Hakký " + giris_hakki);
			}
			if (giris_hakki == 0) {
				System.out.println("Griiþ Hakkýnýz Bitti...");

				return;
			}
		}
		System.out.println("*************************");
		String islemler = "1. Bakiye Görüntüle \n" + "2. Para Yatýrma \n" + "3. Para Çekme \n"
				+ "   Çýkýþ için q'a Basýn";
		System.out.println(islemler);
		System.out.println("*************************");

		while (true) {
			System.out.println("Ýþlemi Seçiniz : ");
			System.out.println("*************************");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				break;

			} else if (islem.equals("1")) {
				System.out.println("Bakineyiz : " + hesap.getBakiye());
			} else if (islem.equals("2")) {
				System.out.println("Yatýrmak Ýstediðiniz Tutar ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraYatir(tutar);
			} else if (islem.equals("3")) {
				System.out.println("Çekmek Ýstedeðiniz Tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraCek(tutar);
			} else {
				System.out.println("Geçersiz Ýþlem...");
			}

		}
	}
}