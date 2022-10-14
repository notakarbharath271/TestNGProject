package parametersTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PermaterTest {
  @Test
  @Parameters({"username","password"})
  public void Testmethod(String Username,String Password) {
	  
	  System.out.println("Username : " + Username);
	  System.out.println("Password : " + Password);
	  
	  
  }
}
