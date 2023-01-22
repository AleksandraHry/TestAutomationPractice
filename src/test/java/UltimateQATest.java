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

    //input[@id='et_pb_contact_name_0']   1 out of 1
    //input[@class='input et_contact_error']   1 out of 2
    //input[@class='input et_contact_error' and @id='et_pb_contact_name_0']
    //input[@placeholder='Name']
    //*[@placeholder='Name']
    //*[] - ogolna postac XPath

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

        WebElement textThanks = driver.findElement(By.xpath("//*[@id='et_pb_contact_form_0']//p"));
        Assertions.assertEquals("Thanks for contacting us", textThanks.getText());
    }
}
