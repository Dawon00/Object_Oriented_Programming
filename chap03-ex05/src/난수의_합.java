import java.util.Random;
import java.util.Scanner;

public class 난수의_합 {
	public static void main(String args[]) {

		Random generator = new Random();

		System.out.print("난수의 개수: ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int sum = 0;

		for (int i = 0; i < count; i++) {
			int number = generator.nextInt(100);
			System.out.println("난수의 값은 " + number);
			sum += number;
		}
		System.out.print("난수 " + count + "개의 합은 " + sum);
      scan.close();
	}
}