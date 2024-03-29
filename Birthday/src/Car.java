
public class Car implements Motion {
	private static int carCount;
	private int speed;
	private String name;
	private Engine e;
	private Tire t;

	public static void help() {
		System.out.println("To use : Car(차종, 실린더 수, 배기량, 휠 직경, 구동륜 수)");
	}

	public static void sellCar(Car c){
		carCount--;
		System.out.println(c.name + "을 팔았습니다.");
		c = null;
		System.gc();
	}

	public Car(String name, int c, int cc, int r, int n) {
		carCount++;
		this.name = name;
		this.speed = 0;
		e = new Engine(c, cc);
		t = new Tire(r, n);
	}

	public static void getCarQuantity() {
		System.out.printf(">> 차량 %d 대 보유중\n", carCount);
	}

	public void carInfo() {
		System.out.printf("-----[%s 의 성능]-----\n", this.name);
		System.out.printf("%d[cc], %d기통, %d륜 구동, %d 인치 휠\n", e.liter, e.cylinder, t.n_tires, t.radius);
	}

	@Override
	public void Accelate() {
		// TODO Auto-generated method stub
		this.speed += this.e.liter / 250;
		System.out.printf("%d 만큼 가속하여 현재 %d[km]\n", this.e.liter / 250, this.speed);
	}

	@Override
	public void Brake() {
		// TODO Auto-generated method stub
		this.speed -= this.e.liter / 250;
		System.out.printf("%d 만큼 감속하여 현재 %d[km]\n", this.e.liter / 250, this.speed);
	}

	@Override
	public void turn(int angle) {
		// TODO Auto-generated method stub
		System.out.printf("%d 의 속도로 %d 회전\n", this.speed, angle);
	}
}
