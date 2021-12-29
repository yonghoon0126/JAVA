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

			// department.properties�� ���ǵ�
			// sql�� �����ͼ� preparedstatment �����
			pstmt = con.prepareStatement(pro.getProperty("department_update"));

			// parameter(���ε� ������ �� �Ҵ��ϱ�) �����ϱ�
			pstmt.setString(1, "9ȣ��");
			pstmt.setInt(2, 101);

			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� ���� �Ǿ����ϴ�.");

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
