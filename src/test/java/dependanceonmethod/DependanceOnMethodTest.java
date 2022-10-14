package dependanceonmethod;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependanceOnMethodTest {
	String trackingNumber = null;
	@Ignore
	@Test
	public void createOrder() {
		//System.out.println(5/0);
		System.out.println("Create Order Method");
		trackingNumber = "ABC123XYZ";
	}

	@Test(dependsOnMethods = {"createOrder"},ignoreMissingDependencies = true)
	public void trackOrder() throws Exception {
		if (trackingNumber != null)
			System.out.println("Track Order Method");
		else
			throw new Exception();

	}

	@Test(dependsOnMethods = {"createOrder","trackOrder"},ignoreMissingDependencies = true)
	public void cancelOrder() throws Exception {
		if (trackingNumber != null)
			System.out.println("Cancel Order Method");
		else
			throw new Exception();
	}

}
