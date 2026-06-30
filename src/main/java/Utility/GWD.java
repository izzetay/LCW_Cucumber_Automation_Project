package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GWD {

    private static ThreadLocal<WebDriver> threads = new ThreadLocal<>();
    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    public static WebDriver getDriver() {

        if (threads.get() == null) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            threads.set(driver);

            threads.get().manage().window().maximize();
        }
        if (wait == null && js == null) {
            threads.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            threads.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
            wait = new WebDriverWait(threads.get(), Duration.ofSeconds(20));
            js = (JavascriptExecutor) threads.get();
        }

        return threads.get();
    }
        public static void quitDriver() {
            if (threads.get() != null) {

                threads.get().quit();

                WebDriver driver = threads.get();

                driver = null;

                threads.set(driver);
            }
        }
    }


