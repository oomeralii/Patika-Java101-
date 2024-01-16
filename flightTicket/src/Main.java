import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int age, type;
		double km, tutar;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz : ");
		km = input.nextDouble();
		if (km > 0) {
			tutar =  km * 0.10; 
			System.out.print("Yaşınızı giriniz : ");
			age = input.nextInt();
			if (age > 0) {
				if (age < 12) {
					tutar = tutar / 2;
				}
				if (age >=12 && age <= 24 ) {
					tutar = tutar - (tutar * 0.1);
				}
				if (age > 65) {
					tutar = tutar - (tutar * 0.3);
				}
				System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
				type = input.nextInt();
				if (type == 1 || type == 2) {
					if (type == 2 ) {
						tutar = (tutar - (tutar * 0.2 )) * 2;
						System.out.println("Toplam Tutar = " + tutar + (" TL")) ;	
					}else {
						System.out.println("Toplam Tutar = " + tutar + (" TL")) ;	
					}
				}else {
					System.out.print("Hatalı Veri Girdiniz !");
				}
				}else {
				System.out.print("Hatalı Veri Girdiniz !");
				}
			
			}else {
				System.out.print("Hatalı Veri Girdiniz !");
			}	
		}	
}
