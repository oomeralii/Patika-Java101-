//Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, aubergine = 5.00;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilo ? :");
		
		pear *= input.nextDouble();
		
		System.out.print("Elma Kaç Kilo ? :");
		
		apple *= input.nextDouble();
				
		System.out.print("Domates Kaç Kilo ? :");
		
		tomatoes *= input.nextDouble();
		
		System.out.print("Muz Kaç Kilo ? :");
		
		banana *= input.nextDouble();
		
		System.out.print("Patlıcan Kaç Kilo ? :");
		
		aubergine *= input.nextDouble();
		
		System.out.print("Toplam Tutar : " + (pear + apple + tomatoes + banana + aubergine) + " TL" );
			
	}

}