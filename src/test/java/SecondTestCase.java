import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    public void setup() {
        System.out.println("This is Setup");

    }


    @Test(priority = 2)
    public void searchCustomer() {
        System.out.println("This is Search Customer test");
    }


    @Test(priority = 3)
    public void addCustomer(){
        System.out.println("This is add customer test");
        Assert.assertEquals(1,1);
    }


    @Test(priority = 2)
    public void tearDown() {
        System.out.println("Closing Browser");
    }

}
