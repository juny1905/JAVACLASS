public class ErrorCatch {
	
	public static void main(String[] args) {
		class A{
			String a;
			int b;
		}
		A a = new A();
		A b;
		A c = new A();
		b = a;
		System.out.println(Integer.toHexString(a.hashCode()));
		System.out.println(Integer.toHexString(b.hashCode()));
		System.out.println(c.toString());
		System.out.println(a.equals(b));
		System.out.println(b.equals(a));
		System.out.println(b.equals(c));
	}
}