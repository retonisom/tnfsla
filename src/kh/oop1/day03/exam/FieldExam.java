package kh.oop1.day03.exam;

public class FieldExam {
	// [����������(public private default)]  [����� (static final)] �ڷ��� ������ [=�ʱⰪ];
	// Ŭ���� ����(��� ��ü�� ���������� �Ӽ��� ���� �� ����ϰ� ������ �� �޸𸮿����� ���� ������ �Ǳ� ������ �� �ʿ��� �������� �Ӽ��� ���� ������ ����ؾ��Ѵ�
	public static int var1; //(Ŭ���� ����)
	
	// ������� (�ν��Ͻ�����)
	// ������ ��ü(�ν��Ͻ�)���� �������� �Ӽ��� �������� �� �������(=�ν��Ͻ� ����)�� ����ϰ� �ȴ�. (����� x)
	public int var2;
	private int var3; //ĸ��ȭ�� ��Ģ���� private ���   ++           get, set ����ؾ���.
	int var4;  //���������� ������ default ���������ڷ� ���   ++          �ٸ� ��Ű������ ���� �ȵ�
	
	// ������
	public FieldExam() {
		String var5="������ ��������"; //�������� (�޼��� �ȿ� ������ ����)
		System.out.println(var5);
	}
	
	//  �ʱ�ȭ�� 
	{
		String var6 = "�ʱ�ȭ �� ����"; //�� ó�� ��������
		System.out.println(var6);
	}
	
	// �޼ҵ� ���������� ��������
	public String method() { //��������
		String var7="�޼ҵ� ���� ��������";
		return var7;
	}
	
	public static String method1() {
		String var8 = "static ���� ��������";
		return var8;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
