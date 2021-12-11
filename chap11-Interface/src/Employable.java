interface Employable {
	String getName();

	static boolean isEmpty(String str) {
		if (str == null || str.trim().length() == 0) {
			return true;
		} else {
			return false;
	        }
	}
}

class Employee implements Employable {
	private String name;

	public Employee(String name) {
	         if (Employable.isEmpty(name) == true) {
			  throw new RuntimeException("�̸��� �ݵ�� �Է��Ͽ��� ��!");
	         }
	         this.name = name;
	}

	@Override
	public String getName() {
	         return this.name;
	}
}