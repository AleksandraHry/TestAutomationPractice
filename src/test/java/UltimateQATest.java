import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UltimateQATest extends BaseTestSetup {

    @Test
    public void testOne() {
        WebElement buttonUsingId = driver.findElement(By.id("idExample"));
        Assertions.assertTrue(buttonUsingId.isDisplayed());
        buttonUsingId.click();

        WebElement textButtonSuccess = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals( "Button success", textButtonSuccess.getText());
    }

    @Test
    public void testTwo() throws InterruptedException {
        WebElement inputName = driver.findElement(By.xpath("//input[@id='et_pb_contact_name_0']"));
        inputName.sendKeys("Tester");

        WebElement inputEmail = driver .findElement(By.xpath("//input[@id='et_pb_contact_email_0']"));
        inputEmail.sendKeys("tester@tester.pl");

        Thread.sleep(2000);

        WebElement buttonEmailMe = driver.findElement(By.xpath("//*[text()=\"Email Me!\"]"));
        Assertions.assertTrue(buttonEmailMe.isDisplayed());
        buttonEmailMe.click();

        Thread.sleep(2000);

        WebElement textThanks = driver.findElement(By.xpath("//*[@id='et_pb_contact_form_0']//p"));
        Assertions.assertEquals("Thanks for contacting us", textThanks.getText());
    }
}
