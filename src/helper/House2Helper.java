package helper;

/**
 * This House2Helper class provides CRUD database operations for the table house2 in the
 * database.
 * 
 * @author Sumithraarachchi D.H.G(IT18123982)
 *
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.House2;
import model.rInforModel;

public class House2Helper {

	public House2Helper() {

	}

	private static String INSERT_USERS_SQL = "INSERT INTO house2(h2No,h2FloorNo,h2NoBeds,h2NoBaths,h2Sqft,h2HouseType,h2Status,h2Price,h2AdvancePayment,h2PerMonthRate,h2Rent,h2GasSupply,h2HotWater)"
			+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static String UPDATE_USERS_SQL = "UPDATE house2 SET h2No=?,h2FloorNo=?,h2NoBeds=?,h2NoBaths=?,h2Sqft=?,h2HouseType=?,h2Status=?,h2Price=?,h2AdvancePayment=?,h2PerMonthRate=?,h2Rent=?,h2GasSupply=?,h2HotWater=? WHERE h2No=?";
	private static final String DELETE_USERS_SQL = "DELETE FROM house2 WHERE h2No=?";
	private static final String SELECT_USER_BY_ID = "SELECT * FROM house2 WHERE h2No=?";
	private static final String SELECT_ALL_USERS = "SELECT * FROM house2";
	private static ResultSet res=null;
	private static PreparedStatement ps=null;

	public boolean addHouse2(House2 house2)throws SQLException,ClassNotFoundException{
		if (DBConnect.getInstance() !=null) {

			Connection con=DBConnect.getConnction();

			ps=con.prepareStatement(INSERT_USERS_SQL);

			ps.setInt(1, house2.getH2No());
			ps.setInt(2, house2.getH2FloorNo());
			ps.setInt(3, house2.getH2NoBeds());
			ps.setInt(4, house2.getH2NoBaths());
			ps.setDouble(5, house2.getH2Sqft());
			ps.setString(6, house2.getH2HouseType());
			ps.setString(7, house2.getH2Status());
			ps.setDouble(8, house2.getH2Price());
			ps.setDouble(9, house2.getH2AdvancePayment());
			ps.setDouble(10, house2.getH2PerMonthRate());
			ps.setString(11, house2.getH2Rent());
			ps.setString(12, house2.getH2GasSupply());
			ps.setString(13, house2.getH2HotWater());

			int query=ps.executeUpdate();

			if(query==1) {
				return false;

			}else {
				return false;
			}
		}
		return false;
	}

	public boolean updateHouse2(House2 house2) throws SQLException,ClassNotFoundException{
		if(DBConnect.getInstance() !=null) {

			Connection con=DBConnect.getConnction();

			ps = con.prepareStatement(UPDATE_USERS_SQL);

			//ps.setInt(1, house2.getH2No());
			ps.setInt(1, house2.getH2FloorNo());
			ps.setInt(2, house2.getH2NoBeds());
			ps.setInt(3, house2.getH2NoBaths());
			ps.setDouble(4, house2.getH2Sqft());
			ps.setString(5, house2.getH2HouseType());
			ps.setString(6, house2.getH2Status());
			ps.setDouble(7, house2.getH2Price());
			ps.setDouble(8, house2.getH2AdvancePayment());
			ps.setDouble(9, house2.getH2PerMonthRate());
			ps.setString(10, house2.getH2Rent());
			ps.setString(11, house2.getH2GasSupply());
			ps.setString(12, house2.getH2HotWater());

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

	public boolean deleteHouse2(House2 house2) throws SQLException,ClassNotFoundException{
		if(DBConnect.getInstance()!=null)
		{
			Connection con=DBConnect.getConnction();

			ps = con.prepareStatement(DELETE_USERS_SQL);

			ps.setInt(1, house2.getH2No());

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

	public  ArrayList<House2> displayHouse2(House2 house2)throws SQLException,ClassNotFoundException{
		if(DBConnect.getInstance()!=null) {

			Connection con=DBConnect.getConnction();

			ps = con.prepareStatement(SELECT_USER_BY_ID);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection

			ps.setInt(1, house2.getH2No());

			res=ps.executeQuery();

			ArrayList<House2> House2ArrayList = new ArrayList<House2>();

			while(res.next())
			{
				House2 r =new House2();

				r.setH2No(res.getInt("h2No"));
				r.setH2FloorNo(res.getInt("h2FloorNo"));
				r.setH2NoBeds(res.getInt("h2NoBeds"));
				r.setH2NoBaths(res.getInt("h2NoBaths"));
				r.setH2Sqft(res.getDouble("h2Sqft"));
				r.setH2HouseType(res.getString("h2HouseType"));
				r.setH2Status(res.getString("h2Status"));
				r.setH2Price(res.getDouble("h2Price"));
				r.setH2AdvancePayment(res.getDouble("h2AdvancePayment"));
				r.setH2PerMonthRate(res.getDouble("h2PerMonthRate"));
				r.setH2Rent(res.getString("h2Rent"));
				r.setH2GasSupply(res.getString("h2GasSupply"));
				r.setH2HotWater(res.getString("h2HotWater"));

				House2ArrayList.add(r);

			}
			return House2ArrayList; 	
		}
		return null;
	}

	public  ArrayList<House2> displayHouse2( ) throws SQLException,ClassNotFoundException{
		if(DBConnect.getInstance()!=null) {

			Connection con=DBConnect.getConnction();

			ps = con.prepareStatement(SELECT_ALL_USERS);    //Throws:SQLException - if a database access error occurs or this method is called on a closed connection

			res=ps.executeQuery();

			ArrayList<House2> House2ArrayList=new ArrayList<House2>();

			while(res.next())
			{
				House2 r =new House2();

				r.setH2No(res.getInt("h2No"));
				r.setH2FloorNo(res.getInt("h2FloorNo"));
				r.setH2NoBeds(res.getInt("h2NoBeds"));
				r.setH2NoBaths(res.getInt("h2NoBaths"));
				r.setH2Sqft(res.getDouble("h2Sqft"));
				r.setH2HouseType(res.getString("h2HouseType"));
				r.setH2Status(res.getString("h2Status"));
				r.setH2Price(res.getDouble("h2Price"));
				r.setH2AdvancePayment(res.getDouble("h2AdvancePayment"));
				r.setH2PerMonthRate(res.getDouble("h2PerMonthRate"));
				r.setH2Rent(res.getString("h2Rent"));
				r.setH2GasSupply(res.getString("h2GasSupply"));
				r.setH2HotWater(res.getString("h2HotWater"));

				House2ArrayList.add(r);

			}
			return House2ArrayList; 	
		}
		return null;
	}
}
