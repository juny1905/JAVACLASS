
public abstract class Abstraction { // 키워드는 abstract
	protected String name;
	
	Abstraction(){ // 추상 클래스는 생성자 필수
		System.out.println("추상 클래스를 상속받았음.");
	}
	
	public abstract void doYourself(); // 추상 메소드

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
