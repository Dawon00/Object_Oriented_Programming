public class 배열복사 {
	public static void main(String[] args) {

		int[] intArray = {2, 3, 1, 5, 10};   // 배열의 선언과 생성
		
		System.out.print("intArray : ");
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " "); // 배열에 저장된 정수 값을 출력
		
		int[] myArray = new int[intArray.length];   // 배열의 선언과 생성
		
		for (int i = 0; i < intArray.length; i++)     // 배열의 모든 요소를 복사
		     myArray[i] = intArray[i];

		System.out.print("\n" + "myArray : ");
		for(int i=0; i<myArray.length; i++)
			System.out.print(myArray[i] + " "); // 배열에 저장된 정수 값을 출력
		
	}
}