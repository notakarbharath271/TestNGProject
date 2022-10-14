package dependanceongroups;

import org.testng.annotations.Test;

public class DependanceOnGroupsTest {
	@Test(groups = "smokeTest")
	public void test1() {
		System.out.println("Somke test 1");
	}

	@Test(groups = "smokeTest")
	public void test2() {
		System.out.println("Somke test 2");
	}

	@Test(groups = "smokeTest")
	public void test3() {
		System.out.println("Somke test 3 :"+5/0);
	}
	@Test(groups = "sanityTest")
	public void test4() {
		System.out.println("Sanity test 4");
	}

	@Test(groups = "sanityTest")
	public void test5() {
		System.out.println("Sanity test 5");
	}
	@Test(groups = "regressionTest")
	public void test6() {
		System.out.println("regression test 6");
	}

	@Test(groups = "regressionTest")
	public void test7() {
		System.out.println("regression test 7");
	}
	/*
	 * @Test(dependsOnGroups = "smokeTest") public void mainTest() {
	 * System.out.println("Main Method"); }
	 */

}
