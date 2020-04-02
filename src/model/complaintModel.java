package model;

public class complaintModel {

	private int complaintId;
	
	private String complaint;

	public complaintModel() {
	
	this.complaintId=0;	
	this.complaint="";
	
	}

	public complaintModel(int complaintId,String complaint) {
		
		this.complaintId=complaintId;
		this.complaint = complaint;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	
	
	
}
