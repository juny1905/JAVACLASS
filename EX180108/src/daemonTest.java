import java.util.Scanner;

class notifyTime extends Thread {
	private int t = 0;

	public void timeGoes(int e) {
		t += e;
		System.out.printf("%d 초 경과. 데몬 여부 : %s", t, this.isDaemon());
	}

	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.printf("메인 스레드에서 인터럽트 발생. %s 종료", this.getName());
				break;
			}
			timeGoes(5);
		}
	}
}

public class daemonTest {
	public static void main(String[] args) {
		notifyTime a = new notifyTime();
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		String groupName = group.getName();
		a.setDaemon(true); // 데몬 스레드는 주 스레드 종료시 함께 종료됨. 먼저 호출.
		a.start();

		Scanner s = new Scanner(System.in);
		Long tmp;
		long sum = 0;
		while (true) {
			System.out.print("아무 숫자나 입력하세요 (0 입력하면 종료.) : ");
			tmp = Long.parseLong(s.nextLine());
			if (tmp == 0) {
				a.interrupt();
				break;
			} else
				sum += tmp;
			System.out.printf("[%s] 누적된 값은 %d 입니다\n", groupName, sum);
		}
		System.out.printf("종료, 최종 값은 %d 입니다\n", sum);
		s.close();
	}

}
