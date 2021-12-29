package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//	1�ܰ� : Dirver �ε� Class.forName("oracle.jdbc.OracleDriver");
//	
//	2�ܰ� : DataBase ����
//		Connection con = DriverManager.getConnection
//		("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
//							ip�ּ�:��Ʈ��ȣ:��������, ������=user, ���
//	
//	3�ܰ� : Query�� �ۼ�
//	Statement stmt = con.createStatement();					// ����
//	PreparedStatement pstmt = con.preparedStatement(sql);	// ����
//	
//	4�ܰ� : ��� ���
//	ResultSet rs = stmt.excuteQuery("������");	// select
//	stmt.excuteUpdate("������");	// insert, delete, update
//	
//	5�ܰ� : resource ��� �� �ݱ�
//		con.close();
//		stmt.close();
//		rs.close();
//	
//	PreparedStatement ��ü�� ���� �� ���ε� ������ ���
//		String sql = "insert into department values(?,?,?,?)";
//		PrepararedStatement pstmt = con.preparedStatement(sql);
//		���ε� ������ ������ŭ ������� �ش� ������ ��ü�� ���� �������ش�.
//		pstmt.setInt(1,203);
//		pstmt.setInt(2,"��ǻ�Ͱ���");
//		pstmt.setInt(3,200);
//		pstmt.setInt(4,"4ȣ��");
//		���ε������� �÷����� ���� ��� �� �� ����.

//	-�⺻Ű(Primary key)
//		���̺��� �� ���� �ٸ� ��� ������ �ִ� ������ �ϴ� �ʵ�
//		���ϼ�, �ݵ�� ���� �־�� ��, �ߺ�x
//		��, not null, unique ���� ������ �����ؾ� �Ѵ�.
//		
//	-�ܷ�Ű=�ܺ�Ű(Foreign key)
//		�����̺��� �⺻Ű�� ���踦 ���� �ΰ��� ���̺��� �ִ� ��츦 ���Ѱ�.
//		�ܺ�Ű�� ���̺� ���� �� ���� �ʵ��� ���ÿ� �ٸ� ���̺�(�θ�)�� �⺻Ű�� ���� �ʵ带 ���Ѵ�.


// Driver�� �������ִ� class�����
public class ConnUtil {

	static {

		try {
			// ����̺� �ε�
			Class.forName("oracle.jdbc.OracleDriver");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");

	}

}
