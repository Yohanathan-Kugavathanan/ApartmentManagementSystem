package model;
/**
 * House.java
 * This is a model class represents House entity
 * @author Sumithraarachchi D.H.G(IT18123982)
 */

public class House2 {
	private int h2No;
	private int h2FloorNo;
	private int h2NoBeds;
	private int h2NoBaths;
	private double h2Sqft;
	private String h2HouseType;
	private String h2Status;
	private double h2Price;
	private double h2AdvancePayment;
	private double h2PerMonthRate;
	private String h2Rent;
	private String h2GasSupply;
	private String h2HotWater;

	public House2(){
		this.h2No=0;
		this.h2FloorNo=0;
		this.h2NoBeds=0;
		this.h2NoBaths=0;
		this.h2Sqft=0;
		this.h2HouseType="";
		this.h2Status="";
		this.h2Price=0;
		this.h2AdvancePayment=0;
		this.h2PerMonthRate=0;
		this.h2Rent="";
		this.h2GasSupply="";
		this.h2HotWater="";
	}

	//constructor
	public House2(int h2No, int h2FloorNo, int h2NoBeds, int h2NoBaths, double h2Sqft, String h2HouseType,
			String h2Status, double h2Price, double h2AdvancePayment, double h2PerMonthRate, String h2Rent,
			String h2GasSupply, String h2HotWater) {
		super();
		this.h2No = h2No;
		this.h2FloorNo = h2FloorNo;
		this.h2NoBeds = h2NoBeds;
		this.h2NoBaths = h2NoBaths;
		this.h2Sqft = h2Sqft;
		this.h2HouseType = h2HouseType;
		this.h2Status = h2Status;
		this.h2Price = h2Price;
		this.h2AdvancePayment = h2AdvancePayment;
		this.h2PerMonthRate = h2PerMonthRate;
		this.h2Rent = h2Rent;
		this.h2GasSupply = h2GasSupply;
		this.h2HotWater = h2HotWater;
	}

	//getters & setters
	public int getH2No() {
		return h2No;
	}


	public void setH2No(int h2No) {
		this.h2No = h2No;
	}


	public int getH2FloorNo() {
		return h2FloorNo;
	}


	public void setH2FloorNo(int h2FloorNo) {
		this.h2FloorNo = h2FloorNo;
	}


	public int getH2NoBeds() {
		return h2NoBeds;
	}


	public void setH2NoBeds(int h2NoBeds) {
		this.h2NoBeds = h2NoBeds;
	}


	public int getH2NoBaths() {
		return h2NoBaths;
	}


	public void setH2NoBaths(int h2NoBaths) {
		this.h2NoBaths = h2NoBaths;
	}


	public double getH2Sqft() {
		return h2Sqft;
	}


	public void setH2Sqft(double h2Sqft) {
		this.h2Sqft = h2Sqft;
	}


	public String getH2HouseType() {
		return h2HouseType;
	}


	public void setH2HouseType(String h2HouseType) {
		this.h2HouseType = h2HouseType;
	}


	public String getH2Status() {
		return h2Status;
	}


	public void setH2Status(String h2Status) {
		this.h2Status = h2Status;
	}


	public double getH2Price() {
		return h2Price;
	}


	public void setH2Price(double h2Price) {
		this.h2Price = h2Price;
	}


	public double getH2AdvancePayment() {
		return h2AdvancePayment;
	}


	public void setH2AdvancePayment(double h2AdvancePayment) {
		this.h2AdvancePayment = h2AdvancePayment;
	}


	public double getH2PerMonthRate() {
		return h2PerMonthRate;
	}


	public void setH2PerMonthRate(double h2PerMonthRate) {
		this.h2PerMonthRate = h2PerMonthRate;
	}


	public String getH2Rent() {
		return h2Rent;
	}


	public void setH2Rent(String h2Rent) {
		this.h2Rent = h2Rent;
	}


	public String getH2GasSupply() {
		return h2GasSupply;
	}


	public void setH2GasSupply(String h2GasSupply) {
		this.h2GasSupply = h2GasSupply;
	}


	public String getH2HotWater() {
		return h2HotWater;
	}


	public void setH2HotWater(String h2HotWater) {
		this.h2HotWater = h2HotWater;
	}



}
