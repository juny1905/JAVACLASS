import java.util.*;

class Member {
	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.printf("%s:%d세\n", name, age);
	}
	
	// 사용자 지정 타입에 대한 중복 삽입 방지.

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}

public class SetTest {
	public static void main(String[] args) {
		Set<Member> hashTest = new HashSet<Member>();
		Set<Member> treeTest = new TreeSet<Member>();

		hashTest.add(new Member("박준영", 25)); // 해쉬값에 의해 순서 바뀔 수 있음 그러나 무관(순서없이
												// 저장하는 타입)
		hashTest.add(new Member("김철철", 30));
		hashTest.add(new Member("홍할황", 60));
		hashTest.add(new Member("곽박밥", 90));
		hashTest.add(new Member("박준영", 25)); // 같은객체 존재 못함 - 무시됨(객체가 아닌 내부 데이터로
												// 판단)
		Iterator<Member> hashItr = hashTest.iterator();

		while (hashItr.hasNext()) { // 다음 객체가 존재하면 ?
			Member tmp = hashItr.next(); // 다음 객체의 내용을 읽음.
			tmp.showInfo();
		}

		hashTest.clear();
		if (hashTest.isEmpty()) {
			System.out.println();
			System.out.println("셋이 비어있음.");
		}
	}
}
