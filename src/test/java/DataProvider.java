import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {

    WebDriver driver;

    @BeforeMethod
    public void setup(){

    }

    @AfterMethod
    public void end(){

    }


    @Test(dataProvider = "getdata") //because my data provider has 2 dimantional array, in this case my method run 2 times
    public void Z(String input, String expectedMessage ){

        // String input = "input";  <=== because we got this from our data provider, so i commit it out
        // String expectedMessage = "error message";   <=== because we got this from our data provider, so i commit it out

        System.out.println("inside method Z and working with the input" + input);
        String output ="error message";
        Assert.assertEquals(output, expectedMessage,"Output did not match");
    }



    @Test
    public void Z2(){
        String input = "input 2";
        String expectedMessage = "success message";
        System.out.println("inside method Z and working with the input" + input);
        String output ="error message";
        Assert.assertEquals(output, expectedMessage,"Output did not match");
    }




    @org.testng.annotations.DataProvider
    public Object[][] getdata(){
        Object data[][] = new Object[2][2];
        data[0][0]="input1";
        data[0][1]="error message";
        data[1][0]="input2";
        data[1][1]="success message";

        return data;

    }
}
