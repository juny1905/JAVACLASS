
public abstract class Abstraction { // Ű����� abstract
	protected String name;
	
	Abstraction(){ // �߻� Ŭ������ ������ �ʼ�
		System.out.println("�߻� Ŭ������ ��ӹ޾���.");
	}
	
	public abstract void doYourself(); // �߻� �޼ҵ�

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}