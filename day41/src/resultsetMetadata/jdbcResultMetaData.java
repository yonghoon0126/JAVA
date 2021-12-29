package resultsetMetadata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

//	- ResultSetMetaData : 
//	java.sql.ResultSetMetaData/java.sql.Types
//	MetaData는 데이터의 구성요소를 나타낸다. ResultSetMetaData는
//	ResultSet을 구성하는 모든 요소를 알아낼 수 있는 메소드를 제공한다.
import preparedStatement.ConnUtil;

public class jdbcResultMetaData {

	// 실행 select * from professor
	public static void main(String[] args) throws IOException, SQLException {

		// 키보드로 실행할 sql문장을 입력받는 입력장치 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("sql 입력 : ");
		String sql = br.readLine();
		Connection conn = ConnUtil.getConnection();

		PreparedStatement ptmt = conn.prepareStatement(sql);

		ResultSet rs = ptmt.executeQuery();

		// 쿼리 수행 결과 집합의 부가정보를 가지고 있는 ResultSetMetaData 얻기
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnType(6));	// 93
		System.out.println("컬럼의 갯수 : " + rsmd.getColumnCount());	// 8

		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnName(i) + "    ");
		}

		System.out.println("\n-----------------------------------------" 
		+ "-----------------------------------");

		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnTypeName(i) + "  ");
		}

		System.out.println();
		System.out.println();
		int 컬럼개수 = rsmd.getColumnCount();
		
		while (rs.next()) {
		
			for (int 컬럼번호 = 1; 컬럼번호 <= 컬럼개수; 컬럼번호++) {
				int 컬럼타입 = rsmd.getColumnType(컬럼번호);

				switch(컬럼타입) {

				case 2 : //Types.NUMERIC
					System.out.print(rs.getInt(컬럼번호) + "\t");
					break;

				case Types.VARCHAR:
					System.out.print(rs.getString(컬럼번호) + "\t");
					break;

				case Types.TIMESTAMP:	//93
					System.out.print(rs.getDate(컬럼번호) + "\t");
					break;

				default:
					break;

				}	// switch
			}	// for
			System.out.println();
		}	// while

	}

}
