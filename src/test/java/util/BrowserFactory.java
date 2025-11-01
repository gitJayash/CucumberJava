package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserFactory {

    private static WebDriver driver;

    /**
     * Initialize browser based on provided name
     * @param browserName - e.g. "chrome", "firefox", "edge"
     * @return WebDriver instance
     */
    public static WebDriver getDriver(String browserName) {
        if (driver != null) {
            return driver;
        }

        switch (browserName.toLowerCase()) {
            case "chrome":driver = new ChromeDriver();
                break;
            case "firefox":driver = new FirefoxDriver();
                break;
            case "edge":driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("❌ Unsupported browser: " + browserName);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        return driver;
    }

    /** Quit and clean up driver instance */
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
