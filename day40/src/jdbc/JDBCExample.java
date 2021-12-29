package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCExample {

	public static void main(String[] args) {

		Connection conn = null; // 연결 객체

		try {
			// 드라이브 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결객체 얻기(url, id, pw)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

			System.out.println("데이터베이스에 접속 성공");

		} catch (Exception e) {
			System.out.println(e.getStackTrace() + "접속 실패");

		}

	}

}
