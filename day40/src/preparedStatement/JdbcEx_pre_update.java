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
			
			// 커넥션 얻어오기
			con = ConnUtil.getConnection();
			
			// 문장객체 생성
			pstmt = con.prepareStatement(sql.toString());
			
			// 파라미터 세팅
			// 500,홍길동
			pstmt.setInt(1, 1500);
			pstmt.setString(2, "홍길동");
			
			// 쿼리 실행
			int i = pstmt.executeUpdate();
			System.out.println(i + " 개의 행이 변경 되었습니다.");
			
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace()+","+e.getMessage());
			System.out.println("오류 입니다.");
		
		}finally {
			try {if(pstmt !=null) pstmt.close();}
			catch (Exception e) {e.getStackTrace();}
			
			try {  if(con !=null)  con.close();	}
			catch (Exception e) {e.getStackTrace();	}
		}

	}

}