package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone(); //(x)

		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		TouchPhone notSmart = new TouchPhone("�賦��", 5);
		
		notSmart.turnOn();
		notSmart.scrSize();
		notSmart.turnOff();
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
