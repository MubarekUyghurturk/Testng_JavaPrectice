package parallelTesting;

import jdk.jshell.spi.ExecutionControl;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;

    @Test
    public void LoginTest()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",
                "/Users/mubarekuyghurturk/Documents/selenium dependencies/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"gb_70\"]"));
        signIn.click();

        WebElement choseEmail = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/ul/li[2]/div/div[1]/div/div[2]/div[1]"));
        choseEmail.click();
       // driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("malik01112015");
       // Thread.sleep(3000);
        // driver.findElement(By.linkText("Next"));
        String actualTitle = driver.getTitle();
        Thread.sleep(2000);
        Assert.assertEquals(actualTitle,"Sign in - Google Accounts");
        driver.quit();
    }
}
