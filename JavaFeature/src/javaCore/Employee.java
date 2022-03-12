package javaCore;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3904854069347978422L;

	private int id;
	private String name;
	private transient String email;
	private Address address;
	private double salary;

	public Employee(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrimaryAddress() {
		return address.getPrimary();
	}

	public String getSecondAddress() {
		return address.getSecondary();
	}

	public void setPrimaryAddress(String primary) {
		this.address.setPrimary(primary);
	}

	public void setSecondaryAddress(String secondary) {
		this.address.setSecondary(secondary);
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeObject(getDesignation());
		oos.writeObject(getOrganization());

	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		setDesignation((String) ois.readObject());
		setOrganization((String) ois.readObject());
	}
}
