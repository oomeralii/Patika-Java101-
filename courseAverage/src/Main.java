import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int  matematik, fizik, türkce, kimya, müzik, dersSayisi=0;
		double total=0,avarege;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik Notunuzu Giriniz : ");
		matematik = input.nextInt();
		if(matematik < 0 || matematik >100 ) {
			System.out.println("Matematik Notunuz Geçersiz Bir Nottur.Notunuz Ortalamaya Dahil Edilmeyecek.");
		}else {
			dersSayisi ++;
			total = total+ matematik; 
		}
		System.out.print("Fizik Notunuzu Giriniz : ");
		fizik = input.nextInt();
		if(fizik < 0 || fizik > 100 ) {
			System.out.println("Fizik Notunuz Geçersiz Bir Nottur.Notunuz Ortalamaya Dahil Edilmeyecek.");
		}else {
			dersSayisi ++;
			total = total + fizik;
		}
		System.out.print("Türkçe Notunuzu Giriniz : ");
		türkce = input.nextInt();
		if(türkce < 0 || türkce > 100 ) {
			System.out.println("Türkçe Notunuz Geçersiz Bir Nottur.Notunuz Ortalamaya Dahil Edilmeyecek.");
		}else {
			dersSayisi ++;
			total =total + türkce;
		}
		System.out.print("Kimya Notunuzu Giriniz : ");
		kimya = input.nextInt();
		if(kimya < 0 || kimya > 100 ) {
			System.out.println("Kimya Notunuz Geçersiz Bir Nottur.Notunuz Ortalamaya Dahil Edilmeyecek.");
		}else {
			dersSayisi ++;
			total =total + kimya;
		}
		System.out.print("Müzik Notunuzu Giriniz : ");
		müzik = input.nextInt();
		if(müzik < 0 || müzik > 100 ) {
			System.out.println("Müzik Notunuz Geçersiz Bir Nottur.Notunuz Ortalamaya Dahil Ediilmeyecek.");
		}else {
			dersSayisi ++;
			total =total + müzik;
		}
		
		avarege = total / dersSayisi;
		if (avarege < 55) {
			System.out.println("Ortalamanız : " + avarege);
			System.out.println("Ortalamanız 55'den Küçük.(Kaldınız)");
		}else {
			System.out.println("Ortalamanız : " + avarege);
			System.out.println("Ortalamanız 55'den Büyük.(Geçtiniz)");
		}
	}
}
