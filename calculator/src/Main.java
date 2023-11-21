import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("İlk Sayıyı Giriniz : ");
		double n1 = input.nextDouble();
		
		System.out.print("İkinci Sayıyı Giriniz : ");
		double n2 = input.nextDouble();
		
		System.out.println("**********************");
		System.out.println("Toplama İçin 1 : ");
		System.out.println("Çıkarma İçin 2 : ");
		System.out.println("Çarpma İçin 3 : ");
		System.out.println("Bölme İçin 4 : ");
		System.out.println("**********************");
		
		int select = input.nextInt();	
		switch (select) {
		case 1: {
			System.out.println("Sonuç : " + (n1 + n2));
			break;
		}
		case 2: {
			System.out.println("Sonuç : " + (n1 - n2));
			break;
		}
		case 3: {
			System.out.println("Sonuç : " + (n1 * n2));
			break;
		}
		case 4: {
			if(n2 != 0 ) {
				System.out.println("Sonuç : " + (n1 / n2));
			}else {
				System.out.println("Bir Sayı 0 ile Bölünemez!!!");
			}
			
			break;
		}
		default:
			System.out.println("Yanlış Seçim Yaptınız.");
		}
	
	}
	
}
