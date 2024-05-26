package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Doctors {
	private int dId;
	private String name;
	private int salary;
	private Date b_date;
	public Doctors(int dId, String name, int salary, Date b_date) {
		super();
		this.dId = dId;
		this.name = name;
		this.salary = salary;
		this.b_date = b_date;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDateOFBirth() {
		SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
		String dateFormatted = fmt.format(b_date);
		return dateFormatted;
	}

	public void setDateOFBirth(Date dateOFBirth) {
		this.b_date = dateOFBirth;
	}
	@Override
	public String toString() {
		return "Doctors [ID=" + dId + ", Name=" + name + ", Salary=" + salary + ", Date of birth=" + b_date + "]";
	}
	
	
	
}
