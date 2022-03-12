package javaCore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ShopTest {
public static void main(String[] args) throws IOException {
	File f=new File("shop.txt");
	System.out.println(f.exists());
	FileWriter fi=new FileWriter(f);
	System.out.println(f.exists());
	serialization(f);
	deserialization(f);
}

private static void deserialization(File f) {
	ObjectInputStream ois;
	try {
		ois = new ObjectInputStream(new FileInputStream(f));
		System.out.println("deserialize...");
		Shop shop=(Shop)ois.readObject();
		System.out.println(shop.getAge());
		System.out.println(shop.getWorkId());
		System.out.println(shop.getWorkName());
		System.out.println(shop.getWorkPrimary());
		System.out.println(shop.getWorkSecondary());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}

private static void serialization(File f) {
Shop shop=new Shop();
shop.setAge(23);
shop.setWorkId(1);
shop.setWorkName("saikat");
shop.setWorkPrimary("lagpat nagar");
shop.setWorkSecondary("borivali");
	ObjectOutputStream oos;
	try {
		oos = new ObjectOutputStream(new FileOutputStream(f));
		System.out.println("serialize...");
		oos.writeObject(shop);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
