package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator obj;
	// @Test가 붙어 있는 메소드를 실행 전 실행
	// 객체 생성, 초기화에 사용, 반드시 public이여야 함
	
	@Before
	public void prepare() {
		System.out.println("Prepare...");
		obj = new Calculator();
	}
	
	@Test
	public void testAdd() {
		System.out.println("add...");
		assertEquals(2, obj.add(1, 1));
	}
	
	@Test
	public void testSub() {
		System.out.println("sub...");
		assertEquals(0, obj.sub(1, 1));
	}
	
	@Test
	public void testMul() {
		System.out.println("mul...");

		// 기대값, 실제로 반환값 ==> 두값이 같아야 성공
		assertEquals(5*2, obj.mul(5, 4));
	}
	
	@Test
	public void testDiv() {
		System.out.println("div...");
		assertEquals(1/4, obj.div(1, 4));
	}
	
	
	
}
