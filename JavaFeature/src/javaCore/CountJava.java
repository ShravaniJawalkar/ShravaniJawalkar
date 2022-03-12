package javaCore;

import java.util.concurrent.CountDownLatch;

public class CountJava {
public static void main(String[] args) {
CountDownLatch countDoLatch=new CountDownLatch(2);
DevTeam dev1=new DevTeam(countDoLatch, "DEV_TEAM");
DevTeam dev2=new DevTeam(countDoLatch, "DEV_TEAM");
dev1.start();
dev2.start();

try {
	countDoLatch.await();
} catch (InterruptedException e) {
	System.out.println("unable to proceed");
}
TestTeam test=new TestTeam("Test Team");
test.start();
}
}
