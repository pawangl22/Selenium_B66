package day22.feb04;

class A {
	// declaration
	private int i;

	// initialization
	A() {
		i = 10;
	}

	// utilization
	int getValue() {
		return i;
	}

}

public class Demo3 {

	public static void main(String[] args) {
		A a1 = new A();
		int v = a1.getValue();
		System.out.println(v);
	}
}
