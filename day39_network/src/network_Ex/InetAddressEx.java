package network_Ex;

import java.net.InetAddress;
import java.net.UnknownHostException;

//	*TCP : 신뢰 할 수 있다. 데이터 송수신 상태 점검
//			전화기 통신과 비슷, 부하가 많이 걸리고, 속도가 느리다.
//			관련 클래스 : InetAddress, Socket, ServerSocket
//	
//	*InetAddress : IP 주소를 표현한 클래스
//	자바에서는 모든 IP 주소를 InetAddress를 사용한다.
//	
//	-URL(Uniform Resource Locator) 인터넷에서 접근 가능한
//	자원의 주소를 표현할 수 있는 형식을 말한다.
//	http://www.naver.com:80/member/mem.jsp?name=kimbaa#content
//	protocal	host	port path		?=query			reference
//	
//	-URLConnection 클래스는 원격 지원에 접근하는데 필요한 정보를 갖고 있다.
//	필요한 정보 : 원격 서버의 헤더 정보, 해당 자원의 길이와 타입 정보, 언어 등을 얻을 수 있다.
//	url클래스는 원격 서버 자원의 결과만을 가져오지만, URLConnection클래스는 원격 서버 자원의
//	결과와 원격 서버의 헤더 정보를 가져 올 수 있다.

public class InetAddressEx {

	public static void main(String[] args) {

		// InetAddress는 ip정보와 host정보(이름)를 가지는 객체
		// InetAddress객체는 생성자가 아닌 static메소드를 이용해서 생성한다.

		try {
			// host이름에 해당하는 ip정보를 가진 InetAddress객체 얻기
			InetAddress ipInfo1 = InetAddress.getByName("www.daum.net");

			// ip 주소 얻기
			String ip = ipInfo1.getHostAddress();
			System.out.println("ip 주소 : " + ip);	// ip 주소 : 211.231.99.80

			// host 이름에 해당하는 ip정보를 가진 모든 InetAddress객체 얻기
			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");

			for (InetAddress tempip : ipArray) {
				System.out.println(tempip);	// www.daum.net/211.231.99.80
			}

			// 현재 컴퓨터의 ip정보를 가진 InetAddress 객체 얻기
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("host : " + myHost.getHostName());	// host : manic-063
			System.out.println("host Ip : " + myHost.getHostAddress());	// host Ip : 172.30.1.211

		} catch (UnknownHostException e) {
			// host이름에 해당하는 host를 찾지 못했을 경우 예외처리
			e.printStackTrace();
		}

	}

}

