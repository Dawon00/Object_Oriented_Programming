public class 주사위빈도수 {

public static void main(String[] args) {

	final int SIZE = 6;
	int freq[] = new int[SIZE];

	for (int i = 0; i < 10000; i++)
		++freq[(int) (Math.random() * SIZE)];      //    (0.0 ~ 1.0 이하의 값) * 6  

	System.out.println("====================");
	System.out.println("면빈도");
	System.out.println("====================");

	for (int i = 0; i < SIZE; i++)
		System.out.println("" + (i + 1) + "\t" + freq[i]);
    }
}