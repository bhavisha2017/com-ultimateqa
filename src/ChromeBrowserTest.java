import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        //launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into browser
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Print the current URL
        System.out.println("current URL :" +driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source :" +driver.getPageSource());
        //Enter the username to username field
        WebElement useridlink = driver.findElement(By.id("user[email]"));
        useridlink.sendKeys("prime123@gmail.com");
        //Enter the password to password field
        driver.findElement(By.name("user[password]")).sendKeys("admin123");
        //Close the browser
       driver.close();
    }
}
