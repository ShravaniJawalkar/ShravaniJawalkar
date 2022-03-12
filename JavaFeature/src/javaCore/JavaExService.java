package javaCore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JavaExService {
public static void main(String[] args) {
	ExecutorService executor=Executors.newFixedThreadPool(2);
	Runnable process =new JavaExecutor(1);
	executor.execute(process);
	Runnable process1 =new JavaExecutor(2);
	executor.execute(process1);
	Runnable process2 =new JavaExecutor(3);
	executor.execute(process2);
	Runnable process3 =new JavaExecutor(4);
	executor.execute(process3);
	executor.shutdown();
	//while(!executor.isTerminated()) {}
try {
	executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
} catch (InterruptedException e) {
	System.out.println("error");
}
	System.out.println("shutdown Done");
}
}
