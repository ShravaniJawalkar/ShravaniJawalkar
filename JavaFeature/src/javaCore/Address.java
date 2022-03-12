package javaCore;

import java.io.Serializable;

public class Address implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1242665673142490075L;

	private transient String primary;
	private String secondary;

	public String getPrimary() {
		return primary;
	}

	public void setPrimary(String primary) {
		this.primary = primary;
	}

	public String getSecondary() {
		return secondary;
	}

	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}
}
