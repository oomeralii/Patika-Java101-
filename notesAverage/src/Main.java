//Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını 
//kulanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int math,physics,chemistry,turkish,history,music;
	
		Scanner note = new Scanner(System.in);
		
		System.out.println("Matematik Notunuzu Giriniz : ");

		math = note.nextInt();
		
		System.out.println("Fizik Notunuzu Giriniz : ");

		physics = note.nextInt();
		
		System.out.println("Kimya Notunuzu Giriniz : ");

		chemistry = note.nextInt();
		
		System.out.println("Türkçe Notunuzu Giriniz : ");

		turkish = note.nextInt();
		
		System.out.println("Tarih Notunuzu Giriniz : ");

		history = note.nextInt();
		
		System.out.println("Müzik Notunuzu Giriniz : ");

		music = note.nextInt();
		
		int sum = math + physics + chemistry + turkish + history + music;
		double avg = sum / 6.0;
		
		String result = (avg >= 60) ? " ( Geçtiniz. )" :  " ( Kaldınız. )" ;
		
		System.out.println("Ortalamanız " + avg + result);
		
	}

}