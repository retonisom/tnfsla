package kh.oop1.day04.exam;

public class MethodExam {
	// 1. �Ű������� ����, ���� ���� ���� method
	// [����������] [�����] void �޼ҵ��(){}
	public void method() {
		System.out.println("�Ű������� ����, ���ϰ��� ���� ���");
	}

	// 2. �Ű������� �ְ�, ���� ���� ������
	// [����������] [�����] void �޼ҵ��(�Ű�����){}
	// �Ű����� ���� Ÿ���� �⺻�ڷ���, �迭, Ŭ����, ��������
	// �Ű������� ���� �������� �� �ִ�. ������ ( , ) �޸���
	
	public void method2(int x) {
		System.out.println("�Ű������� "+x+", ���ϰ��� ���� ���");
	}
	
	public void method2(int x, String s) {
		System.out.println("�Ű������� �Ѱ��̻��̰� ���ϰ��� ���� ��");
	}
	
	public void method2(int[] x, String[] s) {
		System.out.println("�Ű������� �迭�����̰� ���ϰ��� ���� ��");
	}
	
	// 3. �Ű������� ����, ���ϰ��� ���� ��
	// [����������] [�����] ��ȯ�� �޼ҵ��(){}
	public int method3() {  //������� int���·� ��ȯ�Ѵ�.
		System.out.println("�Ű������� ����, ���ϰ��� �������� ���");
		return 0;
	}
	
	// 4. �Ű������� �ְ�, ���ϰ��� ���� ��
	// [����������] [�����] ��ȯ�� �޼ҵ�� (�Ű�����){}
	public String method4(int x) {
		return "�Ű������� �ְ�, ���ϰ��� �ִ� ���";
	}
	
}
