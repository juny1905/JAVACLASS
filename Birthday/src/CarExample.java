
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

	public static void sum(int... args) { // Argument as a list.
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Car.help();
		Truck.help();

		Car tico = new Car("Tico", 3, 900, 10, 2);
		Car accent = new Car("Accent", 4, 1500, 14, 2);
		Car grand = new Car("Grandeur", 4, 2700, 19, 4);
		Car benz = new Car("Benz", 8, 5000, 20, 4);
		Car.sellCar(benz);
		Truck monster = new Truck("Monster", 16, 13000, 30, 6, 15000);
		Car porter = new Truck("Porter", 4, 2000, 15, 4, 1000);

		Car.getCarQuantity();

		performanceTest(tico);
		performanceTest(accent);
		performanceTest(grand);
		performanceTest(benz);
		performanceTest(monster);
		performanceTest(porter);

		sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100);
	}
}
