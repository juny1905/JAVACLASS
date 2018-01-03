import ext1.*;

interface Study {
	void live(int time);

	String getInfo();
}

interface Lecture extends Study {
	void doLecture(String subject);
}

class Person implements Study {
	private Car myCar;
	protected int estimated_Time;
	protected int age;
	protected String name;
	private static int population = 0;
	public static void howManyPeople(){
		if(population == 0)
		{
			System.out.println("Empty world.");
		}
		else if(population == 1)
		{
			System.out.println("There's a person in this world.");
		}
		else
		{
			System.out.println("There're " + population + " people in this world.");
		}
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		population++;
	}

	public void live(int time) {
		this.estimated_Time += time;
	}
	public void buyCar(String name, String color, int cc){
		myCar = new Car(name,color,cc);
	}
	public void carInfo(){
		myCar.carInfo();
	}
	public String getInfo() {
		String tmp = name + ", " + age + "��, " + estimated_Time + "�� ����.";
		return tmp;
	}
}

class Student extends Person {
	private int grade;
	private String school;

	public Student(int age, String name, int grade, String school) {
		super(age, name);
		this.grade = grade;
		this.school = school;
	}

	@Override
	public String getInfo() {
		String tmp = super.getInfo() + "\n" + school + "�б� " + grade + "�г� ������.";
		return tmp;
	}
}

class Teacher extends Person implements Lecture {
	private String subject;
	private String school;

	public Teacher(int age, String name, String subject, String school) {
		super(age, name);
		this.subject = subject;
		this.school = school;
	}

	@Override
	public void doLecture(String subject) {
		super.live(5000);
		System.out.println(subject + " ���� ���Ǹ� �մϴ�.");
	}
	@Override
	public String getInfo() {
		String tmp = super.getInfo() + "\n" + school + "�б� " + subject + " ������.";
		return tmp;
	}
}

public class Chap6 {
	public static void getInfo(Study s) {
		System.out.println(s.getInfo());
	}

	public static void main(String[] args) {
		Person Baek = new Person(19, "����");
		Student Kim = new Student(16, "��޽�", 9, "�ߣO��");
		Teacher Park = new Teacher(26, "�ڱ���", "��������", "�ߣO��");

		Baek.live(3000);
		Kim.live(1500);
		Park.live(9000);

		getInfo(Baek);
		getInfo(Kim);
		getInfo(Park);

		Park.doLecture("��������");
		getInfo(Park);
		Park.buyCar("����", "����", 5000);
		Park.carInfo();
		
		Person.howManyPeople();
	}

}