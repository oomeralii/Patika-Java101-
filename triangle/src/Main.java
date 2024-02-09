import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Basamak Sayısını Giriniz : ");
		 int n = input.nextInt();
		
		for (int i = n; i > 0; i--) {
			for (int k = 0; k < ((2*i)-1) ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
