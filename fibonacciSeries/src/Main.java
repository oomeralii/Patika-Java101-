import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int  s,sum = 0,n1 = 0, n2 = 1;
		 
		 System.out.print("Fibonacci serisinin eleman sayısını giriniz :  ");
		 Scanner input = new Scanner(System.in);
		 s = input.nextInt();
		 
		 System.out.print("0 1");
		 
		 for (int i = 1; i < s; i++) {
			 sum = n1 + n2;
			 n1 = n2;
			 n2=sum;
			 System.out.print(" " + sum);
		}

	}

}
