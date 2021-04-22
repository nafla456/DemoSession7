import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SecondClass {

    public  static  void  main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL +"t");
        driver.get("https://demoqa.com/");



    }
}
