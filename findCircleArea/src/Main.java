
//  Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double pi = 3.14 , r , angle;
		

		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin Yarıçapını Giriniz : ");
		
		r = input.nextDouble();
		
		System.out.print("Dairenin Merkez Açısının Ölçüsünü Giriniz : ");
		
		angle =input.nextDouble();
		
		double area = (pi * r * r * angle) / 360;
		
		
		System.out.println("Dairenin Alanı : " + area);
		
		

	}

}
