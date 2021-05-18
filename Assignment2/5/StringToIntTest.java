import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringToIntTest{

	private StringToInt sti;
	
	@BeforeEach
    void initialize() {
        this.sti = new StringToInt();
    }


    @Test
    void test1() {
	    // Test Path: 1,2,3
        Assertions.assertEquals(0, sti.myAtoi(""));
    }
	
	@Test
    void test2() {
	    // Test Path: 1,2,4,5,4,6,8,9,11,8,12
        Assertions.assertEquals(1, sti.myAtoi(" 1"));
    }
	
	@Test
    void test3() {
	    // Test Path: 1,2,4,5,4,6,7,8,12
        Assertions.assertEquals(0, sti.myAtoi(" -t"));
    }
	
	@Test
    void test4() {
	    // Test Path: 1,2,4,5,4,6,8,12
        Assertions.assertEquals(0, sti.myAtoi(" t"));
    }
	
	@Test
    void test5() {
	    // Test Path: 1,2,4,5,4,6,7,8,9,11,8,9,....,11,8,9,10
        Assertions.assertEquals(Integer.MAX_VALUE, sti.myAtoi(" +21474836471"));
    }
}