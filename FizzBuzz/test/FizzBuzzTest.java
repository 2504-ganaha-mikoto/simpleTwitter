import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//		System.out.println("setUpBeforeClass");
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//		System.out.println("tearDownAfterClass");
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//		System.out.println("setUp");
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//		System.out.println("tearDown");
//	}

	@Test
	//戻り値はなし
	void testCheckFizzBuzz_isInt9() {
		//assertEquals(期待した値,実際の値)　FizzBuzzのクラスのcheckFizzBuzzメソッドに引数9を代入
		//3の倍数→FizzならOK
        System.out.println("isInt_09");
		assertEquals("Fizz", FizzBuzz.checkFizzBuzz(9));
	}

	@Test
	void testCheckFizzBuzz_intIs20() {
		//assertEquals(期待した値,実際の値)　FizzBuzzのクラスのcheckFizzBuzzメソッドに引数20を代入
		//5の倍数→FizzならOK
        System.out.println("isInt_20");
		assertEquals("Buzz", FizzBuzz.checkFizzBuzz(20));
	}

	@Test
	void testCheckFizzBuzz_intIs45() {
		//3と5の倍数→FizzBuzzならOK
        System.out.println("isInt_45");
		assertEquals("Fizz Buzz", FizzBuzz.checkFizzBuzz(45));
	}

	@Test
	void testCheckFizzBuzz_intIs44() {
		//どの倍数でもない→そのまままの数字ならOK
        System.out.println("isInt_44");
		assertEquals("44", FizzBuzz.checkFizzBuzz(44));
	}

	@Test
	void testCheckFizzBuzz_intIs46() {
		//どの倍数でもない→そのまままの数字ならOK
        System.out.println("isInt_46");
		assertEquals("46", FizzBuzz.checkFizzBuzz(46));
	}

	//nullの場合も入れる？？Stringの場合は？？doubleの場合は？？
}
