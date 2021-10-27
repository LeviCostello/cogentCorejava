import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTestOne {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter start range of student number:: ");
			int start = sc.nextInt(); //100
			System.out.print("Enter end range of student number:: ");
			int end = sc.nextInt(); //200
			
			//register jdbc driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud", "root", "root");
			
			//create statement object
			Statement st = con.createStatement();
			
			//prepare SQL query
			//select * from student where sno>-100 and sn<-200
			String query = "select * from student where sno>="+start+" and sno<="+end;
			System.out.println(query);
			
			//send and execute SQL query in the database s/w
			ResultSet rs = st.executeQuery(query);
			
			//process the ResultSet Object
			
			boolean flag = false;
			while(rs.next()) {
				flag=true;
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getFloat(4));
			}

			/* if(!flag) //equal to if (flag == false)
			 * 		System.out.pritnln("No records found);
			 * else
			 * 		System.out.println("Students whose sno >="+start+" and <="+end+" details are displayed ");
			 * 
			 */
			//close jdbc objects
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
