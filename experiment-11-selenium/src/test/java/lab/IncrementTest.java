package lab;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class IncrementTest {
    @Test void buttonIncrementsCounter() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        try {
            String url = Paths.get("program.html").toAbsolutePath().toUri().toString();
            driver.get(url);
            driver.findElement(By.id("increment-button")).click();
            assertEquals("1", driver.findElement(By.id("output")).getText());
        } finally { driver.quit(); }
    }
}
