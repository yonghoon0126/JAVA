package network_Ex;

import java.net.InetAddress;
import java.net.UnknownHostException;

//	*TCP : �ŷ� �� �� �ִ�. ������ �ۼ��� ���� ����
//			��ȭ�� ��Ű� ���, ���ϰ� ���� �ɸ���, �ӵ��� ������.
//			���� Ŭ���� : InetAddress, Socket, ServerSocket
//	
//	*InetAddress : IP �ּҸ� ǥ���� Ŭ����
//	�ڹٿ����� ��� IP �ּҸ� InetAddress�� ����Ѵ�.
//	
//	-URL(Uniform Resource Locator) ���ͳݿ��� ���� ������
//	�ڿ��� �ּҸ� ǥ���� �� �ִ� ������ ���Ѵ�.
//	http://www.naver.com:80/member/mem.jsp?name=kimbaa#content
//	protocal	host	port path		?=query			reference
//	
//	-URLConnection Ŭ������ ���� ������ �����ϴµ� �ʿ��� ������ ���� �ִ�.
//	�ʿ��� ���� : ���� ������ ��� ����, �ش� �ڿ��� ���̿� Ÿ�� ����, ��� ���� ���� �� �ִ�.
//	urlŬ������ ���� ���� �ڿ��� ������� ����������, URLConnectionŬ������ ���� ���� �ڿ���
//	����� ���� ������ ��� ������ ���� �� �� �ִ�.

public class InetAddressEx {

	public static void main(String[] args) {

		// InetAddress�� ip������ host����(�̸�)�� ������ ��ü
		// InetAddress��ü�� �����ڰ� �ƴ� static�޼ҵ带 �̿��ؼ� �����Ѵ�.

		try {
			// host�̸��� �ش��ϴ� ip������ ���� InetAddress��ü ���
			InetAddress ipInfo1 = InetAddress.getByName("www.daum.net");

			// ip �ּ� ���
			String ip = ipInfo1.getHostAddress();
			System.out.println("ip �ּ� : " + ip);	// ip �ּ� : 211.231.99.80

			// host �̸��� �ش��ϴ� ip������ ���� ��� InetAddress��ü ���
			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");

			for (InetAddress tempip : ipArray) {
				System.out.println(tempip);	// www.daum.net/211.231.99.80
			}

			// ���� ��ǻ���� ip������ ���� InetAddress ��ü ���
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("host : " + myHost.getHostName());	// host : manic-063
			System.out.println("host Ip : " + myHost.getHostAddress());	// host Ip : 172.30.1.211

		} catch (UnknownHostException e) {
			// host�̸��� �ش��ϴ� host�� ã�� ������ ��� ����ó��
			e.printStackTrace();
		}

	}

}

