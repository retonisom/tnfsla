package kh.oop1.day03.run;
import kh.oop1.day03.exam.BasicVariable;
import kh.oop1.day03.exam.BlockExam;
import kh.oop1.day03.exam.FieldExam;
import kh.oop1.day03.exam.ThisConstructor;

public class Run {

	public static void main(String[] args) {
	/*	// Ŭ���� ������ ����� �� Ŭ�������� ���ְ� 
		// Ŭ������ �ڿ� .�� �Է��� �ش� Ŭ���� ���� Ŭ���� ���� Ȥ�� �޼ҵ带 ����� �� �ִ�.
		System.out.println(FieldExam.var1);
		System.out.println(FieldExam.method1()); //static�� ����� �͵��� �ٷ� ����� ������
		
		
		// ��������� ��ü�� �����ؼ� �޸� heap������ ������ �Ŀ� ������ �����ϴ�.
		// ��ü�� ������ �Ŀ� ������ �޼ҵ忡 ������ �� �� �ִ�.
		
		FieldExam fe = new FieldExam(); //��ü����
		System.out.println(fe.var2);
		System.out.println(fe.method());
		
		*/
		
		/*BlockExam be = new BlockExam();
		System.out.println(be.name);
		*/
		
		//JVM���� �⺻�� Ȯ��
	/*	System.out.println("Bool : "+BasicVariable.bool);
		System.out.println("Byte : "+BasicVariable.by);
		System.out.println("Ch : "+BasicVariable.ch);   // \u000000 �� �������� ó����
		System.out.println("Double : "+BasicVariable.d);
		System.out.println("Float : "+BasicVariable.f);
		System.out.println("Int : "+BasicVariable.i);
		System.out.println("Long : "+BasicVariable.l);
		System.out.println("Short : "+BasicVariable.sh);
		System.out.println("String : "+BasicVariable.str);
		*/
		
		ThisConstructor tc = new ThisConstructor("��ü",1000,1);
		System.out.println("å�̸� : "+tc.getBookName()+" å���� : "+tc.getBookPrise() + " ���ǻ� : "+tc.getBookPublisher()+" åID : "+tc.getBookID());
		//���ǻ翡 KH������������ �Էµ�
	}

}
