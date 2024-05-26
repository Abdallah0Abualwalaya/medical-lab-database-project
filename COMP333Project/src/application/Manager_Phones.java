package application;

public class Manager_Phones {

	private int mgrID; 
	private int mPhone;
	public Manager_Phones(int mgrID, int mPhone) {
		super();
		this.mgrID = mgrID;
		this.mPhone = mPhone;
	}
	public int getMgrID() {
		return mgrID;
	}
	public void setMgrID(int mgrID) {
		this.mgrID = mgrID;
	}
	public int getmPhone() {
		return mPhone;
	}
	public void setmPhone(int mPhone) {
		this.mPhone = mPhone;
	}
	@Override
	public String toString() {
		return "Manager_Phones [mgrID=" + mgrID + ", mPhone=" + mPhone + "]";
	}
	
	
}
