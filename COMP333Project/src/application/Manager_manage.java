package application;

import java.sql.Date;

public class Manager_manage {
	private int mgrID;
	private String mgrName;
	private Date mgrBD;
	private Date mgrAdministration;
	private int dID;
	private int medical_EMP_ID;
	public Manager_manage(int mgrID, String mgrName, Date mgrBD, Date mgrAdministration, int dID, int medical_EMP_ID) {
		super();
		this.mgrID = mgrID;
		this.mgrName = mgrName;
		this.mgrBD = mgrBD;
		this.mgrAdministration = mgrAdministration;
		this.dID = dID;
		this.medical_EMP_ID = medical_EMP_ID;
	}
	public int getMgrID() {
		return mgrID;
	}
	public void setMgrID(int mgrID) {
		this.mgrID = mgrID;
	}
	public String getMgrName() {
		return mgrName;
	}
	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}
	public Date getMgrBD() {
		return mgrBD;
	}
	public void setMgrBD(Date mgrBD) {
		this.mgrBD = mgrBD;
	}
	public Date getMgrAdministration() {
		return mgrAdministration;
	}
	public void setMgrAdministration(Date mgrAdministration) {
		this.mgrAdministration = mgrAdministration;
	}
	public int getdID() {
		return dID;
	}
	public void setdID(int dID) {
		this.dID = dID;
	}
	public int getMedical_EMP_ID() {
		return medical_EMP_ID;
	}
	public void setMedical_EMP_ID(int medical_EMP_ID) {
		this.medical_EMP_ID = medical_EMP_ID;
	}
	@Override
	public String toString() {
		return "Manager_manage [mgrID=" + mgrID + ", mgrName=" + mgrName + ", mgrBD=" + mgrBD + ", mgrAdministration="
				+ mgrAdministration + ", dID=" + dID + ", medical_EMP_ID=" + medical_EMP_ID + "]";
	}
	
	
}
