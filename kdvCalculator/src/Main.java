//KDV Hesaplama

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double amount , amountKdv , sumKdv;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Toplam Tutarı Giriniz");
		
		amount = input.nextDouble();
		
		double kdv = (amount <= 1000) ? 0.18 :  0.08 ;
		
		amountKdv = amount * kdv  + amount;
		sumKdv = amountKdv - amount;
		
		System.out.println("KDV'siz Fiyat : " + amount);
		
		System.out.println("KDV Oranı : " + kdv);
		
		System.out.println("KDV'li Fiyat : " +  amountKdv);
		
		System.out.println("Toplam KDV : " + sumKdv);

	}

}
