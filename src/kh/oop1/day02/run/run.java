package kh.oop1.day02.run;  // ��Ű�� ���� �Ѱ����� ���� �̸����� ��Ű���� �ٸ� ��Ű������ ����� �� ����

import kh.oop1.day02.exam.Coffee; //����� Ŭ������ ���� ��Ű���� �����ϴµ� ����Ѵ�. kava.lang �� �ڵ������� ���α׷��� ���ԵǱ⶧���� �������� �ʾƵ� ����� �����ϴ�. (string Object System.����� ����)
//import java.util.*�� ����ϸ� util���� ��� Ŭ������ ��밡����.
import kh.oop1.day02.exam.*; //��밡��

 
public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee c = new Coffee();
		ImportExam ie = new ImportExam();
		//CoffeeMachine cm = new CoffeeMachine(); �Ұ��� (����Ʈ Ŭ�����̱� ������)
		
		
		
		System.out.println(ie.piExam());
		System.out.println(ie.randomExam(5));
		System.out.println(ie.sortExam());
	}

}
