
public class Person {
	public int height;
	public String name;
	public String eye_color;
	public String hair_color;
	public int age;
	// Constructor
	public Person(int height, String name, String eye_color, String hair_color, int age) {
		// converting local arguments to global variables
		this.height = height;
		this.name = name;
		this.eye_color = eye_color;
		this.hair_color = hair_color;
		this.age = age;

	}
	public int birthDay() {
		age+=1;
		return age;

	}
	// Average American
	public static void main(String[] args) {
		Person Jennifer = new Person(162, "Jennifer", "brown", "brown", 38);
		System.out.println(Jennifer.birthDay());

	}
}
