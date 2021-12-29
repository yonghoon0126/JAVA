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

			// department.properties�� ���ǵ�
			// sql�� �����ͼ� preparedstatment �����
			pstmt = con.prepareStatement(pro.getProperty("department_select"));
			pstmt.setInt(1, 200);

			rs = pstmt.executeQuery();
			System.out.println("�μ���ȣ �μ��̸� �����μ���ȣ ��ġ");
			System.out.println("---------------------------------------------");

			// while ����
			while (rs.next()) {
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getInt("college") + "\t");
				System.out.print(rs.getString("loc") + "\t");
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace() + "," + e.getMessage());
			System.out.println("���� �Դϴ�.");
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
