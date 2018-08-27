package first;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

    public static void main(String[] args) {
        
        By experience = By.cssSelector("[data-tracking-control-name=\"pp_title\"]");
        
        
        Path driverPath = Paths.get(System.getProperty("user.dir") 
                + "/webDrivers"
                + "/chromedriver.exe");

        
        System.out.println("webdriver.chrome.driver = "
                + driverPath.toString());
        
        
        System.setProperty("webdriver.chrome.driver", 
                driverPath.toString());
        
        WebDriver driver = new ChromeDriver(); 
        
        driver.navigate().to("https://www.linkedin.com/in/adrian-beck/");
        driver.manage().window().maximize();
        
        
        System.out.println(
                new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.visibilityOfElementLocated(experience))
                    .getText()
        );

        
        driver.quit();
    }

}
