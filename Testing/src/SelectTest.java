import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		try {
			Connection con = null;
			Statement st = null;
			//Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productcrud", "root", "root");
			// create statement object
			if(con!=null) {
				st = con.createStatement();
			}
			// send an execute SQL query in Database s/w
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENT");
			// process the resultset object

			while (rs.next() != false) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getFloat(4));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

}
