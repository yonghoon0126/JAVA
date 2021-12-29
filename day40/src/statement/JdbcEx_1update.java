package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx_1update {

// 203�� �˻��ؼ� '����������а�' --> '���ڰ���а�'�� ���� 
	public static void main(String[] args) {

		// Ŀ�ؼ� ����
		Connection con = null;

		// ���� ��ü ����
		Statement stmt = null;

		try {

			// ����̺� �ε�
			Class.forName("oracle.jdbc.OracleDriver");

			// Ŀ�ؼ� ������
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");

			// Statement��ü ���
			stmt = con.createStatement();
			
			// SQL �ۼ��ϱ�
			// update
			StringBuffer sql = new StringBuffer();
//			sql.append(" update department set dname='���ڰ���а�'" );
//			sql.append(" where deptno='203'" );
//			
//			String sql = "";
//			sql = "update department set dname='���ڰ���а�' where deptno='203'";
//
//			int result = stmt.executeUpdate(sql.toString());
//			System.out.println(result + " ���� ���� ���� �Ǿ����ϴ�.");
			
			// insert
//			sql.append("insert into department ");
//			sql.append("values(208, '����������а�',200,'7ȣ��') ");
//			int result = stmt.executeUpdate(sql.toString());
//			System.out.println(result + " ���� ���� ���� �Ǿ����ϴ�.");
			
			// delete
			sql.append(" delete department " );
			sql.append(" where deptno='203' " );
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + " ���� ���� ���� �Ǿ����ϴ�.");
			
			
		} catch (ClassNotFoundException e) {
			e.getStackTrace();

		} catch (SQLException e) {
			e.getStackTrace();

		} finally {
			
			try {
				
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
