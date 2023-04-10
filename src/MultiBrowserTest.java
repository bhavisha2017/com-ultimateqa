import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = " https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("wrong browser");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        //Give the implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Print the current URL
        System.out.println("current URL :" + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source :" + driver.getPageSource());
        //Enter the username to username field
        WebElement userid = driver.findElement(By.id("user[email]"));
        userid.sendKeys("prime123@gmail.com");
        //Enter the password to password field
        driver.findElement(By.name("user[password]")).sendKeys("admin123");
        //Close the browser
        driver.close();

    }
}