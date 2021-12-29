package propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import preparedStatement.ConnUtil;

//	- Properties�� �̿��� sql���� �غ���.
//	 sql���� ������ properties���Ͽ� �����ϰ�,
//	 Properties�� �̿��ؼ� properties������
//	 �о getProperty(String key)�� Ȱ���ؼ�
//	 ������ SQL���� ���� �� �ִ�.
//	 department.properties�� ������

public class Jdbc_properties_insert {

	public static void main(String[] args) throws FileNotFoundException, Exception {

		Properties pro = new Properties();
		pro.load(new FileInputStream("src/propertiesEx/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnUtil.getConnection();

			// department.properties�� ���ǵ�
			// sql�� �����ͼ� preparedstatment �����
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));

			// parameter(���ε� ������ �� �Ҵ��ϱ�) �����ϱ�
			pstmt.setInt(1, 105);
			pstmt.setString(2, "������а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5ȣ��");

			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� �߰� �Ǿ����ϴ�.");

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
