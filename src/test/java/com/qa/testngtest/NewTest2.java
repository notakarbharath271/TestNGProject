package com.qa.testngtest;

import org.testng.annotations.Test;

public class NewTest2 {
  @Test(groups = {"smoke","snaity"})
  public void test5() {
	  
	  System.out.println("Test---5");
  }
  @Test(groups = {"functioanl","snaity","smoke"})
  public void test6() {
	  
	  System.out.println("Test---6");
  }
  @Test(groups = {"functional"})
  public void test7() {
	  
	  System.out.println("Test---7");
  }
  @Test(groups = {"regression"})
  public void test8() {
	  
	  System.out.println("Test---8");
  }
  
}
