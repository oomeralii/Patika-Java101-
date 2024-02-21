public class Main {

	public static void main(String[] args) {
		int number,result = 0 , state = 0;
		
		for(number = 2 ; number <= 100 ; number++) {
			state = 0;
			for (int i = 2; i < number; i++) {
					result = number % i;
					if (result == 0) {
						state ++;
					}
					
				}
			if(state == 0) {
				System.out.print(number + " ");
			}
		
		}
	}
}
