package com.example.springhiberjavaConfig.entity.java;

import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ExternalizationImpl {
public static void main(String args[]) throws InterruptedException {
	ExecutorService executor=Executors.newFixedThreadPool(2);
	Thread r=new MemThread(1);
	executor.execute(r);
	Thread r1=new MemThread(2);
	executor.execute(r1);
	Thread r3=new MemThread(3);
	executor.execute(r3);
	Thread r4=new MemThread(4);
	executor.execute(r4);
	Optional<Thread> ti= Thread.getAllStackTraces().keySet().stream().findFirst();
	if(ti.isPresent())
	{
		ti.stream().collect(Collectors.toSet()).forEach(System.out::println);
	}//ti.forEach(System.out::println);
	//executor.shutdown();
//	while(!executor.isShutdown()) {
//		
//	}
//	executor.shutdownNow();
	executor.awaitTermination(2000,TimeUnit.MILLISECONDS);
	
	
}

/*
 * private static void deserialization(File f) { // TODO Auto-generated method
 * stub try { Stationary s=new Stationary(); try (ObjectInputStream o1 = new
 * ObjectInputStream(new FileInputStream(f))) { s.setProduct_id(o1.readInt());
 * s.setProduct_name((String)o1.readObject());
 * s.setWorkAdd((String)o1.readObject()); } System.out.println(s);
 * 
 * } catch (IOException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } catch (ClassNotFoundException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } }
 * 
 * private static void serialization(File f) { try { try (ObjectOutputStream o1
 * = new ObjectOutputStream(new FileOutputStream(f))) { Stationary s=new
 * Stationary(); s.setProduct_id(1); s.setProduct_name("book");
 * s.setWorkAdd("kedar stores"); o1.writeInt(s.getProduct_id());
 * o1.writeObject(s.getProduct_name()); o1.writeObject(s.getWorkAdd());
 * System.out.println(s); } } catch (IOException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); }
 * 
 * }
 */
}
