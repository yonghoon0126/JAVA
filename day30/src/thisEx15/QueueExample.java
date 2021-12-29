package thisEx15;

//	front / head (��, ����), poll()
//	tail / rear (��, ����), offer()

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<Message> messageQueue = new LinkedList<Message>();
//		LinkedList : Queue, List���� ��� ����
		
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKakaotalk", "ȫ�β�"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();

			switch (message.command) {
			
			case "sendMail":
				System.out.println(message.to  + "�Կ��� ������ �����ϴ�.");
				// ȫ�浿�Կ��� ������ �����ϴ�.
				break;
			
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				// �ſ�ǴԿ��� SMS�� �����ϴ�.
				break;
			
			case "sendKakaotalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				// ȫ�β��Կ��� īī������ �����ϴ�.
				break;

			}
		}

	}

}

