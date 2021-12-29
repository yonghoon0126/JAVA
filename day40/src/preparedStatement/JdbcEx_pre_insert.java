package preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JdbcEx_pre_insert {

	public static void main(String[] args) {

		StringBuffer sql = new StringBuffer();
		sql.append("insert into professor ");
		sql.append("values(?,?,?,?,?,sysdate,?,?)"); // sysdate() - ���� ��¥ �������� �Լ�

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnUtil.getConnection();

			// PreparedStatement ��ü ������
			pstmt = con.prepareStatement(sql.toString());

			// �Ķ���� ����
			// ��ġ, ��
			pstmt.setInt(1, 9920);
			pstmt.setString(2, "ȫ�浿");
			pstmt.setString(3, "gildong");
			pstmt.setString(4, "���ӱ���");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 203);

			// ���� ����
			int i = pstmt.executeUpdate();
			System.out.println(i + " ���� ���� �߰� �Ǿ����ϴ�.");

		} catch (Exception e) {
			e.getStackTrace();

		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.getStackTrace();
			}

			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.getStackTrace();
			}

		}

	}

}
