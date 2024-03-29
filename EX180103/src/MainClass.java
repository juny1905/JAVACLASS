
public class MainClass {
	public static void byAbs(Abstraction a) { // 추상 클래스를 매개변수로 받음.
		a.doYourself();
	}

	public static void giveYourself(Introdution a) { // 인터페이스 를 매개변수로 받음.
		a.printIntroduce();
	}

	public static void main(String[] args) {
		Implementation i = new Implementation();
		MySelf m = new MySelf();

		byAbs(i);
		byAbs(m);

		i.setName("Ryan");
		i.intro(); // Default method in interface
		m.setName("Parker");
		m.intro(); // Default method in interface
		giveYourself(i); // i is inherited from interface.
		giveYourself(m); // m is inherited from interface.
		
		DoSomething.doBasic();
		i.doIt();
		i.doThat();

		Introdution.about(); // Static method in interface and I references constant field of it.
	}

}
