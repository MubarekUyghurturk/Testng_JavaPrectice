import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExamples{

    WebDriver driver;



   @BeforeClass
    public void setup(){
       System.setProperty("webdriver.chrome.driver", "/Users/mubarekuyghurturk/Downloads/chromedriver");

       WebDriver driver = new ChromeDriver();



               driver = new ChromeDriver();
               driver.get("https://opensource-demo.orangehrmlive.com/");
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
