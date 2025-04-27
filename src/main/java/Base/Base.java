package Base;

import com.sun.jna.platform.win32.Wevtapi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public  static Properties prop;
    public static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static synchronized WebDriver getDriver(){
        return threadLocal.get();
    }

    public Base() {
        prop = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/config/config.properties")) {
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {
        WebDriver driver;
        String BrowserName = prop.getProperty("browser");
        if(BrowserName.equals("chrome")){
            driver = new ChromeDriver();
        }
        else {
            driver= new EdgeDriver();
        }
        threadLocal.set(driver);
        driver.manage().window().maximize();
        String url = prop.getProperty("url");
        System.out.println("Url: "+ url);
        driver.manage ().timeouts ().pageLoadTimeout (Duration.ofSeconds (20));
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (20));
        driver.get(url);


    }
    public static void main(String[] args) {
        initialization();
    }

}
