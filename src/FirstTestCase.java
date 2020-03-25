/*
our test steps are
1.Setup: open browser and application
2.Login:
3.Close:
 */


import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {


    @Test(priority = 1)
    public void setup() {
        System.out.println("This is Setup");

    }


    @Test(priority = 3)
    public void login() {
        System.out.println("This is Login test");
        Assert.assertEquals(2,2);
    }


    @Test(priority = 2)
    public void tearDown() {
        System.out.println("Closing Browser");
    }

}
