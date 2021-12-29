package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx_1Insert {

	public static void main(String[] args) {

		// Ŀ�ؼ� ����
		Connection con = null;

		// ���� ��ü ����
		Statement stmt = null;

		// try-catch
		try {
			// ����̺� �ε�
			Class.forName("oracle.jdbc.OracleDriver");

			// Ŀ�ؼ� ������
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");

			// Statement��ü ���
			stmt = con.createStatement();

			// SQL �ۼ��ϱ�
			StringBuffer sql = new StringBuffer();
			sql.append("insert into department ");
			sql.append("values(101, '����������а�',200,'1ȣ��') ");

			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + "���� ���� �߰��Ǿ����ϴ�.");

		} catch (ClassNotFoundException e) {
			e.getStackTrace();

		} catch (SQLException e) {
			e.getStackTrace();

		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.getStackTrace();
			}
		}

	}

}
