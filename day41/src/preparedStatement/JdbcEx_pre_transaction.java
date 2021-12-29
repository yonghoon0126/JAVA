package preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//	-Transaction 
//		Transaction �������� �۾��� �ϳ��� ������ �۾� ������ �����ִ� ���� ���Ѵ�.
//		�ϳ��� �۾� �������� ��ü �۾����� ��� �ùٸ��� ����ǰų�,
//		�Ǵ� ��ü �۾��� ��� ������� �ʵ��� �Ѵ�.
//		
//	-Connection�� Transaction���� �޼ҵ�
//		void commit()		: Ʈ��������� ������ ��� �ڿ��� db�� �ݿ��Ѵ�.
//		void rollback()		: ���� Ʈ����ǿ� �������� ��� �۾��� �ǵ�����.
//		void rollback(Savepoint s)		: Savepoint���� ������ ��� �۾��� �ǵ���
//		void setSavepoint(String name)	: ������ Ʈ����ǳ��� Savepoin�� ����
//		void setAutoCommit(boolean value)	: auto-commit����� �����Ѵ�.

public class JdbcEx_pre_transaction {

	public static void main(String[] args) {
		
//		 transaction : ������ �۾�����
//		 insert, delete, update���� �۾����� �ϳ��� ������ �۾�������
//		 ��� ���� ���� �� ��� �۾��� ����ó���� ��쿡 commit��
//		 �����ؼ� db�� �ݿ��ϰ�, �������� �� �ϳ��� ����ó������ ���� ���
//		 rollback�� �����ؼ� �۾��������� ��� �۾��� ����Ѵ�.
		
		StringBuffer sql1 = new StringBuffer();
		StringBuffer sql2 = new StringBuffer();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?) ");

		sql2.append("update department ");
		sql2.append("set dname=?, loc=? ");
		sql2.append("where deptno=? ");

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			// ---------transaction ����--------------
			// �ϳ��� ������ �۾����� ����
			con = ConnUtil.getConnection();
			

//********************************************************************************
			// autoCommit��� ��Ȱ��ȭ ��Ų��.
			con.setAutoCommit(false);
//********************************************************************************

			
			// ---------1�� �۾� ����(insert)--------------
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 200);
			pstmt.setString(2, "�ǳ��� ��");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "10ȣ��");
			pstmt.executeUpdate();
			// ---------1�� �۾� ����--------------

			
			// ---------2�� �۾� ����(update)--------------
			pstmt = con.prepareStatement(sql2.toString());
			pstmt.setString(1, "���ڰ���а�");
			pstmt.setString(2, "7ȣ��");
			pstmt.setInt(3, 101);
			pstmt.executeUpdate();
			// ---------2�� �۾� ����--------------

			
			// ������ ���������� ����� ��쿡 db�� �ݿ�
			con.commit(); // ���� �Ϸ�
			System.out.println("db�� �ݿ���...");
			// ---------transaction ����--------------

		} catch (SQLException e) {
			
			try {
				con.rollback(); // ���� ���
				System.out.println("db�� �ݿ� ���...");
			
			} catch (SQLException e2) {
				e2.printStackTrace();
			}

		} finally {
			
			try {
				if (pstmt != null) 
					pstmt.close(); 	
				} catch (Exception e) {
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
			}

		}

	}
}
