package Diamondprogram;

public class Test implements First, Second {
	
	public void show() {
		First.super.show();
		Second.super.show();
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.show();

	}
}
