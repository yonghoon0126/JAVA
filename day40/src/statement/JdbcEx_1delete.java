package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx_1delete {

	public static void main(String[] args) {

		// 커넥션 선언
		Connection con = null;

		// 문장 객체 선언
		Statement stmt = null;

		// Resultset 선언
		ResultSet rs = null;
		
		try {

			// 드라이브 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 커넥션 얻어오기
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");

			// Statement객체 얻기
			stmt = con.createStatement();
			
			// SQL 작성하기
			// delete
//			StringBuffer sql = new StringBuffer();
//
//			sql.append(" delete department " );
//			sql.append(" where deptno='203' " );
//			
			String sql = "";
			sql = "delete department where deptno='203'";
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + " 개의 행이 삭제 되었습니다.");
			
			
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
