
public interface Introdution {
	double PI = 3.141592;
	void printIntroduce();
	default void intro(){
		System.out.println("�⺻ �Ұ� �Դϴ�");
	}
	static void about(){
		System.out.println("���̴� " + PI + " �Դϴ�.");
	}
}