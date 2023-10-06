//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double firstEdge , secondEdge , thirdEdge , area , perimeter , perimeterSemi;
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Birinci Kenar Uzunluğunu Giriniz : ");
		
		firstEdge = input.nextDouble();
		
		System.out.print("İkinci Kenar Uzunluğunu Giriniz : ");
		
		secondEdge = input.nextDouble();
		
		System.out.print("Üçüncü Kenar Uzunluğunu Giriniz : ");
		
		thirdEdge = input.nextDouble();

		perimeter = firstEdge + secondEdge + thirdEdge ;
		
		perimeterSemi = perimeter / 2 ;
		
		area = Math.sqrt((perimeter/2)*(perimeterSemi - firstEdge)*(perimeterSemi - secondEdge)*(perimeterSemi - thirdEdge)); 
		 
		System.out.print("Üçgenin Alanı : " + area);
		
	}

}

