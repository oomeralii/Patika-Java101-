import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number,n,j = 1, sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayı Giriniz : ");
		number = input.nextInt();
		
		for (int i = 0; j > 0; i++) {
			n = number % 10;
			sum +=n;
			
			if ( number < 10) {
				j = -1;
			}				
			number = (number - n)/10;			
		}
		System.out.print("Girilen Sayının Rakamlarının Toplamı : " + sum);
	}

}
