package kh.oop1.day03.exam;

public class BlockExam {
	public static String name = "ȫ�浿";
	
	public BlockExam() {  //������  -> ������ ������ ����� �����ڸ��� Ŭ������� �Ȱ��� ����������ϸ�, �޼ҵ� ����� �����ϳ� ��ȯ���� ����.
		 
		System.out.println("������ ����");
	}
	
	//Ŭ���� Ȥ�� �ν��Ͻ� ��� �׽�Ʈ  
	int age =19;//����� �ʱⰪ
	static{  //Ŭ���� �ʱ�ȭ�� �ʱ⿡ ���α׷� ���������� ���� �ѹ��� �����  
		System.out.println("static block Ŭ���� ��");
		name = "�ڱ浿";
	}
	
	
	{ //�ν��Ͻ� ���
		System.out.println(age);
		System.out.println("�ν��Ͻ� ���1");
		this.age = 22; //�ν���Ʈ �ʱ�ȭ
		System.out.println(age);
	}

	
	{
		System.out.println("�ν��Ͻ� ���2");
	}

}
