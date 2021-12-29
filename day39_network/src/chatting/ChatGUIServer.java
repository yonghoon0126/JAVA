package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

//	* 채팅 방식
//	unicasting = 1 : 1
//	broadcasting = 방송국
//	multicasting = n : n

//===================================================================================

public class ChatGUIServer {

	ServerSocket ss;
	Socket s;
	Vector v;

	public ChatGUIServer() {
		v = new Vector();
	}

	public void addThread(ServerThread st) {
		v.addElement(st);
	}

	public void removeThread(ServerThread st) {
		v.removeElement(st);
	}

	public void broadcast(String str) {
		for (int i = 0; i < v.size(); i++) {
			ServerThread st = (ServerThread) v.elementAt(i);
			st.send(str);
		}
	}

	public void go() {

		try {
			ss = new ServerSocket(5555);
			System.out.println("서버 가동");

			while (true) {
				s = ss.accept();
				ServerThread st = new ServerThread(this, s);
				addThread(st);
				st.start();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

//===================================================================================

	public static void main(String[] args) {

		ChatGUIServer cs = new ChatGUIServer();
		cs.go();
	}
}

//===================================================================================

// Thread
class ServerThread extends Thread {

	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChatGUIServer cg;
	String str;
	String name;
	InetAddress ip;

	public ServerThread(ChatGUIServer cg, Socket s) {

		this.cg = cg;
		this.s = s;
		ip = s.getInetAddress();
		System.out.println(ip + "가 접속하였습니다.");

		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(), true);

		} catch (IOException ioe) {
			ioe.getMessage();
		}
	}

	
	public void send(String str) {
		pw.println(str);
	}

	
	public void run() {

		try {
			name = br.readLine();
			cg.broadcast("[" + name + "] 님이 입장하셨습니다.");
			
			while ((str = br.readLine()) != null) {
				cg.broadcast("[" + name + "] " + str);
			}

		} catch (IOException ioe) {
			cg.removeThread(this);
			cg.broadcast("[" + name + "] 님이 나갔습니다");
			System.out.println(ip + "의 연결이 종료되었습니다.");
		}
	}
};// server end