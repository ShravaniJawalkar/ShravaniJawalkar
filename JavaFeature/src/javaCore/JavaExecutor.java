package javaCore;

public class JavaExecutor implements Runnable {
	private int message;
	public JavaExecutor(int message) {
		this.message=message;
	}
public void run() {
	System.out.println(Thread.currentThread().getName()+"(reciving) message"+message);
	revokeThread();
	System.out.println(Thread.currentThread().getName()+"(Done) message"+message);
}
private void revokeThread() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		System.out.println("unable to do operation");
	}
}



}
