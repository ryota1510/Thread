package thread;

public class Thread_main {
	
	public static void main(String[] args) {
		Thread_run[] th = new Thread_run[3];
		th[0] = new Thread_run();
		th[1] = new Thread_run();
		th[2] = new Thread_run();
		
		Thread_runnable[] th2 = new Thread_runnable[2];
		th2[0] = new Thread_runnable();
		th2[1] = new Thread_runnable();
		
		for(int i = 0; i < 3; i++) {
			th[i].start();	
		}
		
		for(int i = 0; i < 2; i++) {
			th2[i].run();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main‚©‚ço—Í : "+i);
		}
		
	}

}
