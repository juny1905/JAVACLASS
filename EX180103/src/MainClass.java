
public class MainClass {
	public static void byAbs(Abstraction a) { // �߻� Ŭ������ �Ű������� ����.
		a.doYourself();
	}

	public static void giveYourself(Introdution a) { // �������̽� �� �Ű������� ����.
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