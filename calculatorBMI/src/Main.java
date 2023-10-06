
//Java ile Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double weight , lenght , bmi;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		
		lenght = input.nextDouble();
	
		System.out.print("Lütfen kilonuzu giriniz : ");
		
		weight = input.nextDouble();
		
		bmi = weight / (lenght * lenght) ;
		
		System.out.println("Vücut Kitle İndeksiniz : " + bmi);
	}

}
