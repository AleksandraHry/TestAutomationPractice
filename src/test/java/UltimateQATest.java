import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQATest {
    String projectLocation = System.getProperty("user.dir");
    WebDriver driver;

    //hermetyzacja: public/private/protected
    @Test
    public void testOne() {
        System.out.println(projectLocation);
        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");

  //      driver.close();
    }
}
