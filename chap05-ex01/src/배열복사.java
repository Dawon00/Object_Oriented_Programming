public class �迭���� {
	public static void main(String[] args) {

		int[] intArray = {2, 3, 1, 5, 10};   // �迭�� ����� ����
		
		System.out.print("intArray : ");
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " "); // �迭�� ����� ���� ���� ���
		
		int[] myArray = new int[intArray.length];   // �迭�� ����� ����
		
		for (int i = 0; i < intArray.length; i++)     // �迭�� ��� ��Ҹ� ����
		     myArray[i] = intArray[i];

		System.out.print("\n" + "myArray : ");
		for(int i=0; i<myArray.length; i++)
			System.out.print(myArray[i] + " "); // �迭�� ����� ���� ���� ���
		
	}
}