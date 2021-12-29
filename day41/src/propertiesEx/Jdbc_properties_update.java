package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import preparedStatement.ConnUtil;

public class Jdbc_properties_update {

	public static void main(String[] args) throws FileNotFoundException, Exception {

		Properties pro = new Properties();
		pro.load(new FileInputStream("src/propertiesEx/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnUtil.getConnection();

			// department.properties에 정의된
			// sql를 가져와서 preparedstatment 만들기
			pstmt = con.prepareStatement(pro.getProperty("department_update"));

			// parameter(바인딩 변수에 값 할당하기) 세팅하기
			pstmt.setString(1, "9호관");
			pstmt.setInt(2, 101);

			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 수정 되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();

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
		}

	}

}
