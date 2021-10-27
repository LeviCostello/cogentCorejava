import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; //interface
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {
//Write a JDBC App to update student address, name, avg with new values based on the given student
//    number?

	public static void main(String[] args) {
		Scanner scan = null;
		Statement st =  null;
		Connection con = null;
		int id = 0, count = 0;
		String adds = null, name = null, query = null;
		Float avg = 0.0f;
		
		try {
			scan = new Scanner(System.in);
			System.out.print("Enter new address: ");
			adds = scan.next();
			System.out.print("Enter new name ");
			name = scan.next();
			System.out.print("Enter new avg ");
			avg = scan.nextFloat();
			System.out.print("Enter ID: ");
			id = scan.nextInt();
			
			adds = "'"+adds+"'";
			name = "'"+name+"'";
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud","root","root");
			System.out.println(con.getClass().getName());
			
			if(con!=null)
				st = con.createStatement();
			
			//query
			query = "UPDATE student SET sname="+name+", sadd="+adds+",avg="+avg+" WHERE sno="+id;
			System.out.println(query);
			
			//choose one to send and execute SQL query in the database 
			if(st!=null)
				count = st.executeUpdate(query);
			
			
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
