package thisEx11;

public class NewInstanceExample {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("thisEx11.SendAction");	// 해당 타입(클래스)알아보기
			Class clazz2 = Class.forName("thisEx11.ReceiveAction");
			// 동적으로 객체 생성
			// 코드 작성시에 클래스 이름을 결정할 수 없고, 런타임 시에 클래스 이름이 결정된 경우 사용
			Object obj = clazz.newInstance();
				
			Action action = (Action) clazz.newInstance();	// 객체를 얻어와서 본래 타입으로 변환
			Action action2 = (Action) clazz2.newInstance();

			action.execute();
			action2.execute();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}