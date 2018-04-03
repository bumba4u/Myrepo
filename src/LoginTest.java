

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	

	
	@AfterMethod
	public void afterMethod(){
		System.out.println("---- After method------");
	}	
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("---- Before method------");
	}
	
	@Test(dataProvider="getData") // 2nd step
	public void dologinTest(String to , Integer sub, String msg){
		System.out.println(to +" --- " + sub + "  ---  " + msg);
		
	}
	
	@DataProvider//(parallel=true)// Run test case parallel
	public Object[][] getData(){ // 1st step
		Object[][] data = new Object[2][3]; //2 rows 3 columns
		// 1st row
				data[0][0] = "xyz@gmail.com";
				data[0][1] = 123;
				data[0][2]  = "howzz life";
				
				// 2nd row 
				data[1][0] = "abc@gmail.com";
				data[1][1] = 444;
				data[1][2]  = "life is good";
		
		return data;
	}

}
