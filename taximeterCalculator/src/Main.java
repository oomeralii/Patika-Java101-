
/*
  								Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

-Taksimetre KM başına 2.20 TL tutmaktadır.
-Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
-Taksimetre açılış ücreti 10 TL'dir.

*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double perKm = 2.20 , startPrice = 10 , total, km;  
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafeyi KM cinsinden Giriniz : ");
		
		km = input.nextDouble();
		
		
		
		total = startPrice + (km * perKm);
		total =(total < 20) ? 20 : total ;
		
		System.out.println("Toplam Tutar : " + total);
		
		
		
		
		

	}

}
