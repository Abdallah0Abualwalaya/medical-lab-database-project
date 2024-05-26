package application;

import java.sql.Date;

public class Patients {
	private int pId;
	private String pName;
	private Date date;
	private String address;
	private String chekups;
	public Patients(int pId, String pName, Date date, String address, String chekups) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.date = date;
		this.address = address;
		this.chekups = chekups;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getChekups() {
		return chekups;
	}
	public void setChekups(String chekups) {
		this.chekups = chekups;
	}
	@Override
	public String toString() {
		return "Patients [pId=" + pId + ", pName=" + pName + ", date=" + date + ", address=" + address + ", chekups="
				+ chekups + "]";
	}
	
	
}
