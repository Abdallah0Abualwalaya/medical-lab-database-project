package application;

public class Patients_Phones {
	private int pID;
    private int pPhone;
	public Patients_Phones(int pID, int pPhone) {
		super();
		this.pID = pID;
		this.pPhone = pPhone;
	}
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public int getpPhone() {
		return pPhone;
	}
	public void setpPhone(int pPhone) {
		this.pPhone = pPhone;
	}
	@Override
	public String toString() {
		return "Patients_Phones [pID=" + pID + ", pPhone=" + pPhone + "]";
	}
    
    
}
