package day23.feb06;

class Q {
	int i = 0;

	int test() {
		return i;
	}
}

class P extends Q {
	int i = 10;
}

class A extends P {
	int i = 20;

	A(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		System.out.println(test());
	}
}

public class Demo3 {

	public static void main(String[] args) {
		A a1 = new A(123);

	}

}
