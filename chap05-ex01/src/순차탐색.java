import java.util.Scanner;

public class ����Ž�� {
    public static void main(String[] args) {
	     int s[] = { 8, 30, 1, 9, 40, 11, 60, 19, 3, 17, 27 };
	     int value, index = -1;

	     Scanner scan = new Scanner(System.in);
	     System.out.print("Ž���� ���� �Է��Ͻÿ�: ");
	     value = scan.nextInt();

	     for (int i = 0; i < s.length; i++) {
		      if (s[i] == value)
			        index = i;
	     }

	     if (index < s.length && index >= 0)
		       System.out.println("" + value + "���� " + index + "��ġ�� �ֽ��ϴ�.");
	     else
	    	   System.out.println("" + value + " ���� ã�� ���Ͽ����ϴ�.");  
	     scan.close();
     }
}