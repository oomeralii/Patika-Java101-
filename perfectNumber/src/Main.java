import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number,sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayıyı Giriniz : ");
		number = input.nextInt();
		
		for (int i = 1; i < number ; i++) {
			
			if (number % i == 0) {
				sum += i;
			}
		}
		
		if (sum == number && number != 1) {
			System.out.print(number +  " Mükemmel sayıdır.");
		}else {
			System.out.print(number +  " Mükemmel sayı değildir.");
		}
		
	}

}
