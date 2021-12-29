package Test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {

		ObjectOutputStream oos = null;

		try {
//			메모리에 생성된 객체를 직렬화 해서 스트림을 통해
//			기록할 수 있는 ObjectOutputStream 객체 생성
//			ObjectOutputStream을 통해서 직렬화된 후 파일로 기록된 Data
//			객체생성 Data클래스는 반드시 Serializable을 구현하고 있어야 한다.
			
			oos = new ObjectOutputStream
					(new FileOutputStream("src/Test/test.txt"));
					// 파일유무 상관없음, 새로만들거나 덮어쓰기함

			Data data = new Data(); // 직렬화 할 객체 생성
			data.setNo(25);
			data.setName("홍길동");
			data.setMail("hong@naver.com");

			oos.writeObject(data); // 직렬화 된 데이터(test.txt)에 저장
			// ObjectOutputStream을 객체를 직렬화해서 스트림을
			// 통해 기록할 수 있는 writeObject()을 제공한다.

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}

	}

}
