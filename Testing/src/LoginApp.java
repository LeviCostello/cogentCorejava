import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {
		//variables
		int count = 0;
		String user = null, pass = null;
		Scanner scan = null;
		Connection con = null;
		Statement st = null;
		String query = null;
		ResultSet rs = null;
		
		
		//surround in try catch
		try {
			//ask user for information on login
			scan=new Scanner(System.in);
			if(scan!=null) {
				System.out.print("Enter username: ");
				user = scan.nextLine();
				System.out.print("Enter Password: ");
				pass = scan.nextLine();
			}
			//convert input values as required for SQL query
			user = "'"+user+"'";
			pass = "'"+pass+"'";
 			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud","root","root");
			System.out.println(con.getClass().getName());
			//create statement object
			if(con!=null)
				st = con.createStatement();
			//prepare the query
			query= "SELECT COUNT(*) FROM userInfo WHERE uname="+user+"AND pwd="+pass;
			System.out.println(query);
			//send and execute
			if(st!=null)
				rs=st.executeQuery(query);
			
			//process the resultset object then the resultset 
			if(rs!=null) {
				rs.next();
				count=rs.getInt("count(*)");
			}
			if(count==0)
				System.out.println("Invalid credentials");
			else
				System.out.println("Valid credentials");
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//close JDBC objects
			try {
				if(rs!=null)
					rs.close();
			} catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			} catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(scan!=null)
					scan.close();
			} catch(Exception se) {
				se.printStackTrace();
			}
		}

	}

}
