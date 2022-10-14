package itestlinteners;

import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ItestListernersDemo.class)
public class TestCasesWithItestListners {
	
	@Test
	public void test1() {
		System.out.println("Test method --- 1 ");
	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("Test method --- 2 ");
	}
	@Test
	public void test3() {
		int a = 9/0;
		System.out.println("Test method --- 3 ");
	}
	@Test
	public void test4() {
		System.out.println("Test method --- 4 ");
		
	}
	@Test
	public void test5() {
		System.out.println("Test method --- 5 ");
	}

}
