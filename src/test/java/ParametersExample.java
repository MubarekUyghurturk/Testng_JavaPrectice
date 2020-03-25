import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    WebDriver driver;


    @BeforeClass
    @Parameters({"browser","url"})
    public void setup(String browser, String url){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",
                    "/Users/mubarekuyghurturk/Documents/selenium dependencies/drivers/chromedriver");
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",
                    "/Users/mubarekuyghurturk/Documents/selenium dependencies/drivers/chromedriver");
            driver = new FirefoxDriver();
        }

        driver.get(url);

    }


    @Test
    public void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");

    }

    @Test
    public void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"OrangeHRM","Title is not matched");

    }

    @Test
    public void tearDown(){
        driver.quit();
    }
}
