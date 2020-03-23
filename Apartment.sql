CREATE TABLE employee(
 eid varchar(5) PRIMARY KEY,
    fname varchar(50),
    lname varchar(50),
    dob varchar(10),
	email varchar(50),
	gender varchar(6),
    lane varchar(30),
	city varchar(30),
	district varchar(30),
	NIC varchar(10),
    tpNo varchar(11),
    salary double default '0.00',
    position varchar(20),
	empType varchar(20), 
    bankAccountNo varchar(40),
	dateJoined date default '2000-1-1',
	dateLeft date default '2000-1-1',
	halfDays int ,
	fullDays int,
	shortDays int, 
	late int,


    
    CONSTRAINT chk_dob CHECK (dob LIKE '[0-9][0-9][/][0-9][0-9][/][0-9][0-9][0-9][0-9]'),
    CONSTRAINT chk_dob CHECK (tpNo LIKE '[0-9][0-9][0-9][-][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'),
	CONSTRAINT chk_nic  CHECK (NIC LIKE '[0-9] [0-9] [0-9] [0-9][0-9] [0-9] [0-9] [0-9][0-9][V]')
     
    
    

);




CREATE TABLE emp_school(

eid varchar(5) ,
school varchar(50),

    CONSTRAINT pk_empSchool PRIMARY KEY (eid,school),	
    CONSTRAINT fk_empSchool FOREIGN KEY (eid) REFERENCES Employee(eid)


);


CREATE TABLE emp_qualification(

eid varchar(5),
qualification varchar(70) ,



CONSTRAINT pk_empQualify PRIMARY KEY (eid,qualification), 
CONSTRAINT fk_empQualify FOREIGN KEY (eid) REFERENCES Employee (eid)    
    

)


CREATE TABLE emp_experience(
eid varchar(5),
experience varchar(40),

CONSTRAINT pk_empExp PRIMARY KEY (eid, experience), 
CONSTRAINT fk_empExp FOREIGN KEY (eid) REFERENCES Employee (eid)    

) ;

CREATE TABLE admin(
userName varchar(50),
password varchar(50),
type varchar(20)

CONSTRAINT pk_admin PRIMARY KEY (userName) 

);


CREATE TABLE leave_request(
lid int NOT NULL AUTO_INCREMENT,
toL date default '0000-00-00',
fromL date default '0000-00-00',
reason varchar(50),
typez varchar(20),
timeLR time default '00:00:00',
dateLR date default '0000-00-00',
noOfDays int default 0,
status varchar(10),
adName varchar(50),
eid varchar(5),

CONSTRAINT pk_leaveReq PRIMARY KEY (lid) ,
CONSTRAINT fk_leaveReq1 FOREIGN KEY (adName) REFERENCES Admin (userName),
CONSTRAINT fk_leaveReq2 FOREIGN KEY (eid) REFERENCES Employee (eid)    

);


CREATE TABLE salary_pay(
sid  int AUTO_INCREMENT ,
monthSP varchar(20),
yearSP  year default '0000',
amount double(16,2) default '0.00' ,
issuedDate date default '0000-00-00' ,
eid varchar(5),
CONSTRAINT pk_salaryPay PRIMARY KEY (sid,eid),
CONSTRAINT fk_salaryPay FOREIGN KEY (eid) REFERENCES Employee (eid)

);

CREATE TABLE attendance (
aid varchar(15) PRIMARY KEY,
dateA date default'0000-00-00' ,
timeInA time default '00:00:00',
timeOutA time default '00:00:00',
eid  varchar(5),

CONSTRAINT fk_Attend FOREIGN KEY (eid) REFERENCES Employee(eid) 



);


CREATE TABLE notices(
nid int PRIMARY KEY,
dateN date   default '0000-00-00',
timeN time default '00:00:00',
image  blob ,
descriptionN varchar(50),
adName varchar(50), 
CONSTRAINT fk_Notices FOREIGN KEY (adName) REFERENCES Admin(userName)

)
CREATE TABLE admin_notices(
nid  int ,
adName varchar(50)  ,
dateSent date default '0000-00-00',
timeSent time default '00:00:00',

CONSTRAINT PK_adminNot PRIMARY KEY (nid, adName),

CONSTRAINT fk_adminNot FOREIGN KEY(adName) REFERENCES Admin(userName)

)
CREATE TABLE emp_notices(
eid varchar(5) ,
nid int ,
dateRec date default '0000-00-00',
timeRec time default '00:00:00',

CONSTRAINT pk_empNot PRIMARY KEY (eid, nid),
CONSTRAINT fk_empNot1 FOREIGN KEY(eid) REFERENCES Employee(eid),
CONSTRAINT fk_empNot2 FOREIGN KEY(nid) REFERENCES Notices(nid)


)