package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import preparedStatement.ConnUtil;

public class Jdbc_properties_select {

	public static void main(String[] args) throws FileNotFoundException, Exception {

		Properties pro = new Properties();
		pro.load(new FileInputStream("src/propertiesEx/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = ConnUtil.getConnection();

			// department.properties에 정의된
			// sql를 가져와서 preparedstatment 만들기
			pstmt = con.prepareStatement(pro.getProperty("department_select"));
			pstmt.setInt(1, 200);

			rs = pstmt.executeQuery();
			System.out.println("부서번호 부서이름 상위부서번호 위치");
			System.out.println("---------------------------------------------");

			// while 실행
			while (rs.next()) {
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getInt("college") + "\t");
				System.out.print(rs.getString("loc") + "\t");
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace() + "," + e.getMessage());
			System.out.println("오류 입니다.");
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();

			} catch (SQLException e) {
				System.out.println(e.getStackTrace());
			}

			try {
				if (con != null)
					con.close();

			} catch (SQLException e) {
				System.out.println(e.getStackTrace());
			}

			try {
				if (rs != null)
					rs.close();

			} catch (SQLException e) {
				e.getStackTrace();
				System.out.println(e.getStackTrace());
			}
		}

	}

}
