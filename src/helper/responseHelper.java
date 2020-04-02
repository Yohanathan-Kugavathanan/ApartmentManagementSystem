package helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.rInforModel;
import model.responseModel;


public class responseHelper implements responseHelperInterface {

	private static String sql=null;
	private static ResultSet res = null;
	private static PreparedStatement ps = null;
	
	
	public responseHelper() {
		
	}
	
	public boolean addResponse(responseModel response) throws SQLException, ClassNotFoundException {
	
		if (DBConnect.getInstance() != null) {

			Connection con = DBConnect.getConnction();// getConnection details
			
	sql="INSERT INTO response(responseId,response)"+"VALUES(?,?)";
	
			ps = con.prepareStatement(sql);
	
	ps.setInt(1, response.getResponseId());
	ps.setString(2, response.getResponse());
	
	int query = ps.executeUpdate();//returns boolean
	
	
	if (query == 1) {//successfully executed
		return true;
	} else {
		return false;
		}
		}

		return false;

		
		}
	
	public boolean updateResponse(responseModel response)throws SQLException, ClassNotFoundException {
	
            if (DBConnect.getInstance() != null) {
			
			Connection con = DBConnect.getConnction();
			
	sql="UPDATE response SET responseId=? response=?";
	ps= con.prepareStatement(sql);
	
	ps.setInt(1, response.getResponseId());
	ps.setString(2, response.getResponse());
	
			
	int query = ps.executeUpdate();
	

	if (query == 1) {
		return true;
	} else {
		return false;
		}
	
            }

            return false;
            
            
            }		
	
	
	public boolean deleteResponse(responseModel response) throws SQLException,ClassNotFoundException {
		
		if(DBConnect.getInstance()!=null)
		{
			Connection con=DBConnect.getConnction();
			
			sql="DELETE FROM response WHERE responseId=?";
			
			ps = con.prepareStatement(sql);
		
			ps.setInt(1, response.getResponseId());

			int query=ps.executeUpdate();
			
			if(query==1)
			{
				return true;
			}
			else
				return false;
}
		return false;
	}
		
	public  ArrayList<responseModel> displayResponse(responseModel response ) throws SQLException,ClassNotFoundException{
		
		if(DBConnect.getInstance()!=null) {
			
			Connection con=DBConnect.getConnction();
			
			sql="SELECT * FROM response WHERE responseId=?";
			
			ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
			
			ps.setInt(1, response.getResponseId());
			
			
			res=ps.executeQuery();

		ArrayList<responseModel> responseModelArrayList=new ArrayList<responseModel>();
		
		while(res.next())
		{
		responseModel rm=new responseModel();
			
			rm.setResponseId(res.getInt("responseId"));
			rm.setResponse(res.getString("reponse"));
		
			responseModelArrayList.add(rm);
		}
		return responseModelArrayList;
		}
		return null;
	}
	
	public ArrayList<responseModel> displayResponses( ) throws SQLException,ClassNotFoundException{
		
		if(DBConnect.getInstance()!=null) {
			
			Connection con=DBConnect.getConnction();
			
			sql="SELECT * FROM response";
			
			ps = con.prepareStatement(sql);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection
			
			res=ps.executeQuery();
			
			ArrayList<responseModel> responseArrayList=new ArrayList<responseModel>();
			while(res.next())
			{
				responseModel re =new responseModel();
				
				re.setResponseId(res.getInt("responseId"));
				re.setResponse(res.getString("response"));
				
				responseArrayList.add(re);
				
			}
			return responseArrayList; 	
		}
		return null;
	}

	
	
	
	
	
	
	
	
	
		
		}
		
