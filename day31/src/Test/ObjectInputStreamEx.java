package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//	ObjectOutputStream	직렬화	: 일련된 바이트로 전송	
//	ObjectInputStream	역직렬화	: 원래 자료형으로 변환
//		- 객체의 직렬화
//			가상머신 안에 존재하는 특정 객체(객체의 메모리와 객체에 대한 정보)를 순차적인 
//			바이트 형태로 변환하는 것
//			객체의 직렬화를 통해 프로그램이 실행되는 동안 생성된 객체를 스트림을 이용해서
//			지속적으로 보관하거나 전송 할 수 있다.
//		- 직렬화 가능한 클래스를 만드는 방법
//			1) Serializable 인터페이스를 이용
//			2) Externalizable 인터페이스를 이용

public class ObjectInputStreamEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		ObjectInputStream ois = null;

		try {
//			파일에 저장된 객체를 읽어들이기 위해
//			ObjectInputStream 객체 생성
//			역직렬화 : 원래 자료형으로 변환
//			역직렬화할 때 필요한 클래스 파일을 찾지 못할 경우
//			ClassNotFoundException을 발생시킨다
			
			ois = new ObjectInputStream(new FileInputStream("src/Test/test.txt"));
			Data data = (Data) ois.readObject();	// 원래 데이터로 변환
			
			System.out.println(data + "\n-----------------");
			System.out.println("번호 : "+ data.getNo());
			System.out.println("이름 : "+ data.getName());
			System.out.println("메일 : "+ data.getMail());
			
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
