package sec08.exam02_abstract_method;

public class Dog extends Animal {
	public Dog() {
		this.kind = "������";
	}

	@Override
	public void sound() {
		System.out.println("�۸�");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}
}