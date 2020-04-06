package model;


public class resident {

	private int rId;
	private String name;
	private String userName;
	private int password;
	private String email;
	private String contact;
	private String nic;
	private String residenttype;
	

public resident () {
		
	    rId=0;
        name=" ";	
 		userName =" ";
		email = " ";
		contact = " ";
		password =0;
		nic=" ";
		residenttype="";
	}

public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getNIC() {
		return nic;
	}

	public void setNIC(String nic) {
		this.nic = nic;
	}

	public String getResidentType() {
		return residenttype;
	}

	public void setResidentType(String residenttype) {
		this.residenttype = residenttype;
	}


	
}
