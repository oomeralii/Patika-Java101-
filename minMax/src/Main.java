import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, min=0, max = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kaç tane sayı gireceksiniz : ");
		n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.print(i + ". sayıyı giriniz : ");
			int number = input.nextInt();
			
			if (number < min || min == 0) {
				if (number < min ) {
					min = number;
				}
			}
			if (number > max) {
				max = number;
			}
			
			if (number < 0 || max == 0 ) {
				max = number;
			}
		}
		
		System.out.println("En büyük sayı: " + max);
		System.out.print("En küçük sayı: " + min);

	}

}
