import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by bogdan on 03.06.17.
 */

public class App {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capability = DesiredCapabilities.chrome();

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

        String baseUrl = "http://www.facebook.com";
        String tagName = "";


        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);


        driver.close();
        System.exit(0);
    }
}