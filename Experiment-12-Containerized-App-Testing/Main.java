import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("http://localhost:8080");
            if (!"My Containerized Application".equals(driver.getTitle())) {
                throw new AssertionError("Home page title did not match");
            }
            driver.findElement(By.name("name")).sendKeys("John Doe");
            driver.findElement(By.name("email")).sendKeys("john.doe@example.com");
            driver.findElement(By.name("submit")).click();
            String result = driver.findElement(By.id("result")).getText();
            if (!"Form submitted successfully!".equals(result)) {
                throw new AssertionError("Form submission failed: " + result);
            }
            System.out.println("PASS: home page and form submission tests");
        } finally {
            driver.quit();
        }
    }
}
