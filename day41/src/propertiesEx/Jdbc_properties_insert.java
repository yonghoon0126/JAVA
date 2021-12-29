package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import preparedStatement.ConnUtil;

//	- Properties를 이용한 sql문을 해보자.
//	 sql문을 별도의 properties파일에 정의하고,
//	 Properties를 이용해서 properties파일을
//	 읽어서 getProperty(String key)를 활용해서
//	 각각의 SQL문을 얻을 수 있다.
//	 department.properties를 만들자

public class Jdbc_properties_insert {

	public static void main(String[] args) throws FileNotFoundException, Exception {

		Properties pro = new Properties();
		pro.load(new FileInputStream("src/propertiesEx/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnUtil.getConnection();

			// department.properties에 정의된
			// sql를 가져와서 preparedstatment 만들기
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));

			// parameter(바인딩 변수에 값 할당하기) 세팅하기
			pstmt.setInt(1, 105);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");

			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 추가 되었습니다.");

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
