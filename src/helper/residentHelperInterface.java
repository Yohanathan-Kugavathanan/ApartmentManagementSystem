package helper;

import java.sql.SQLException;
import java.util.ArrayList;

import model.resident;

public interface residentHelperInterface {

	public boolean addResident(resident resident) throws SQLException, ClassNotFoundException;
		
	public boolean updateResident(resident resident)throws SQLException, ClassNotFoundException;
	
	public boolean deleteResident(resident resident) throws SQLException,ClassNotFoundException;
		
	public  ArrayList<resident> displayUser(resident resident ) throws SQLException,ClassNotFoundException;
				
	public ArrayList<resident> displayResidents( ) throws SQLException,ClassNotFoundException;
		
}

