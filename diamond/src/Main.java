import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.print("Bir Sayı Giriniz : ");
	        int n = input.nextInt();

	        for (int i = 1 ; i <= n ; i++) {
	        	for (int j = 1; j <= (n-i); j++) {
					System.out.print(" ");
				}
	        	for (int k = 1; k <= ((2*i)-1) ; k++) {
	        		System.out.print("*");
				}
	        	System.out.println();
	        }
	        for (int m = 0 ; m < n ; m++) {
	        	for (int j = 0; j <= m ; j++) {
					System.out.print(" ");
				}
	        	for (int k = n; k - 1 > m ;k--) {
	        		System.out.print("*");
				}
	        	for (int k = n - 2; k > m ;k--) {
	        		System.out.print("*");
				}
	        	System.out.println();
	        }
	}    
}
