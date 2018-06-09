package sheet5.task4;

class CallEg {
	void methodA() throws ArithmeticException {
		try {
			methodB();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}
	}

	void methodB() throws ArithmeticException {
		try {
			methodC();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}
	}

	void methodC() throws ArithmeticException {
		try {
			System.out.println(1/2.0);
			System.out.println(1/0);
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}
	}
}