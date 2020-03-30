package helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.rInforModel;

public class rInforHelper {

public rInforHelper() {
		
	}
	
	
	
	private static String sql=null;
	private static ResultSet res=null;
	private static PreparedStatement ps=null;
	
	public boolean addRInformation(rInforModel rinfor) throws SQLException,ClassNotFoundException{
	
		if (DBConnect.getInstance() !=null) {
		
		Connection con=DBConnect.getConnction();
		
		sql = "INSERT INTO rinfor(rInforId,rId,rAmount,month)"
				+ "VALUES(?,?,?,?)";
		
		ps=con.prepareStatement(sql);
		
		ps.setInt(1,rinfor.getrInforId());
		ps.setString(2, rinfor.getrId());
		ps.setDouble(3,rinfor.getrAmount());
		ps.setString(4, rinfor.getMonth());
		
		int query=ps.executeUpdate();
		
		if(query==1) {
			return true;
		
		}else {
			return false;
			}
}
		return false;
}

	
	public boolean updateRInformation(rInforModel rinfor)throws SQLException,ClassNotFoundException{
	
	if(DBConnect.getInstance() !=null) {

		Connection con=DBConnect.getConnction();
		
		sql= "UPDATE rinfor SET rInforId=?,rid=?,rAmount=?,month=? WHERE rInforId=?";
		
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, rinfor.getrInforId());
		ps.setString(2, rinfor.getrId());
		ps.setDouble(3,rinfor.getrAmount());
		ps.setString(4, rinfor.getMonth());
		
		int query=ps.executeUpdate();
		
		if(query==1) {
			return true;
		}
		else {
			return false;
		}
	}
	return false;	
		
	}
	
	
public boolean deleteRInformation(rInforModel rinfor) throws SQLException,ClassNotFoundException {
		
		if(DBConnect.getInstance()!=null)
		{
			Connection con=DBConnect.getConnction();
			
			sql="DELETE FROM rinfor WHERE rInforId=?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, rinfor.getrInforId());
			
			
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
	
	
	
public ArrayList<rInforModel> displayRInformation(rInforModel rinfor ) throws SQLException,ClassNotFoundException{
	
	if(DBConnect.getInstance()!=null) {
		
		Connection con=DBConnect.getConnction();
		
		sql="SELECT * FROM rinfor WHERE rInforId=?";
		
		ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
		
		ps.setInt(1, rinfor.getrInforId());
		
		res=ps.executeQuery();
		
		ArrayList<rInforModel> rInforModelArrayList=new ArrayList<rInforModel>();
		
		while(res.next())
		{
			rInforModel r =new rInforModel();
			
			r.setrInforId(res.getInt("rInforId"));
			r.setrId(res.getString("rId"));
			r.setrAmount(res.getDouble("rAmount"));
			r.setMonth(res.getString("month"));
			
			rInforModelArrayList.add(r);
			
		}
		return rInforModelArrayList; 	
	}
	return null;
}


public ArrayList<rInforModel> displayRInformations( ) throws SQLException,ClassNotFoundException{
	
	if(DBConnect.getInstance()!=null) {
		
		Connection con=DBConnect.getConnction();
		
		sql="SELECT * FROM rinfor";
		
		ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
		
		res=ps.executeQuery();
		
		ArrayList<rInforModel> rInforModelArrayList=new ArrayList<rInforModel>();
		//roomNo, type, bed_type,description,floor, status, price
		while(res.next())
		{
			rInforModel r =new rInforModel();
			
			r.setrInforId(res.getInt("rInforId"));
			r.setrId(res.getString("rId"));
			r.setrAmount(res.getDouble("rAmount"));
			r.setMonth(res.getString("month"));
			
			rInforModelArrayList.add(r);
			
		}
		return rInforModelArrayList; 	
	}
	return null;
}


	
	
}
