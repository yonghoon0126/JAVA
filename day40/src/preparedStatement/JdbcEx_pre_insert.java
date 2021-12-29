package preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JdbcEx_pre_insert {

	public static void main(String[] args) {

		StringBuffer sql = new StringBuffer();
		sql.append("insert into professor ");
		sql.append("values(?,?,?,?,?,sysdate,?,?)"); // sysdate() - 오늘 날짜 가져오는 함수

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnUtil.getConnection();

			// PreparedStatement 객체 얻어오기
			pstmt = con.prepareStatement(sql.toString());

			// 파라미터 세팅
			// 위치, 값
			pstmt.setInt(1, 9920);
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "gildong");
			pstmt.setString(4, "전임교수");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 203);

			// 쿼리 실행
			int i = pstmt.executeUpdate();
			System.out.println(i + " 개의 행이 추가 되었습니다.");

		} catch (Exception e) {
			e.getStackTrace();

		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.getStackTrace();
			}

			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.getStackTrace();
			}

		}

	}

}
