package kh.oop1.day03.exam;

public class OverloadingExam {
	// �����ε� ����
	// 1. �޼ҵ��� �̸��� �����ؾ��Ѵ�
	int intI;
	String strS;
	
	public void method() {
		
	}
	
	public void method(int intI) {
		
	}
	
	// 2. �Ű����� Ÿ���� �޶���Ѵ�.
	public void method(String strS) {
		
	}
	
	// 3. �Ű������� ������ �޶���Ѵ�.
	public void method(int intI, String strS) {
		
	}
	
	// 4. [����] �Ű������� ��ġ�� �޶� �ٸ� �޼ҵ�� �ν���
	public void method(String strS, int intI) { //����		
		
	}
	
	
}
