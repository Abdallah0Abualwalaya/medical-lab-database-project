package application;

import java.sql.Date;

public class Doc2Pa2Drug_Discribe {
	
	private int dID;
    private int pID;
	private String Drug_Name;
    private Date Discribe_date;
	public Doc2Pa2Drug_Discribe(int dID, int pID, String drug_Name, Date discribe_date) {
		super();
		this.dID = dID;
		this.pID = pID;
		Drug_Name = drug_Name;
		Discribe_date = discribe_date;
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
	public String getDrug_Name() {
		return Drug_Name;
	}
	public void setDrug_Name(String drug_Name) {
		Drug_Name = drug_Name;
	}
	public Date getDiscribe_date() {
		return Discribe_date;
	}
	public void setDiscribe_date(Date discribe_date) {
		Discribe_date = discribe_date;
	}
	@Override
	public String toString() {
		return "Doc2Pa2Drug_Discribe [dID=" + dID + ", pID=" + pID + ", Drug_Name=" + Drug_Name + ", Discribe_date="
				+ Discribe_date + "]";
	}
    
    
}
