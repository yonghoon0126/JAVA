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
//	MetaData�� �������� ������Ҹ� ��Ÿ����. ResultSetMetaData��
//	ResultSet�� �����ϴ� ��� ��Ҹ� �˾Ƴ� �� �ִ� �޼ҵ带 �����Ѵ�.
import preparedStatement.ConnUtil;

public class jdbcResultMetaData {

	// ���� select * from professor
	public static void main(String[] args) throws IOException, SQLException {

		// Ű����� ������ sql������ �Է¹޴� �Է���ġ ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("sql �Է� : ");
		String sql = br.readLine();
		Connection conn = ConnUtil.getConnection();

		PreparedStatement ptmt = conn.prepareStatement(sql);

		ResultSet rs = ptmt.executeQuery();

		// ���� ���� ��� ������ �ΰ������� ������ �ִ� ResultSetMetaData ���
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnType(6));	// 93
		System.out.println("�÷��� ���� : " + rsmd.getColumnCount());	// 8

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
		int �÷����� = rsmd.getColumnCount();
		
		while (rs.next()) {
		
			for (int �÷���ȣ = 1; �÷���ȣ <= �÷�����; �÷���ȣ++) {
				int �÷�Ÿ�� = rsmd.getColumnType(�÷���ȣ);

				switch(�÷�Ÿ��) {

				case 2 : //Types.NUMERIC
					System.out.print(rs.getInt(�÷���ȣ) + "\t");
					break;

				case Types.VARCHAR:
					System.out.print(rs.getString(�÷���ȣ) + "\t");
					break;

				case Types.TIMESTAMP:	//93
					System.out.print(rs.getDate(�÷���ȣ) + "\t");
					break;

				default:
					break;

				}	// switch
			}	// for
			System.out.println();
		}	// while

	}

}
