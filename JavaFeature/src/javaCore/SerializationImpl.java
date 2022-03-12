package javaCore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationImpl {
	public static void main(String args[]) {
		File f = new File("employee.txt");
		serialization(f);
		deserialization(f);

	}

	private static void deserialization(File f) {
		Employee emp = new Employee(new Address());
		try {
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream(f));
			emp = (Employee) oi.readObject();
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getEmail());
			System.out.println(emp.getPrimaryAddress());
			System.out.println(emp.getSecondAddress());
			System.out.println(emp.getOrganization());
			System.out.println(emp.getDesignation());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void serialization(File f) {
		Employee emp = new Employee(new Address());
		emp.setId(1);
		emp.setName("kasturi");
		emp.setEmail("kasturi@gmail.com");
		emp.setPrimaryAddress("chandur");
		emp.setSecondaryAddress("pune");
		emp.setOrganization("Acc");
		emp.setDesignation("ASE");
		try {
			ObjectOutputStream da = new ObjectOutputStream(new FileOutputStream(f));
			da.writeObject(emp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
