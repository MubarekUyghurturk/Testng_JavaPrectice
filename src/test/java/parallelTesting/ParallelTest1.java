package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {

   WebDriver driver;

    @Test
    public void logoTest()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", " /Users/mubarekuyghurturk/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.get("http://www.google.com");

       WebElement logo = driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);

    }


    @Test
    public void homePageTitle() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",
                "/Users/mubarekuyghurturk/Documents/selenium dependencies/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");

        Assert.assertEquals(driver.getTitle(), "Google");

        Thread.sleep(5000);
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
