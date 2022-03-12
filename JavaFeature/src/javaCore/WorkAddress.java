package javaCore;



public class WorkAddress {

	private String workPrimary;
	private String workSecondary;
public WorkAddress() {}
	public String getWorkPrimary() {
		return workPrimary;
	}

	public void setWorkPrimary(String workPrimary) {
		this.workPrimary = workPrimary;
	}

	public WorkAddress(String workPrimary, String workSecondary) {
		super();
		this.workPrimary = workPrimary;
		this.workSecondary = workSecondary;
	}

	public String getWorkSecondary() {
		return workSecondary;
	}

	public void setWorkSecondary(String workSecondary) {
		this.workSecondary = workSecondary;
	}

}
