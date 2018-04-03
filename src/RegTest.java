import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class RegTest {
	
	SoftAssert soft= new SoftAssert();

	@Test	
	public void doRegisterTest(){
		String Exp ="xxx";
		String Act ="xxx1";
		
		System.out.println("A");
		Assert.assertEquals("A", "A");
		soft.assertEquals(Act, Exp);
		soft.assertEquals("A", "B");
		System.out.println("B");
		soft.assertAll();
		
	/*	System.out.println("A");
		try{
			Assert.assertEquals(Act, Exp);
		}
		catch( Exception e){
			System.out.println("error ");
		}
		System.out.println("B");*/
		
		//Assert.assertEquals("A", "B");
		//Assert.assertTrue((2>11),"Error message");
	}
	
// critical -- stop/ failure -- Assert
	//non critical -- failure and continue -- softAssert
}
