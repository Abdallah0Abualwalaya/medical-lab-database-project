package application;

public class Doc_Phones {
	private int dID; 
	private int dPhone;
	public Doc_Phones(int dID, int dPhone) {
		super();
		this.dID = dID;
		this.dPhone = dPhone;
	}
	public int getdID() {
		return dID;
	}
	public void setdID(int dID) {
		this.dID = dID;
	}
	public int getdPhone() {
		return dPhone;
	}
	public void setdPhone(int dPhone) {
		this.dPhone = dPhone;
	}
	@Override
	public String toString() {
		return "Doc_Phones [dID=" + dID + ", dPhone=" + dPhone + "]";
	}
	
	
}
