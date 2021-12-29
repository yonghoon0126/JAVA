package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx_1update {

// 203을 검색해서 '제어계측공학과' --> '전자계산학과'로 수정 
	public static void main(String[] args) {

		// 커넥션 선언
		Connection con = null;

		// 문장 객체 선언
		Statement stmt = null;

		try {

			// 드라이브 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 커넥션 얻어오기
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");

			// Statement객체 얻기
			stmt = con.createStatement();
			
			// SQL 작성하기
			// update
			StringBuffer sql = new StringBuffer();
//			sql.append(" update department set dname='전자계산학과'" );
//			sql.append(" where deptno='203'" );
//			
//			String sql = "";
//			sql = "update department set dname='전자계산학과' where deptno='203'";
//
//			int result = stmt.executeUpdate(sql.toString());
//			System.out.println(result + " 개의 행이 수정 되었습니다.");
			
			// insert
//			sql.append("insert into department ");
//			sql.append("values(208, '제어계측공학과',200,'7호관') ");
//			int result = stmt.executeUpdate(sql.toString());
//			System.out.println(result + " 개의 행이 삽입 되었습니다.");
			
			// delete
			sql.append(" delete department " );
			sql.append(" where deptno='203' " );
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + " 개의 행이 삭제 되었습니다.");
			
			
		} catch (ClassNotFoundException e) {
			e.getStackTrace();

		} catch (SQLException e) {
			e.getStackTrace();

		} finally {
			
			try {
				
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
