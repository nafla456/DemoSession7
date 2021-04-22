import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstClass {

    private WebDriver driver;
    private String baseUrl;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        ChromeDriverManager.chromedriver().setup();
        driver=new ChromeDriver();


    }

    @Test
    public void test3() throws Exception {
        driver.get("https://demoqa.com/");
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div[4]/div/div[3]/h5")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/div/div[2]/span/div/div")).click();
        driver.findElement(By.xpath("(//li[@id='item-0']/span)[2]")).click();
        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("Fathima");
        driver.findElement(By.id("lastName")).click();
        driver.findElement(By.id("lastName")).click();
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("Nafla");
        driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div[2]/label")).click();
        driver.findElement(By.id("userNumber")).click();
        driver.findElement(By.id("userNumber")).clear();
        driver.findElement(By.id("userNumber")).sendKeys("0785646765");
        driver.findElement(By.id("submit")).click();
        driver.findElement(By.id("closeLargeModal")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }


}


