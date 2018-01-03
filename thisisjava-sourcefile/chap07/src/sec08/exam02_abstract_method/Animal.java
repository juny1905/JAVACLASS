package sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound(); // 메소드의 모양만 선언해줌.
	public abstract void move();
}

