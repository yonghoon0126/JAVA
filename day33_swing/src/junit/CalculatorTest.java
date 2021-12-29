package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator obj;
	// @Test�� �پ� �ִ� �޼ҵ带 ���� �� ����
	// ��ü ����, �ʱ�ȭ�� ���, �ݵ�� public�̿��� ��
	
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

		// ��밪, ������ ��ȯ�� ==> �ΰ��� ���ƾ� ����
		assertEquals(5*2, obj.mul(5, 4));
	}
	
	@Test
	public void testDiv() {
		System.out.println("div...");
		assertEquals(1/4, obj.div(1, 4));
	}
	
	
	
}
