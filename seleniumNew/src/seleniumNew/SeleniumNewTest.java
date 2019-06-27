package seleniumNew;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumNewTest {
	@BeforeMethod
	public void login() {
		System.out.println("lgin");
	}

  @Test
  public void userLoginTest() {
    System.out.println("login success");
  }
  @Test
  public void manageTest() {
	  System.out.println("manage success");
  }
  @AfterMethod
  public void userLogout() {
	  System.out.println("logout");
  
}
}
