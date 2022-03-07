package oopconcepts;

public class Encapsulation {

	public static void main(String[] args) {
		Encap obj = new Encap();
		obj.setName("Navi");
		obj.setAge(22);
		obj.setRoll(29);
		System.out.println("My name: " + obj.getName());
		System.out.println("My age: " + obj.getAge());
		System.out.println("My roll: " + obj.getRoll());

	}

}

class Encap {
	private String Name;
	private int Roll;
	private int Age;

	public int getAge() {
		return Age;
	}

	public String getName() {
		return Name;
	}

	public int getRoll() {
		return Roll;
	}

	public void setAge(int newAge) {
		Age = newAge;
	}

	public void setName(String newName) {
		Name = newName;
	}

	public void setRoll(int newRoll) {
		Roll = newRoll;
	}
}


