package com.qa.testngtest;

import org.testng.annotations.Test;
@Test(groups = {"all"})
public class NewTest {
  @Test(groups = {"smoke","snaity"})
  public void test1() {
	  
	  System.out.println("Test---1");
  }
  @Test(groups = {"smoke","regression"})
  public void test2() {
	  
	  System.out.println("Test---2");
  }
  @Test (groups = {"smoke","functional"})
  public void test3() {
	  
	  System.out.println("Test---3");
  }
  @Test
  public void test4() {
	  
	  System.out.println("Test---4");
  }
  
}
