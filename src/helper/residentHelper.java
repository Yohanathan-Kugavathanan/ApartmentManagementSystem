package helper;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import helper.DBConnect;

//import java.util.ArrayList;

import model.*;
import model.resident;


public class residentHelper implements residentHelperInterface {

	public residentHelper() {
		// TODO Auto-generated constructor stub
	}

	

	private static String sql = null;
	private static ResultSet res = null;
	private static PreparedStatement ps = null;

	

	// Adding a new resident record
	public boolean addResident(resident resident) throws SQLException, ClassNotFoundException {
		
		
		if (DBConnect.getInstance() != null) {

			Connection con = DBConnect.getConnction();// getConnection details
				//type corresponds to user type
			sql = "INSERT INTO reg_customer(residenttype,rId, name, userName, password, email, contact,nic) "
					+ "VALUES (?,?, ?, ?, ?, ?, ?,? )";
			ps = con.prepareStatement(sql);//returns statement that is editable for custom values

			
			//set values to the query
			
			ps.setString(1, resident.getResidentType());
			ps.setInt(2, resident.getrId());
			ps.setString(3, resident.getName());
			ps.setString(4, resident.getUserName());
			ps.setInt(5, resident.getPassword());
			ps.setString(6, resident.getEmail());
			ps.setString(7, resident.getContact());
			ps.setString(8, resident.getNIC());
		
			
			
			

			int query = ps.executeUpdate();//returns boolean
			

			if (query == 1) {//successfully executed
				return true;
			} else {
				return false;
			}
		}

		return false;
	}




//updating a resident
	public boolean updateResident(resident resident)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		if (DBConnect.getInstance() != null) {
			
			Connection con = DBConnect.getConnction();
			
			sql="UPDATE reg_customer SET residenttype=? name=?, userName=?, password=? ,email=?, contact=?, nic=?  WHERE rId=? ";
			
			ps= con.prepareStatement(sql);//returns prepared statement
			
			
			
			
			
			ps.setString(1, resident.getResidentType());
			ps.setString(2, resident.getName());
			ps.setString(3, resident.getUserName());	
			ps.setInt(4, resident.getPassword());
			ps.setString(5, resident.getEmail());
			ps.setString(6, resident.getContact());
			ps.setString(7, resident.getNIC());
			ps.setInt(8, resident.getrId());
			
			
			
			
			
			
			
			
			
			// this is for where condition, no of parameters should be equal as in sql statement
			

			int query = ps.executeUpdate();
			

			if (query == 1) {
				return true;
			} else {
				return false;
			}
			
		}
		
		return false;
	}

	
	

//delete resident data


	public boolean deleteResident(resident  resident) throws SQLException,ClassNotFoundException {
		
		if(DBConnect.getInstance()!=null)
		{
			Connection con=DBConnect.getConnction();
			
			sql="DELETE FROM reg_customer WHERE userName=?";
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, resident.getUserName());
			
			
			int query= ps.executeUpdate();
			
			if(query==1)
			{
				return true;
			}
			else 
				return false;
		}
		
		return false;
	}
	

	


//view  resident detail



	public ArrayList<resident> displayResidents( ) throws SQLException,ClassNotFoundException{
		
		if(DBConnect.getInstance()!=null) {
			
			Connection con=DBConnect.getConnction();
			
			sql="SELECT * FROM resident";
			
			ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
			
			res=ps.executeQuery();
			
			ArrayList<resident> ResidentArrayList=new ArrayList<resident>();
			//residentType,rId,name,userName,password,email,contact,NIC
			while(res.next())
			{
				resident r =new resident();
				
				r.setResidentType(res.getString("residenttype"));
				r.setrId(res.getInt("rId"));
				r.setName(res.getString("name"));
				r.setUserName(res.getString("userName"));
				r.setPassword(res.getInt("password"));
				r.setEmail(res.getString("email"));
				r.setContact(res.getString("contact"));
				r.setNIC(res.getString("nic"));
				
				
				
				
				ResidentArrayList.add(r);
				
			}
			return ResidentArrayList; 	
		}
		return null;
	}
	
	

	
	
//view a resident	detail
	
	public ArrayList<resident> displayUser(resident resident ) throws SQLException,ClassNotFoundException{
			
			if(DBConnect.getInstance()!=null) {
				
				Connection con=DBConnect.getConnction();
				
				sql="SELECT * FROM reg_customer WHERE userName=?";
				
				ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
				
				ps.setString(1, resident.getUserName());
				
				res=ps.executeQuery();
				
				ArrayList<resident> UserArrayList=new ArrayList<resident>();
				//rId,name,userName,password,email,contact,NIC
				while(res.next())
				{
					resident r =new resident();
					
					r.setResidentType(res.getString("residenttype"));
				    r.setrId(res.getInt("rId"));
					r.setName(res.getString("name"));
					r.setUserName(res.getString("userName"));
					r.setPassword(res.getInt("password"));
					r.setEmail(res.getString("email"));
					r.setContact(res.getString("contact"));
					r.setNIC(res.getString("nic"));
					
					UserArrayList.add(r);
					
				}
				return UserArrayList; 	
			}
			return null;
		}







}
	
	
	



