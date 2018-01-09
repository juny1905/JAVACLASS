import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class Test {
	private String ID;
	private String PW;
	private int age;
	private String City;
	public Test(String ID, String PW, int age, String City) {
		this.ID = ID;
		this.PW = PW;
		this.age = age;
		this.City = City;
	}

	public void showInfo() {
		System.out.printf("ID : %s , PW : %s , AGE : %d, City : %s\n", ID, PW, age, City);
	}
}

public class LinkedListTest {
	public static void main(String[] args) {
		// <E> �� Type Parameter. ���ϴ� Ÿ�� ����.
		List<String> arr = new Vector<String>(); // ���� ����Ʈ (ArrayList, Thread-Safe (Allows only a thread at the time.)
		List<String> seq = new LinkedList<String>(); // ���� ����Ʈ (����� ����/���� �߻��� ȿ����.)
		List<Integer> nums = Arrays.asList(3, 12, 7, 5, 9, 2, 33); // Wrapper Class �� ����.
		List<Test> test = new LinkedList<Test>();
		// �� ����Ʈ�� ��� ����� �Ȱ���.
		for (Integer n : nums) {
			System.out.println(n);
		}
		arr.add("Good Bye, ");
		arr.add("Friend !");
		seq.add("Hello, ");
		seq.add("World !");

		System.out.println(seq.contains("Hello, ")); // ��ü ���� ���� Ȯ��.
		System.out.println(seq.size()); // ��ü�� �� ��ȯ.
		System.out.print(seq.get(0)); // Ư�� �ε����� ��ü�� ����.
		System.out.println(seq.get(1));
		System.out.print(arr.get(0));
		System.out.println(arr.get(1));

		test.add(new Test("Ryan", "ASDF1234", 25, "Ansan"));
		test.add(new Test("Peter", "fghj1234", 36, "Los Angeles"));
		test.add(new Test("Hello", "a2gb1234", 100, "Mars"));
		test.add(new Test("Grauy", "GGGfffGG", 0, "Tokyo"));
		test.remove(1); // Peter ����, Hello �� 1�� �����.
		System.out.println(test.size()); // ��ü�� �� ��ȯ.
		for (Test t : test) {
			t.showInfo();
		}
	}
}