package application;

import java.sql.Date;

public class Medical_Lab_EMP2RES {
	private int medical_EMP_ID;
	private String medical_EMP_Name;
	private Date medical_EMP_BD;
	private String medical_EMP_address;
	private double medical_EMP_salary;
	private int dID;
	private String res;
	public Medical_Lab_EMP2RES(int medical_EMP_ID, String medical_EMP_Name, Date medical_EMP_BD,
			String medical_EMP_address, double medical_EMP_salary, int dID, String res) {
		super();
		this.medical_EMP_ID = medical_EMP_ID;
		this.medical_EMP_Name = medical_EMP_Name;
		this.medical_EMP_BD = medical_EMP_BD;
		this.medical_EMP_address = medical_EMP_address;
		this.medical_EMP_salary = medical_EMP_salary;
		this.dID = dID;
		this.res = res;
	}
	public int getMedical_EMP_ID() {
		return medical_EMP_ID;
	}
	public void setMedical_EMP_ID(int medical_EMP_ID) {
		this.medical_EMP_ID = medical_EMP_ID;
	}
	public String getMedical_EMP_Name() {
		return medical_EMP_Name;
	}
	public void setMedical_EMP_Name(String medical_EMP_Name) {
		this.medical_EMP_Name = medical_EMP_Name;
	}
	public Date getMedical_EMP_BD() {
		return medical_EMP_BD;
	}
	public void setMedical_EMP_BD(Date medical_EMP_BD) {
		this.medical_EMP_BD = medical_EMP_BD;
	}
	public String getMedical_EMP_address() {
		return medical_EMP_address;
	}
	public void setMedical_EMP_address(String medical_EMP_address) {
		this.medical_EMP_address = medical_EMP_address;
	}
	public double getMedical_EMP_salary() {
		return medical_EMP_salary;
	}
	public void setMedical_EMP_salary(double medical_EMP_salary) {
		this.medical_EMP_salary = medical_EMP_salary;
	}
	public int getdID() {
		return dID;
	}
	public void setdID(int dID) {
		this.dID = dID;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	@Override
	public String toString() {
		return "Medical_Lab_EMP2RES [medical_EMP_ID=" + medical_EMP_ID + ", medical_EMP_Name=" + medical_EMP_Name
				+ ", medical_EMP_BD=" + medical_EMP_BD + ", medical_EMP_address=" + medical_EMP_address
				+ ", medical_EMP_salary=" + medical_EMP_salary + ", dID=" + dID + ", res=" + res + "]";
	}
	
	
	
}
