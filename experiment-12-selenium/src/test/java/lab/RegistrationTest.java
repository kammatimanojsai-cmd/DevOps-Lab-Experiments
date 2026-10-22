package lab;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class RegistrationTest {
    @Test void registrationFormSubmitsSuccessfully() {
        String baseUrl = System.getProperty("baseUrl", "http://localhost:5000");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get(baseUrl + "/register");
            assertTrue(driver.getTitle().contains("Event Registration"));
            driver.findElement(By.name("name")).sendKeys("Student Example");
            driver.findElement(By.name("email")).sendKeys("student@example.com");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            assertTrue(driver.getPageSource().contains("Registration Successful"));
        } finally { driver.quit(); }
    }
}
