import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n,r,nr = 1,nfac = 1,rfac = 1,nrfac = 1;
		double combination = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Küme Kaç Elemanlı (N) ? ");
		n = input.nextInt();
		
		System.out.print("Oluşturulacak Alt Küme Kaç Elemanlı (r) ? ");
		r = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			nfac = nfac*i;
		}
		
		for (int j = 1; j <= r; j++) {
			rfac =  rfac*j;
		}
		
		for (int k = 1; k <= (n-r); k++) {
			nr = nr*k;
		}
		
		combination = nfac / (rfac * nr);
		
		System.out.print("C(" + n + "," +  r + ") : " + combination);
	}

}

/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)

*/