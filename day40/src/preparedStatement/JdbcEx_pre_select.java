package preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcEx_pre_select {

	public static void main(String[] args) {

		StringBuffer sql = new StringBuffer();
		sql.append("select a.name,a.profno,a.position,b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno=b.deptno ");	// ����
		sql.append("and a.deptno=? ");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			// Ŀ�ؼ� ������
			con = ConnUtil.getConnection();
			
			// ���尴ü ����
			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(1, 203);
			rs=pstmt.executeQuery();
			System.out.println("  �̸�      ������ȣ                �����а�           ��å");
			System.out.println("================================================================");

			//while ����
			while(rs.next()) {
				System.out.println(rs.getString("name") + "\t");
				System.out.println(rs.getInt("profno") + "\t");
				System.out.println(rs.getString("dname") + "\t");
				System.out.println(rs.getString("position") + "\t");
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace()+","+e.getMessage());
			System.out.println("���� �Դϴ�.");

		} finally {

			try {if (pstmt != null)	pstmt.close();
			} catch (Exception e) {	e.getStackTrace();}

			try {if (con != null) con.close();
			} catch (Exception e) {e.getStackTrace();}

			try {if (rs != null) rs.close();
			} catch (Exception e) {e.getStackTrace();}

			}

		}

	}
