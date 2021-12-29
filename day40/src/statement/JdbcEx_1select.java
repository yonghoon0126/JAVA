package statement;

//	*ResultSet : select query�� �������� ����� ��������� �߻�ȭ�Ѱ��̴�.
//	*ResultSet�� ��� ���տ��� data�� ������ �� �ִ� �پ��� �޼ҵ�� Cursor�� �����ϰ� ����.
//	
//	*boolean 	first():
//				last():
//				next():
//				previous():
//	
//	int			getInt(int �÷��� ����)	// Į���� ������ ������ 1���� ����
//	int	 		getInt(String �÷��̸�) // "Į���̸�"
//	
//	String 		getString(int �÷��� ����)
//	ResultSet 	getString(String �÷��̸�)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx_1select {

	public static void main(String[] args) {

		// Ŀ�ؼ� ����
		Connection con = null;

		// ���� ��ü ����
		Statement stmt = null;

//*******************************************************************************************
		// Resultset ���� = Ŀ�� ������
		ResultSet rs = null;
//*******************************************************************************************

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

			sql.append("select * ");
			sql.append("from department ");

//*******************************************************************************************
			// ResultSet ��� - executeQuery�߿���
			rs = stmt.executeQuery(sql.toString());
//			rs = stmt.executeQuery("select * from department");
//*******************************************************************************************

			System.out.println("�μ���ȣ\t �μ��̸�\t �����μ���ȣ\t ��ġ\t ");
			System.out.println("----------------------------------------------------");

//*******************************************************************************************
			// rs���� �ڷ� �о�� ����ϱ�
			while (rs.next()) {

				// Į����ġ 1����, Į����
				int 	i = rs.getInt("deptno"); // ==rs.getInt(1);
				String s1 = rs.getString("dname");
				int 	j = rs.getInt("college");
				String s2 = rs.getString("loc");
//*******************************************************************************************

				System.out.printf("%6d \t %s \t %4d\t\t %4s\t\n", i,s1,j,s2);
			}

		} catch (ClassNotFoundException e) {
			e.getStackTrace();

		} catch (SQLException e) {
			e.getStackTrace();

		} finally {

			try {

				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.getStackTrace();
			}
		}

	}

}
