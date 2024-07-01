import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import support.Web;

public class PromptAlert {    
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = Web.createFirefox();
    }

    @Test
    public void clickPromptAlertButton(){
        driver.findElement(By.id("prompt")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Vitor");
        alert.accept();
        String name = driver.findElement(By.id("myName")).getText();
        System.out.println(name);
    }
    
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}

