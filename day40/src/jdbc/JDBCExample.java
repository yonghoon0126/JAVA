package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCExample {

	public static void main(String[] args) {

		Connection conn = null; // ���� ��ü

		try {
			// ����̺� �ε�
			Class.forName("oracle.jdbc.OracleDriver");

			// ���ᰴü ���(url, id, pw)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

			System.out.println("�����ͺ��̽��� ���� ����");

		} catch (Exception e) {
			System.out.println(e.getStackTrace() + "���� ����");

		}

	}

}
