package preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JdbcEx_pre_update {

	public static void main(String[] args) {
		StringBuffer sql=new StringBuffer();
		sql.append("update  professor ");
		sql.append("set sal=? where name=?");
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			
			// Ŀ�ؼ� ������
			con = ConnUtil.getConnection();
			
			// ���尴ü ����
			pstmt = con.prepareStatement(sql.toString());
			
			// �Ķ���� ����
			// 500,ȫ�浿
			pstmt.setInt(1, 1500);
			pstmt.setString(2, "ȫ�浿");
			
			// ���� ����
			int i = pstmt.executeUpdate();
			System.out.println(i + " ���� ���� ���� �Ǿ����ϴ�.");
			
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace()+","+e.getMessage());
			System.out.println("���� �Դϴ�.");
		
		}finally {
			try {if(pstmt !=null) pstmt.close();}
			catch (Exception e) {e.getStackTrace();}
			
			try {  if(con !=null)  con.close();	}
			catch (Exception e) {e.getStackTrace();	}
		}

	}

}