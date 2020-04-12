package helper;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnect {

	private static DBConnect sc;
	private static Connection con;
	private static String url="jdbc:mysql://localhost:3306/";
	private static String dbname ="sunshine_lk";
	private static String username="root";
	private static String password="root";

	//constructor
	private DBConnect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url + dbname, username, password);

	}

	public static DBConnect getInstance( ) throws  ClassNotFoundException, SQLException{
		if(sc==null){
			sc= new DBConnect();
			return sc;
		}else {
			return sc;
		}
	}

	public static Connection getConnction(){

		return con;
	}

	public static void printSQLException(SQLException ex) {
		for(Throwable e : ex){
			if(e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " +e.getMessage());
				Throwable t = ex.getCause();
				while(t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}	
	}      


}






