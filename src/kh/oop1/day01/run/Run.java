package kh.oop1.day01.run;

import kh.oop1.day01.exam.Pet;

public class Run {
	public static void main(String[] args) {
		Pet p = new Pet(); //  -> �Ű����� ����
		
		Pet p1 = new Pet("�ú������㽺Ű", "�̹�", 1);  //�Ű����� �ִ� �Լ�
		Pet p2 = new Pet("Ǫ��", "Ǫ��", 2);
		Pet p3 = new Pet("������", "�屺", 2);
	
		System.out.println("������ : "+p1.getPetType()+ " ���̸� :"+p1.getPetName() + " �곪�� : "+p1.getPetAge());
		System.out.println("������ : "+p2.getPetType()+ " ���̸� :"+p2.getPetName() + " �곪�� : "+p2.getPetAge());
		System.out.println("������ : "+p3.getPetType()+ " ���̸� :"+p3.getPetName() + " �곪�� : "+p3.getPetAge());
	}

}
