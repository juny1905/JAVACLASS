import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StkQue {
	public static void stackTest() {
		Stack<String> s = new Stack<String>();
		Scanner scn = new Scanner(System.in);
		String tmp;
		System.out.println("---- ���� �׽�Ʈ �Դϴ�. ----");
		while (true) {
			System.out.println("�Է��ϼ��� : ");
			tmp = scn.nextLine();
			if (tmp.isEmpty())
				break;
			s.push(tmp);
		}
		while (!s.isEmpty()) {
			System.out.printf("%s �Դϴ�.\n", s.pop());
		}
		scn.close();
	}

	public static void queueTest() {
		Queue<String> s = new LinkedList<String>();
		Scanner scn = new Scanner(System.in);
		String tmp;
		System.out.println("---- ť �׽�Ʈ �Դϴ�. ----");
		while (true) {
			System.out.println("�Է��ϼ��� : ");
			tmp = scn.nextLine();
			if (tmp.isEmpty())
				break;
			s.offer(tmp);
		}
		while (!s.isEmpty()) {
			System.out.printf("%s �Դϴ�.\n", s.poll());
		}
		scn.close();
	}

	public static void main(String[] args) {
		stackTest();
	}

}