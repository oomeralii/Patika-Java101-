import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int j,k = 0, average = 0;
		;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayı Giriniz : ");
		
		j = input.nextInt();
		
		for (int i = 1; i <= j ; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				k++;
				average +=i;
			}
		}
		average = average / k;
		System.out.print(average);

	}

}


//0'dan girilen sayıya kadar 3-4'e tam bölünebilen sayıların ortalamasını bulma. 