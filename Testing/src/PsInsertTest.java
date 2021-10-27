import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PsInsertTest {
private static final String INSERT_STUDENT_QUERY="INSERT INTO STUDENT VALUES(?,?,?,?)";
	
	public static void main(String[] args) {
		
		Scanner scan = null;
		int count = 0;
		Connection con = null;
		PreparedStatement ps = null;
		int no = 0;
		String name = null, addrs = null;
		float avg = 0.0f;
		int result = 0;
		
		try {
			//read Inputs
			scan = new Scanner(System.in);
			if(scan !=null) {
				System.out.print("Enter Students count: ");
				count = scan.nextInt();
			}
			//register JDBC driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud","root","root");
			//create prepared statement object having given wuery as pre=compiled SQL query
			if(con != null)
				ps = con.prepareStatement(INSERT_STUDENT_QUERY);
			
			//read each student details and set them pre-compiled query params values for multiple times
			if(ps != null && scan !=null) {
				for (int i = 1; i <= count; i++) {
					System.out.println("Enter "+i+" student details");
					System.out.print("Number: ");
					no = scan.nextInt();
					System.out.print("Name: ");
					name = scan.next();
					System.out.print("Address: ");
					addrs = scan.next();
					System.out.print("Avg: ");
					avg = scan.nextFloat();
					
					//set each student details to query param values
					ps.setInt(1, no);
					ps.setString(2, name);
					ps.setString(3, addrs);
					ps.setFloat(4, avg);
					
					//execute the query
					result = ps.executeUpdate();
					
					//process the result
					if(result == 0)
						System.out.println(i+" student details are not inserted");
					else
						System.out.println(i+" student details are inserted");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//close jdbc objects
			try {
				if(ps!=null)
					ps.close();
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
