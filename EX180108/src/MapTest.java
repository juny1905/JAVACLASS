import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		Set<String> keySet = map.keySet();
		Set<Integer> intKeySet = intMap.keySet();
		map.put("Ryan", 90);
		map.put("Andrew", 72);
		map.put("Park", 36);
		map.put("Maria", 54);
		map.put("Choi", 12);

		intMap.put(1234, 4321);
		intMap.put(2345, 5432);
		intMap.put(3456, 6543);
		intMap.put(4567, 7654);
		intMap.put(5678, 8765);

		Iterator<Integer> intIterator = intKeySet.iterator();

		while (intIterator.hasNext()) {
			Integer key = intIterator.next();
			Integer Value = intMap.get(key);
			System.out.printf("%d �� ���� %d\n", key, Value);
		}

		System.out.println("�л� �� : " + map.size());

		Scanner s = new Scanner(System.in);

		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key); // Ű�κ��� ���� ã��.
			System.out.printf("%s �� ������ %d�� �Դϴ�.\n", key, value);
		}

		String tmp;
		while (!map.isEmpty()) {
			System.out.print("�л� �̸� �Է� : ");

			tmp = s.nextLine();
			if (!map.containsKey(tmp)) {
				System.out.printf("%s �л��� �����ϴ�.\n", tmp);
				break;
			} else {
				Integer score = map.get(tmp);
				map.remove(tmp);
				System.out.printf("%s �� ������ %d ��. (���� �л� %d ��)\n", tmp, score, map.size());
			}
		}
		map.clear();
		System.out.println("���α׷��� �����մϴ�.");
		s.close();
	}
}