class PartialSum2 extends Thread {

	private long sum = 0;
	private static long total_sum = 0;
	private long start;
	private long end;

	public PartialSum2(long start, long end) {
		this.start = start;
		this.end = end;
	}

	public static long[] getDivision(long target, int partition) {
		long division[] = new long[partition + 1];
		long area = target / partition;
		for (int i = 0; i < partition + 1; i++) {
			division[i] = area * i;
			// System.out.printf("division[%d] = %d\n", i, division[i]);
		}
		return division;
	}

	public long getSum() {
		return sum;
	}

	public void run() {
		for (long i = this.start + 1; i <= this.end; i++) {
			sum += i;
		}
		total_sum += sum;
		System.out.printf("[%s] %d 부터 %d 까지 더해서 %d.\n", this.getName(), this.start + 1, this.end, this.sum);
	}
}

public class Test2 {
	public static void main(String[] args) {
		final int n_threads = 8;
		final long target = 2000000000;

		long[] division = PartialSum.getDivision(target, n_threads);
		long sum = 0;

		long s_time = 0;
		long e_time = 0;

		System.out.printf("%d 을 %d 스레드로 나누어 더합니다.\n", target, n_threads);
		PartialSum[] s = new PartialSum[division.length - 1];

		s_time = System.currentTimeMillis();

		for (int i = 0; i < division.length - 1; i++) {
			s[i] = new PartialSum(division[i], division[i + 1]);
			s[i].start();
		}

		for (int i = 0; i < division.length - 1; i++) {
			try {
				s[i].join();
				sum += s[i].getSum();
			} catch (InterruptedException e) {
				System.out.println("Thread had been interrupted.");
			}
		}

		e_time = System.currentTimeMillis();
		System.out.println("총 합 : " + sum);
		System.out.println("소요 시간 : " + (e_time - s_time) + "[ms]" + " ... in " + n_threads + " Threads");
		System.out.println("스레드 당 약 " + ((double) (e_time - s_time) / n_threads) + "[ms] 소요.");

	}

}
