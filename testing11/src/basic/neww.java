package basic;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class neww {
	
@BeforeClass

public void before() {
	System.out.println("before");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("before methid");
}
	@Test
	public void test() {
		System.out.println("test methid");
	}

}
