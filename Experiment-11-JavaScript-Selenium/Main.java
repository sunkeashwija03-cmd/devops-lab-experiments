import java.nio.file.Path;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            String fileUrl = Path.of("Experiment-11-JavaScript-Selenium", "program.html")
                                 .toAbsolutePath().toUri().toString();
            driver.get(fileUrl);
            driver.findElement(By.id("increment-button")).click();
            String result = driver.findElement(By.id("output")).getText();
            if (!"1".equals(result)) {
                throw new AssertionError("Expected 1, got " + result);
            }
            System.out.println("PASS: increment button changed output to 1");
        } finally {
            driver.quit();
        }
    }
}
