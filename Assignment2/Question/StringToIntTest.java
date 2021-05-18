public class StringToIntTest{

	private StringToInt sti;
	
	@BeforeEach
    void initialize() {
        this.sti = new StringToInt();
    }


    @Test
    void test1() {
        int result = sti.myAtoi("42");
        Assertions.assertEquals(42, result);
    }
	
	@Test
	 void test2() {
        int result = sti.myAtoi("4193 with words");
        Assertions.assertEquals(4193, result);
    }
	
	@Test
	 void test3() {
        int result = sti.myAtoi("   -12");
        Assertions.assertEquals(-12, result);
    }
	
	@Test
    void test4() {
        int result = sti.myAtoi("2140500321");
        Assertions.assertEquals(2140500321, result);
    }
	
	@Test
    void test5() {
        int result = sti.myAtoi("-21405021");
        Assertions.assertEquals(-21405021, result);
    }
	





}