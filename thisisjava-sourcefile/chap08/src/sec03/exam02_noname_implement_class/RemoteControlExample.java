package sec03.exam02_noname_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() { // 인터페이스를 익명 구현
			public void turnOn() {
				System.out.println("익명 온");
			}

			public void turnOff() {
				System.out.println("익명 오프");
			}

			public void setVolume(int volume) {
				System.out.println("익명 볼륨 : " + volume);
			}
		};
		RemoteControl.changeBattery(); // 인터페이스의 정적 메소드
		rc.turnOn();
		rc.setMute(false);
		rc.setVolume(55);
		rc.turnOff();
	}
}
