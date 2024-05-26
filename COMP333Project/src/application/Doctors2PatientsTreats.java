package application;

import java.util.Date;

public class Doctors2PatientsTreats {
	private int dId;
	private int pId;
	private Date tDate;
	public Doctors2PatientsTreats(int dId, int pId) {
		super();
		this.dId = dId;
		this.pId = pId;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	@Override
	public String toString() {
		return "Doctors2PatientsTreats [dId=" + dId + ", pId=" + pId + "]";
	}
	
	
}
