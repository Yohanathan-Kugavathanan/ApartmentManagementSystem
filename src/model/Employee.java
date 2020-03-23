package model;
import java.util.Date;
//date is questionable ?//
public class Employee {
    private  String eid;
    private String fname ;
    private String lname;
    private String dob;
    private String lane;//change in db
    private String city;
    private String district;
    private String gender;
    private String[] qualification;
    private String tpNo;
    private double salary;
    private String position;
    private String[] school;
    private String bankAccNo;
    private int halfDays;
    private int fullDays;
    private int shortDays;
    private int late;
    private Date dateJoined;
    private Date dateLeft;

    public Employee() {
         this.eid = " ";
        this.fname = " ";
        this.lname = " ";
        this.dob = " ";
        this.lane = " ";
        this.city =" ";
        this.district=" ";
        this.gender=" ";
        this.tpNo = " ";
        this.salary = 0;
        this.position = " ";
        this.bankAccNo = "0";
        this.halfDays=0;
        this.fullDays=0;
        this.shortDays=0;
        this.late=0;
        this.dateJoined=null;
        this.dateLeft=null;
        
    }
    
    
    
   


   
	public Employee(String eid, String fname, String lname, String dob, String lane, String city, String district,
			String gender, String[] qualification, String tpNo, double salary, String position, String[] school,
			String bankAccNo, int halfDays, int fullDays, int shortDays, int late, int day,int month,int year) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.lane = lane;
		this.city = city;
		this.district = district;
		this.gender = gender;
		this.qualification = qualification;
		this.tpNo = tpNo;
		this.salary = salary;
		this.position = position;
		this.school = school;
		this.bankAccNo = bankAccNo;
		this.halfDays = halfDays;
		this.fullDays = fullDays;
		this.shortDays = shortDays;
		this.late = late;
		this.dateJoined =new Date();
	}






	public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }
    
    

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return lane;
    }

    public void setAddress(String address) {
        this.lane = address;
    }

    public String[] getQualification() {
        return qualification;
    }

    public void setQualification(String[] qualification) {
        this.qualification = qualification;
    }

    public String getTpNo() {
        return tpNo;
    }

    public void setTpNo(String tpNo) {
        this.tpNo = tpNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String[] getSchool() {
        return school;
    }

    public void setSchool(String[] school) {
        this.school = school;
    }

    public String getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(String bankAccNo) {
        this.bankAccNo = bankAccNo;
    }






	public String getLane() {
		return lane;
	}
	
	public void setLane(String lane) {
		this.lane = lane;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getHalfDays() {
		return halfDays;
	}

	public void setHalfDays(int halfDays) {
		this.halfDays = halfDays;
	}

	public int getFullDays() {
		return fullDays;
	}

	public void setFullDays(int fullDays) {
		this.fullDays = fullDays;
	}
	
	public int getShortDays() {
		return shortDays;
	}
	
	public void setShortDays(int shortDays) {
		this.shortDays = shortDays;
	}

	public int getLate() {
		return late;
	}

	public void setLate(int late) {
		this.late = late;
	}
    
    
    
    
}

