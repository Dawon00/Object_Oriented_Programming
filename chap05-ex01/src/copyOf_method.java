import java.util.Arrays;

public class copyOf_method {
	public static void main(String[] args) {

		int[] intArray = {2, 3, 1, 5, 10};   // �迭�� ����� ����
		
		System.out.print("intArray : ");
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " "); // �迭�� ����� ���� ���� ���
		
		int [] myArray = Arrays.copyOf(intArray, intArray.length);

		System.out.print("\n" + "myArray : ");
		for(int i=0; i<myArray.length; i++) //�迭�� ���̸�ŭ �ݺ�
			System.out.print(myArray[i] + " "); // �迭�� ����� ���� ���� ���
		
	}
}