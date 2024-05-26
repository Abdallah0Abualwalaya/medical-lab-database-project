package application;

public class Tests {

	private int dID;
	private int pID;
	private int medical_EMP_ID;

	public Tests(int dID, int pID, int medical_EMP_ID) {
		super();
		this.dID = dID;
		this.pID = pID;
		this.medical_EMP_ID = medical_EMP_ID;
	}

	public int getdID() {
		return dID;
	}

	public void setdID(int dID) {
		this.dID = dID;
	}

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public int getMedical_EMP_ID() {
		return medical_EMP_ID;
	}

	public void setMedical_EMP_ID(int medical_EMP_ID) {
		this.medical_EMP_ID = medical_EMP_ID;
	}

}
