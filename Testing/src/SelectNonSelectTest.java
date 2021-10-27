import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectNonSelectTest {

	public static void main(String[] args) {
		//variables
		Connection con = null;
		Statement st = null;
		Scanner scan = null;
		ResultSet rs = null;
		
		try {
			//user inputs
			scan = new Scanner(System.in);
			String query = null;
			if(scan != null) {
				System.out.println("Enter SELECT OR NON-SELECT SQL query: (Student)");
				query = scan.nextLine();
			}
			
			System.out.println();
			//register JDBC driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud","root","root");
			//create statement object
			if(con != null)
				st = con.createStatement();
			//execute the query
			boolean flag = false;
			if(st != null)
				flag = st.execute(query);
			if(flag == true) {
				System.out.println("SELECT SQL Query is executed");
				//get ResultSet object
				rs=st.getResultSet();
				//process the resultSet
				boolean empty = false;
				while(rs.next()) {
					empty = true;
					System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
				}
				if(empty==true)
					System.out.println("Records are retrieved and displayed");
				else
					System.out.println("Records not found (Empty RS object)");
			} else {
				System.out.println("NON-SELECT SQL query is executed");
				//get update count
				int count = st.getUpdateCount();
				System.out.println("No. of records that are effected::"+count);
			}
		} catch (SQLException e) {
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
				if(scan!=null)
					scan.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
