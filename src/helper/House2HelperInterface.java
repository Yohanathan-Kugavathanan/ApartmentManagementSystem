package helper;

/**
 * This House2HelperInterface interface provides all the methods which use to do the CRUD operations
 * 
 * @author Sumithraarachchi D.H.G(IT18123982)
 *
 */

import java.sql.SQLException;
import java.util.ArrayList;

import model.House2;

public interface House2HelperInterface {
	public boolean addHouse12(House2 house2)throws SQLException,ClassNotFoundException;

	public boolean updateHouse2(House2 house2) throws SQLException,ClassNotFoundException;

	public boolean deleteHouse2(House2 house2) throws SQLException,ClassNotFoundException;

	public  ArrayList<House2> displayHouse2(House2 house2)throws SQLException,ClassNotFoundException;

	public  ArrayList<House2> displayHouse2( ) throws SQLException,ClassNotFoundException;
}
