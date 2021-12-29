package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx_1delete {

	public static void main(String[] args) {

		// Ŀ�ؼ� ����
		Connection con = null;

		// ���� ��ü ����
		Statement stmt = null;

		// Resultset ����
		ResultSet rs = null;
		
		try {

			// ����̺� �ε�
			Class.forName("oracle.jdbc.OracleDriver");

			// Ŀ�ؼ� ������
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");

			// Statement��ü ���
			stmt = con.createStatement();
			
			// SQL �ۼ��ϱ�
			// delete
//			StringBuffer sql = new StringBuffer();
//
//			sql.append(" delete department " );
//			sql.append(" where deptno='203' " );
//			
			String sql = "";
			sql = "delete department where deptno='203'";
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + " ���� ���� ���� �Ǿ����ϴ�.");
			
			
		} catch (ClassNotFoundException e) {
			e.getStackTrace();

		} catch (SQLException e) {
			e.getStackTrace();

		} finally {
			
			try {
				
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			
			} catch (SQLException e) {
				e.getStackTrace();
			}
		}
		
		
	}

}
