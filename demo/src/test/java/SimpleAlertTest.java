import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import support.Web;

public class SimpleAlertTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = Web.createFirefox();
    }

    @Test
    public void clickAcceptButton(){
        driver.findElement(By.id("accept")).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text: "+ alertText); 
        alert.accept();
    }
    
    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
