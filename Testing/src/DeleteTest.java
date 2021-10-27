import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.DriverManager;

public class DeleteTest {
//Write a JDBC app to delete records from Student db table based on the given city(addrss)?
	public static void main(String[] args) {
		int count = 0;
		String city = null;
		String query = null;
		Connection con = null;
		Statement st = null;
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter what city to remove");
			city = sc.next();
			
			city = "'"+city+"'";
			//register the jdbc driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud", "root", "root");
			
			//create statement object
			if(con!=null)
				st = con.createStatement();
			
			//prepare SQL query
			query = "DELETE FROM student WHERE sadd="+city;
			System.out.println(query);
			
			//send and execute SQL query in the database 
			if(st!=null)
				count = st.executeUpdate(query);
			
			/*
			 * boolean flag = false; while(rs.next()) { flag=true;
			 * System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
			 * rs.getString(3) + " " + rs.getFloat(4)); }
			 */
			if(count==0) //equal to if (flag == false)
				 System.out.println("No records found");
			else
				 System.out.println(count+"number of records are deleted");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//close jdbc objects
			try {
				if(st!=null)
					st.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} try {
				if(con!=null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} try {
				if(sc!=null)
					sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
