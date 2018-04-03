import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// for practice


public class lo {
	
	SoftAssert soft= new SoftAssert();
		
		@Test(priority=1)
		public void logi(){
		System.out.println("Start");
		/*try{
		Assert.assertEquals("A", "B");
		} catch( Throwable t){
			System.out.println("error");
			//ErrorUtil.addVerificationFailure(t);
		
		}*/
		//Assert.assertEquals("A", "B");
		soft.assertEquals("A", "B");
		System.out.println("not same");
		System.out.println("end");
		soft.assertAll();
		}
	}


