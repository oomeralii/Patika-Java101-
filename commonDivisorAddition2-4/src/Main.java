import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sum =0 , data ;
		boolean situation = true;
		
		Scanner input = new Scanner(System.in);
		
		
		
		while (situation) {
			System.out.print("Lütfen Bir Çift Sayı Giriniz ! ");
			data = input.nextInt();
			if (data % 2 == 1) {
				situation = false;
				System.out.println("Tek Sayı Girdiniz ! ");
			}
			if (data % 4 == 0 ) {
				sum +=data ;
			}
							
		}
		System.out.print("Toplam : " + sum);
	}

}
