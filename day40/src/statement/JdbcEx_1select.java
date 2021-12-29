package statement;

//	*ResultSet : select query의 수행결과로 얻어진 결과집합을 추상화한것이다.
//	*ResultSet은 결과 집합에서 data를 가져올 수 있는 다양한 메소드와 Cursor를 포함하고 있음.
//	
//	*boolean 	first():
//				last():
//				next():
//				previous():
//	
//	int			getInt(int 컬럼인 덱스)	// 칼럼인 덱스는 무조건 1부터 시작
//	int	 		getInt(String 컬럼이름) // "칼럼이름"
//	
//	String 		getString(int 컬럼인 덱스)
//	ResultSet 	getString(String 컬럼이름)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx_1select {

	public static void main(String[] args) {

		// 커넥션 선언
		Connection con = null;

		// 문장 객체 선언
		Statement stmt = null;

//*******************************************************************************************
		// Resultset 선언 = 커서 관리자
		ResultSet rs = null;
//*******************************************************************************************

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

			sql.append("select * ");
			sql.append("from department ");

//*******************************************************************************************
			// ResultSet 얻기 - executeQuery중요함
			rs = stmt.executeQuery(sql.toString());
//			rs = stmt.executeQuery("select * from department");
//*******************************************************************************************

			System.out.println("부서번호\t 부서이름\t 상위부서번호\t 위치\t ");
			System.out.println("----------------------------------------------------");

//*******************************************************************************************
			// rs에서 자료 읽어와 출력하기
			while (rs.next()) {

				// 칼럼위치 1부터, 칼럼명
				int 	i = rs.getInt("deptno"); // ==rs.getInt(1);
				String s1 = rs.getString("dname");
				int 	j = rs.getInt("college");
				String s2 = rs.getString("loc");
//*******************************************************************************************

				System.out.printf("%6d \t %s \t %4d\t\t %4s\t\n", i,s1,j,s2);
			}

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
