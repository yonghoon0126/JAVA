package preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcEx_pre_select {

	public static void main(String[] args) {

		StringBuffer sql = new StringBuffer();
		sql.append("select a.name,a.profno,a.position,b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno=b.deptno ");	// 조인
		sql.append("and a.deptno=? ");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			// 커넥션 얻어오기
			con = ConnUtil.getConnection();
			
			// 문장객체 생성
			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(1, 203);
			rs=pstmt.executeQuery();
			System.out.println("  이름      교수번호                전공학과           직책");
			System.out.println("================================================================");

			//while 실행
			while(rs.next()) {
				System.out.println(rs.getString("name") + "\t");
				System.out.println(rs.getInt("profno") + "\t");
				System.out.println(rs.getString("dname") + "\t");
				System.out.println(rs.getString("position") + "\t");
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace()+","+e.getMessage());
			System.out.println("오류 입니다.");

		} finally {

			try {if (pstmt != null)	pstmt.close();
			} catch (Exception e) {	e.getStackTrace();}

			try {if (con != null) con.close();
			} catch (Exception e) {e.getStackTrace();}

			try {if (rs != null) rs.close();
			} catch (Exception e) {e.getStackTrace();}

			}

		}

	}
