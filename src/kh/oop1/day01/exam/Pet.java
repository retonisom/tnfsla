package kh.oop1.day01.exam;

public class Pet {
	// ���� ��
	private String petType;
	//public static String petType ���� �����Ѵٸ� �����Ҷ� ����ƽ ������ �ö�(Ŭ��������) --> �������� ����� Type ���� ��� Type�� �����
	// ���� �̸�
	private String petName;
	// ���� ����
	private int petAge;
	
	
	//������
	public Pet() {
		
	}
	
	
	//�Ű������� �ִ� ������
	public Pet(String petType, String petName, int petAge) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
	}
	
	
	
	// private�� ����Ǿ� �ִ� �� �ٲٰ�ʹٸ� getter �� setter �� ����ؾ��� (ĸ��ȭ)
	//getter ���� �������� ���
	public String getPetType() {
		return petType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	//setter ���� �ٲٴ� ���
	public void setPetType(String petType) {
		this.petType = petType;
		
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public void setPetage(int petAge) {
		this.petAge = petAge;
	}
	
}
