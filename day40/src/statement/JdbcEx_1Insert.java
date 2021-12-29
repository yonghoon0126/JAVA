package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx_1Insert {

	public static void main(String[] args) {

		// 커넥션 선언
		Connection con = null;

		// 문장 객체 선언
		Statement stmt = null;

		// try-catch
		try {
			// 드라이브 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 커넥션 얻어오기
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");

			// Statement객체 얻기
			stmt = con.createStatement();

			// SQL 작성하기
			StringBuffer sql = new StringBuffer();
			sql.append("insert into department ");
			sql.append("values(101, '제어계측공학과',200,'1호관') ");

			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "개의 행이 추가되었습니다.");

		} catch (ClassNotFoundException e) {
			e.getStackTrace();

		} catch (SQLException e) {
			e.getStackTrace();

		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.getStackTrace();
			}
		}

	}

}
