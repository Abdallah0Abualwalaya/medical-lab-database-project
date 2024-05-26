package application;

public class Drugs {
	private String Drug_Name;

	public Drugs(String drug_Name) {
		super();
		Drug_Name = drug_Name;
	}

	public String getDrug_Name() {
		return Drug_Name;
	}

	public void setDrug_Name(String drug_Name) {
		Drug_Name = drug_Name;
	}

	@Override
	public String toString() {
		return "Drugs [Drug_Name=" + Drug_Name + "]";
	}
	
	
}
