package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {

	public static void main(String[] args) {

		Connection conn = null;// 연결객체

		// 문장객체 선언
		Statement stmt = null;

		// ResultSet 선언
		ResultSet rs = null;
		String sql = "",sql2="";

		try {
			// 드라이브 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결객체 얻기(url, id, pw)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

			// 문장객체 얻기
			// 조작어(DML)(insert, delete,update), 질의어=검색=조회(select)
			// 문장객체 생성(정적) CRUD/ executeUpdate():삽입/삭제/수정
			stmt = conn.createStatement();

			// 검색=추출
			sql = "select * from goodsinfo";
			
			// 삽입
//			sql2 = "insert into goodsinfo values('10006','벽결이 에어컨',400000,'삼성')";
//			
//			int no = stmt.executeUpdate(sql2);
//			System.out.println(no + "1줄이 삽입 되었습니다.");

			// 수정
//			sql2 = "update goodsinfo set name='디지털 TV' where code='10001'";
//			sql2 = "update goodsinfo set name='다이어리' where maker='아이리버'";
//			
//			int no = stmt.executeUpdate(sql2);
//			System.out.println(no + "1줄이 수정 되었습니다.");
					
			// 삭제
			sql2="delete goodsinfo where code=10007";    
			
			int no = stmt.executeUpdate(sql2);
			System.out.println(no + "1줄이 삭제 되었습니다.");
			

			// ResultSet 얻기
			// 결과가 여러개 또는 없을 수도 있다.
			// 검색과정을 실행해서 디비에 저장해 놓음
			rs = stmt.executeQuery(sql);

			// 제목출력
			System.out.println("상품코드\t  상품명\t	가격 		제조사");
			System.out.println("--------------------------------------");

			// rs에서 자료읽어와 출력하기
			while (rs.next()) {

				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");

				// 한 레코드 출력
				System.out.printf("%5s %s \t %-8d %-10s %n", code, name, price, maker);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
			e.getStackTrace();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.getStackTrace();

		} finally {

			try {// 커넥션객체 자원 반환

				if (conn != null) {
					conn.close();
				}
				// 문장객체 자원 반환

				if (stmt != null) {
					stmt.close();
				}

			} catch (Exception e) {
			}
		}
	}
}