import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AppliTest {
	
	SoftAssert soft= new SoftAssert();
	
	@BeforeSuite
	public void Beforesuite(){
		System.out.println("Before Suite");
	}
	
	
	
	@BeforeTest
	
	public void beforeTest(){
		System.out.println("Before runnung");
	}
	
	@AfterTest
		public void afterTest(){
		System.out.println("After runnung");
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("---- Before method------");
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("---- After method------");
	}	
	
	@Test (priority=1)
	public void LoginTest()
	{
		//throw new SkipException("any reason");
		soft.assertEquals("A", "B");
		System.out.println("not matched");
		System.out.println("login");
		soft.assertAll();
	
	}
	
	@Test (priority=4)
	public void LoginTest1()
	{
		//throw new SkipException("any reason");
		System.out.println("Start");
		try{
			//soft.assertEquals("A", "B");
			Assert.assertEquals("A", "B");
		}
		catch(Throwable t){
			System.out.println("error");
		}
		System.out.println("not matched");
		//soft.assertAll();
	
	}

	@Test (priority=2, dependsOnMethods={"LoginTest"})
	public void passchTest(){
		System.out.println("Password Changed");
	}
	
	@Test (priority=3)
	public void logoutTest(){
		System.out.println("Logout");
	}
	
	@AfterSuite
	public void aftersuite(){
		System.out.println("After Suite");
	}
}
