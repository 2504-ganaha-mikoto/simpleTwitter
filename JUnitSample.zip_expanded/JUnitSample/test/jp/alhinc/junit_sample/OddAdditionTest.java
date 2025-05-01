package jp.alhinc.junit_sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddAdditionTest {

	/**
	 * 奇数
	 */
	@Test
	public void testOdd() {
		assertEquals(3, OddAddition.checkOdd(3));
	}

	/**
	 * 偶数
	 */
	@Test
	public void testEven() {
		assertEquals(0, OddAddition.checkOdd(2));
	}

}
