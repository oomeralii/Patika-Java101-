import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1,n2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("n1 Sayısını Giriniz : ");
		n1 = input.nextInt();
		
		System.out.print("n2 Sayısını Giriniz : ");
		n2 = input.nextInt();

		int i = 1;
		int ebob = 1;
		
		while (i <= n1 || i <= n2 ) {
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
				
			}
			i++;
		}
		
		int ekok = (n1*n2)/ebob;
		
		System.out.println("EBOB(" + n1 + "," + n2 + "): " + ebob);
		System.out.print("EKOK(" + n1 + "," + n2 + "): " + ekok);
	}

}
