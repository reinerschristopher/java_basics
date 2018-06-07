package sheet6task1;

public class CounterCommand implements Runnable {

	@Override
	public void run() {
		for(int i=0; i < 10; i++) {
			System.out.println(i);
			
			int dauer = new java.util.Random().nextInt(1000);
			try{
		        Thread.sleep(dauer);
		      }
		    catch(InterruptedException ie) { }
		}
	}

}
