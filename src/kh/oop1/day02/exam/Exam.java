package kh.oop1.day02.exam;

// ����� Ŭ���� : Ŭ���� �ȿ� main �޼ҵ尡 �����Ͽ� �����ϴ� Ŭ����
// ������� Ŭ���� : Ŭ�����ȿ� �޼ҵ带 �߰��Ͽ� �ʿ��� ����� �����Ǿ� �ִ� Ŭ����
public class Exam {
	// ����(�Ӽ��� ����)
	// [����������] [�����] �ڷ��� ������ ;
	// ���������� : public protected, (default), private
	// ����� : static finali
	private static int age;
	public static String name;
	
	// ������
	public Exam() {}
	
	//�޼ҵ� (������� ����)
	//[����������] ��ȥ�� �޼ҵ��(�Ű�����) {�������}
	//1. �Ű������� ���� �޼ҵ�
	public void printName() {
		System.out.println(cm.str1); // �޼��念�������� ����
		//  ������� 
	}
	
	//2. �Ű������� �ִ� �޼ҵ�
	public void printAge(int age){
	
	}
	
	CoffeeMachine cm = new CoffeeMachine();
	
	{ //�ʱ�ȭ �� �ȿ��� ��밡���� (�ʵ念���� �ƴ� �޼��� �������� ȣ���ؾ���)
		System.out.println(cm.str1);
	}
	
}



