package kh.oop1.day03.exam;

public class ThisConstructor {
	
	// this ��? ��� �ν��Ͻ��� �޼ҵ忡 ������ ä �����ϴ� ���۷�����, �Ҵ�� ��ü�� ����Ű�� �Լ� ����� ���޵Ǵ� ��ü�� [�ּ�]�� �ڵ����� ����
	// �Ű������� ������ �����ڿ��� �Ű����� ���� �ʵ��� ���� ��� ���
	// this()��? ������, ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���, �ݵ�� [ù��° ��]�� �����ؾ���
	
	// ���ǻ� ���α׷�
	// å�̸�
	private String bookName;
	// å����
	private int bookPrise;
	// ���ǻ�
	private String bookPublisher;
	// åID
	private int bookID;
	
	public ThisConstructor() {
		System.out.println("�⺻�������Դϴ�.");
	}
	
	public ThisConstructor(String bookPublisher) {
		this.bookPublisher = bookPublisher;
		System.out.println("�Ű������� �ϳ��� ������");
	}
	
	public ThisConstructor(String bookName, int bookPrise, int bookID) {
		this("KH����������"); //�Ű������� �ϳ��ִ� ���� ȣ���� //���ǻ翡 KH������������ �Էµ� // ������ ù��° �ٿ� �־����
		this.bookName = bookName;
		this.bookPrise = bookPrise;
		this.bookID = bookID;
	}
	
	//getter
	public String getBookName() {
		return bookName;
	}
	public int getBookPrise() {
		return bookPrise;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public int getBookID() {
		return bookID;
	}
	
	
	
	

}
