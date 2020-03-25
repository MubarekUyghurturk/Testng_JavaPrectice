import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_ParallelTesting {

    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) throws Exception{

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/mubarekuyghurturk/Downloads/chromedriver");
            driver = new ChromeDriver();

        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "/Users/mubarekuyghurturk/Downloads/geckodriver");
            driver = new FirefoxDriver();

        }
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("http://www.google.com");
    }


    @AfterMethod
    public void end(){
        driver.close();
    }

    @Test
    public void Z(){
        System.out.println( "Inside method Z");
    }



    @Test
    public void Y(){
        System.out.println( "Inside method Y");
    }

}
