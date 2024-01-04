import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int heat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hava Sıcaklığını Giriniz : ");
		heat = input.nextInt();
		
		if (heat >= 5) {
			if (heat < 15) {
				System.out.print("Sinemaya Gidebilirsiniz.");
			}if (heat > 25) {
				System.out.print("Yüzmeye Gidebilirsiniz.");
			}if(heat > 14 && heat < 26) {
				System.out.print("Pikniğe Gidebilirsiniz.");
			}
		}else {
			System.out.print("Kayak Yapabilirsiniz.");
		}
	}

}
