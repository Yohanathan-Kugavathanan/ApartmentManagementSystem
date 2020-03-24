package helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.rInforModel;

public class rInforHelper {

public rInforHelper() {
		
	}
	
	
	
	private static String sql=null;
	private static ResultSet res=null;
	private static PreparedStatement ps=null;
	
	public static boolean rInformation(rInforModel rinfor) throws SQLException,ClassNotFoundException{
	
		if (DBConnect.getInstance() !=null) {
		
		Connection con=DBConnect.getConnction();
		
		sql = "INSERT INTO rinfor(rInforId,rId,rAmount,month"
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

	
	
	
	
	
}
