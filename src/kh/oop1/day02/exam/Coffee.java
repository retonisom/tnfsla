package kh.oop1.day02.exam;

public class Coffee {  // Ŭ���� ���ο� Ŭ������ �ϳ� �� ���鶧�� ���������ڸ� public���� �� �� ����. (public �� �ٸ� ��Ű�������� ���� ����)
	//Ŀ���Ǹ���
	//1. �޴����� Hot, Ice �Ƹ�
	//2. �ֹ�����
	//[�Ӽ���]
	//private String hotAmericano; //
	//private String IceAmericano;
	
	private String americano;
	private char tempratureType;  // Y: hot , N : Ice
	private String size;
	
	// [������]
	public Coffee() {}
	
	//getter
	public String getAmericano() {
		return americano;
	}
	
	public char getTempraturType() {
		return tempratureType;
	}
	
	public String getSize() {
		return size;
	}
	
	//setter
	public void setAmericano(String americano) {
		this.americano = americano;
	}
	
	public void setTempraturType(char tempratureType) {
		this.tempratureType = tempratureType;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	
	// [�������]
	public void orderCoffee() {
		System.out.println("Ŀ�� �ֹ�");
		
	}
	
}

/*public class CoffeeMachine {
	
}*/  // ��� �Ұ�
class CoffeeMachine{  // ����Ʈ�� ����ؾ��� ==> ����Ʈ�� �ٸ� ��Ű������ ������ �Ұ�����
	public String str1;
	
	public void machine() {
		
		
	}
}

