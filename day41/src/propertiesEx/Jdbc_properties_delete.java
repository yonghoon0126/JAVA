package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import preparedStatement.ConnUtil;

public class Jdbc_properties_delete {

	public static void main(String[] args) throws FileNotFoundException, Exception {

		Properties pro = new Properties();
		pro.load(new FileInputStream("src/propertiesEx/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = ConnUtil.getConnection();

			// department.properties�� ���ǵ�
			// sql�� �����ͼ� preparedstatment �����
			pstmt = con.prepareStatement(pro.getProperty("department_delete"));

			// parameter(���ε� ������ �� �Ҵ��ϱ�) �����ϱ�
			pstmt.setInt(1, 105);

			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� �����Ǿ����ϴ�.");

		} catch (Exception e) {
			System.out.println(e.getStackTrace() + "," + e.getMessage());

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
				System.out.println(e.getStackTrace() + "," + e.getMessage());
			}
		}

	}

}
