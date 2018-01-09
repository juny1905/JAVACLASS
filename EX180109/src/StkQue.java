import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StkQue {
	public static void stackTest() {
		Stack<String> s = new Stack<String>();
		Scanner scn = new Scanner(System.in);
		String tmp;
		System.out.println("---- 스택 테스트 입니다. ----");
		while (true) {
			System.out.println("입력하세요 : ");
			tmp = scn.nextLine();
			if (tmp.isEmpty())
				break;
			s.push(tmp);
		}
		while (!s.isEmpty()) {
			System.out.printf("%s 입니다.\n", s.pop());
		}
		scn.close();
	}

	public static void queueTest() {
		Queue<String> s = new LinkedList<String>();
		Scanner scn = new Scanner(System.in);
		String tmp;
		System.out.println("---- 큐 테스트 입니다. ----");
		while (true) {
			System.out.println("입력하세요 : ");
			tmp = scn.nextLine();
			if (tmp.isEmpty())
				break;
			s.offer(tmp);
		}
		while (!s.isEmpty()) {
			System.out.printf("%s 입니다.\n", s.poll());
		}
		scn.close();
	}

	public static void main(String[] args) {
		stackTest();
	}

}
