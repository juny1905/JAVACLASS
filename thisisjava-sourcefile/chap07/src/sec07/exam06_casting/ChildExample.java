package sec07.exam06_casting;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child(); // Parent type 으로 자동 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data2";  //(불가능) -> Parent 캐스팅 된 상태에서 Child 멤버 접근 불가.
		parent.method3();         //(불가능)
		*/
		
		Child child = (Child) parent;
		child.field2 = "yyy";  //(가능) -> 다시 Child 로 캐스팅 된 상태에서 Child 멤버 접근 가능
		child.method3();     //(가능)
	}
}
