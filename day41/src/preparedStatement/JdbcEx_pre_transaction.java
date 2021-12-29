package preparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//	-Transaction 
//		Transaction 여러개의 작업을 하나의 논리적인 작업 단위로 묶어주는 것을 말한다.
//		하나의 작업 단위내의 전체 작업들이 모두 올바르게 수행되거나,
//		또는 전체 작업이 모두 수행되지 않도록 한다.
//		
//	-Connection의 Transaction관련 메소드
//		void commit()		: 트랜잭션으로 설정된 모든 자원을 db에 반영한다.
//		void rollback()		: 현재 트랜잭션에 설정내의 모든 작업을 되돌린다.
//		void rollback(Savepoint s)		: Savepoint설정 이후의 모든 작업을 되돌림
//		void setSavepoint(String name)	: 현재의 트랜잭션내의 Savepoin를 설정
//		void setAutoCommit(boolean value)	: auto-commit기능을 설정한다.

public class JdbcEx_pre_transaction {

	public static void main(String[] args) {
		
//		 transaction : 논리적인 작업단위
//		 insert, delete, update등의 작업들을 하나의 논리적인 작업단위로
//		 묶어서 쿼리 실행 시 모든 작업이 정상처리된 경우에 commit을
//		 실행해서 db에 반영하고, 쿼리실행 중 하나라도 정상처리되지 않은 경우
//		 rollback을 실행해서 작업단위내의 모든 작업을 취소한다.
		
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

			// ---------transaction 시작--------------
			// 하나의 논리적인 작업단위 시작
			con = ConnUtil.getConnection();
			

//********************************************************************************
			// autoCommit기능 비활성화 시킨다.
			con.setAutoCommit(false);
//********************************************************************************

			
			// ---------1번 작업 시작(insert)--------------
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 200);
			pstmt.setString(2, "또나야 나");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "10호관");
			pstmt.executeUpdate();
			// ---------1번 작업 종료--------------

			
			// ---------2번 작업 시작(update)--------------
			pstmt = con.prepareStatement(sql2.toString());
			pstmt.setString(1, "전자계산학과");
			pstmt.setString(2, "7호관");
			pstmt.setInt(3, 101);
			pstmt.executeUpdate();
			// ---------2번 작업 종료--------------

			
			// 쿼리가 정상적으로 실행된 경우에 db에 반영
			con.commit(); // 실행 완료
			System.out.println("db에 반영됨...");
			// ---------transaction 종료--------------

		} catch (SQLException e) {
			
			try {
				con.rollback(); // 실행 취소
				System.out.println("db에 반영 취소...");
			
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
