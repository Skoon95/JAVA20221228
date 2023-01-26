package Ch22;

import java.sql.Connection;
import java.sql.DriverManager;

public class C01DBconn {

	public static void main(String[] args) {
		// 연결관련 정보 저장용 변수
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost/testDB"; //연결URL (DBMS마다 상이함)
		
		//DB연결객체 관련 참조변수
		Connection conn = null;         //DB연결객체용 참조변수
		PreparedStatement pstmt = null; //SQL쿼리 전송객체용 참조변수
		ResultSet rs = null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");  //1 드라이브 메모리 적재
		System.out.println("Driver Loading Success!!");
		conn = DriverManager.getConnection(url,id,pw); //2 DB 연결
		System.out.println("DB Connected.....");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {conn.close()};catch(Exception e) {e.printStackTrace();}
			
		}
	
	}

}
