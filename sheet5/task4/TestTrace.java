package sheet5.task4;

public class TestTrace {
	public static void main(String[] args) {
		CallEg eg = new CallEg(); // use default constructor
		try {
			eg.methodA();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}
	}
}

/*
 * Aufgabenteil a)
 * 0.5
 *	java.lang.ArithmeticException: / by zero
 *		at sheet5.task4.CallEg.methodA(CallEg.java:6)
 *		at sheet5.task4.TestTrace.main(TestTrace.java:7)
 */

/*
 * Aufgabenteil b)
 *	0.5
 *	java.lang.ArithmeticException: / by zero
 *		at sheet5.task4.CallEg.methodC(CallEg.java:12)
 *		at sheet5.task4.CallEg.methodB(CallEg.java:8)
 *		at sheet5.task4.CallEg.methodA(CallEg.java:5)
 *		at sheet5.task4.TestTrace.main(TestTrace.java:7)
 */

/*
 * Aufgabenteil c)
 * 0.5
 *	java.lang.ArithmeticException: / by zero
 *		at sheet5.task4.CallEg.methodC(CallEg.java:23)
 *		at sheet5.task4.CallEg.methodB(CallEg.java:14)
 *		at sheet5.task4.CallEg.methodA(CallEg.java:6)
 *		at sheet5.task4.TestTrace.main(TestTrace.java:7)
 *
 * Die Ausgabe ist analog zu Teil b). Man hätte hier ebenfalls die Möglichkeit in methodC() und methodB()
 * den Fehler nicht direkt zu behandeln, sondern ihn an methodA() lediglich weiterzuleiten.
 *
 */


/*
 * Code für Aufgabenteil a)
 * class CallEg {
 *		public void methodA() throws ArithmeticException {
 *			System.out.println(1/2.0);
 *			System.out.println(1/0);
 *		}
 *		public void methodB() throws ArithmeticException {  }
 *		public void methodC() throws ArithmeticException {  }
 *	}
 */

/*
 * Code für Aufgabenteil b)
 * class CallEg {
 *		public void methodA() throws ArithmeticException {
 *			methodB();
 *		}
 *		public void methodB() throws ArithmeticException {
 *			methodC();
 *		}
 *		public void methodC() throws ArithmeticException {
 *			System.out.println(1/2.0);
 *			System.out.println(1/0);
 *		}
 *	}
 */