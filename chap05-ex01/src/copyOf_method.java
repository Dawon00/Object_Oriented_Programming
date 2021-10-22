import java.util.Arrays;

public class copyOf_method {
	public static void main(String[] args) {

		int[] intArray = {2, 3, 1, 5, 10};   // 배열의 선언과 생성
		
		System.out.print("intArray : ");
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " "); // 배열에 저장된 정수 값을 출력
		
		int [] myArray = Arrays.copyOf(intArray, intArray.length);

		System.out.print("\n" + "myArray : ");
		for(int i=0; i<myArray.length; i++) //배열의 길이만큼 반복
			System.out.print(myArray[i] + " "); // 배열에 저장된 정수 값을 출력
		
	}
}