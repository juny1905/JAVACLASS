
public class CarExample {
	public static void getDyno(Motion a) {

		for (int t = 1; t <= 30; t++) {
			if (t % 15 == 0)
				a.Accelate();

		}
		for (int t = 1; t <= 10; t++) {
			if (t % 10 == 0)
				a.Brake();
		}
		for (int i = -180; i <= 180; i += 90) {
			a.turn(i);
		}
	}

	public static void performanceTest(Car c) {
		c.carInfo();
		getDyno(c);
	}

	public static void main(String[] args) {
		Car.help();
		Truck.help();
		
		Car tico = new Car("Tico", 3, 900, 10, 2);
		Car accent = new Car("Accent", 4, 1500, 14, 2);
		Car grand = new Car("Grandeur", 4, 2700, 19, 4);
		Car benz = new Car("Benz", 8, 5000, 20, 4);
		Truck monster = new Truck("Monster", 16, 13000, 30, 6, 15000);
		
		performanceTest(tico);
		performanceTest(accent);
		performanceTest(grand);
		performanceTest(benz);
		performanceTest(monster);
	}
}
