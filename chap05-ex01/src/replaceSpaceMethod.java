
public class replaceSpaceMethod {
	static void replaceSpace(char a[]) {
		for(int i =0; i<a.length; i++)
			if(a[i]==' ')
				a[i] = '_';
	}
	static void printCharArray(char a[]) {
		for (int i=0; i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
	}
	public static void main (String args[]) {
		char c[]= {'T','h','i','s',' '	};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);}
}
