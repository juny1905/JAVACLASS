package sec03.exam01_name_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(30);
		rc.turnOff();
	}
}
