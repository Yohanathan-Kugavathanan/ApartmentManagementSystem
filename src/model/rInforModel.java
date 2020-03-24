package model;

public class rInforModel {

	private int rInforId;
	private String rId;
	private double rAmount;
	private String month;
	
	public rInforModel() {
		
		this.rInforId=0;
		this.rId="";
		this.rAmount=0.0;
		this.month="";
	}

	public rInforModel(int rInforId, String rId, double rAmount, String month) {
		
		this.rInforId=rInforId;
		this.rId = rId;
		this.rAmount = rAmount;
		this.month = month;
	}

	public int getrInforId() {
		return rInforId;
	}

	public void setrInforId(int rInforId) {
		this.rInforId = rInforId;
	}

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	public double getrAmount() {
		return rAmount;
	}

	public void setrAmount(double rAmount) {
		this.rAmount = rAmount;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	

	
	
	
	
}
