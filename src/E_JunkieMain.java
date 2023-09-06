import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class E_JunkieMain extends BaseDriver {
    @Test
    public void pay() {
        driver.get("https://www.e-junkie.com/wiki/demo/paypal");
        WebElement cart = driver.findElement(By.xpath("//a[text()='Add to Cart']"));
        cart.click();
        MyFunc.Bekle(1);

        WebElement frame = driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(frame);

        WebElement cCard = driver.findElement(By.xpath("//*[@class='Payment-Button CC']"));
        cCard.click();
        MyFunc.Bekle(3);

        WebElement pay = driver.findElement(By.cssSelector("[type='button'][class='Pay-Button']"));
        pay.click();
    }

    @Test
    public void e_junkie() {
        driver.get("https://www.e-junkie.com/");
        WebElement standard = driver.findElement(By.xpath("//a[text()='PayPal Standard']"));
        standard.click();
        MyFunc.Bekle(1);
        WebElement cart = driver.findElement(By.xpath("//a[text()='Add to Cart']"));
        cart.click();
        MyFunc.Bekle(1);

        WebElement frame = driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(frame);

        WebElement cCard = driver.findElement(By.xpath("//*[@class='Payment-Button CC']"));
        cCard.click();
        MyFunc.Bekle(3);

        WebElement pay = driver.findElement(By.cssSelector("[type='button'][class='Pay-Button']"));
        pay.click();
    }

    @Test
    public void Test1() {
        driver.get("https://www.e-junkie.com/wiki/demo ");

        WebElement buyNow = driver.findElement(By.xpath("(//*[@Class='btn'])[2]"));
        buyNow.click();
        MyFunc.Bekle(3);

        WebElement frame1 = driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(frame1);

        WebElement cCard = driver.findElement(By.xpath("//*[@class='Payment-Button CC']"));
        cCard.click();
        MyFunc.Bekle(3);

        WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        email.sendKeys("nurqatester@gmail.com");
        MyFunc.Bekle(1);

        WebElement c_email = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        c_email.sendKeys("nurqatester@gmail.com");
        MyFunc.Bekle(1);

        WebElement nameCArd = driver.findElement(By.xpath("//input[@placeholder='Name On Card']"));
        nameCArd.sendKeys("Nur");
        MyFunc.Bekle(1);

        WebElement telephone = driver.findElement(By.xpath("(//input[@placeholder='Optional'])[1]"));
        telephone.sendKeys("05322625200");
        MyFunc.Bekle(1);

        WebElement company = driver.findElement(By.xpath("(//*[@autocomplete='company'])[1]"));
        company.sendKeys("nurltd");
        MyFunc.Bekle(1);

        WebElement adress = driver.findElement(By.xpath("(//*[@autocomplete='address-1'])[1]"));
        adress.sendKeys("esentepe mah");
        MyFunc.Bekle(1);

        WebElement adress2 = driver.findElement(By.xpath("(//*[@autocomplete='address-2'])[1]"));
        adress2.sendKeys("esentepe mah");
        MyFunc.Bekle(1);

        WebElement city = driver.findElement(By.xpath("(//*[@autocomplete='city'])[1]"));
        city.sendKeys("Hatay");
        MyFunc.Bekle(1);

        WebElement postCode = driver.findElement(By.xpath("(//*[@autocomplete='zip'])[1]"));
        postCode.sendKeys("31000");
        MyFunc.Bekle(1);

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("[class='Card-Type']")));
        actions.keyDown(Keys.ARROW_DOWN).click().perform();

        actions.moveToElement(driver.findElement(By.cssSelector("[class='Card-Type']")));
        actions.keyDown(Keys.ARROW_DOWN).click().perform();

        WebElement cardNumber = driver.findElement(By.cssSelector("[autocomplete='cc-number']"));
        cardNumber.sendKeys("4242 4242 4242 4242");
        MyFunc.Bekle(1);

        WebElement cardExpirity = driver.findElement(By.xpath("//*[@placeholder='MM / YY']"));
        cardExpirity.sendKeys("12/28");
        MyFunc.Bekle(1);

        WebElement cvs = driver.findElement(By.cssSelector("[autocomplete='cc-csc']"));
        cvs.sendKeys("315");
        MyFunc.Bekle(1);

        WebElement paybtn = driver.findElement(By.cssSelector("[class='Pay-Button']"));
        paybtn.click();
        MyFunc.Bekle(2);

        WebElement pass = driver.findElement(By.cssSelector("[class='right_i']"));
        pass.click();

    }

    @Test
    public void test2() {
        driver.get("https://www.e-junkie.com/  ");
        WebElement onclick = driver.findElement(By.xpath("(//*[@class='small_text'] )[1]"));
        onclick.click();

        WebElement trydemo = driver.findElement(By.xpath("(//*[@class='btn solid'])[1]"));
        trydemo.click();

        WebElement frame2 = driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(frame2);

        WebElement cCard = driver.findElement(By.xpath("//*[@class='Payment-Button CC']"));
        cCard.click();
        MyFunc.Bekle(3);

        WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        email.sendKeys("nurqatester@gmail.com");
        MyFunc.Bekle(1);

        WebElement c_email = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        c_email.sendKeys("nurqatester@gmail.com");
        MyFunc.Bekle(1);

        WebElement nameCArd = driver.findElement(By.xpath("//input[@placeholder='Name On Card']"));
        nameCArd.sendKeys("Nur");
        MyFunc.Bekle(1);

        WebElement telephone = driver.findElement(By.xpath("(//input[@placeholder='Optional'])[1]"));
        telephone.sendKeys("05322625200");
        MyFunc.Bekle(1);

        WebElement company = driver.findElement(By.xpath("(//*[@autocomplete='company'])[1]"));
        company.sendKeys("nurltd");
        MyFunc.Bekle(1);

        WebElement adress = driver.findElement(By.xpath("(//*[@autocomplete='address-1'])[1]"));
        adress.sendKeys("esentepe mah");
        MyFunc.Bekle(1);

        WebElement adress2 = driver.findElement(By.xpath("(//*[@autocomplete='address-2'])[1]"));
        adress2.sendKeys("esentepe mah");
        MyFunc.Bekle(1);

        WebElement city = driver.findElement(By.xpath("(//*[@autocomplete='city'])[1]"));
        city.sendKeys("Hatay");
        MyFunc.Bekle(1);

        WebElement postCode = driver.findElement(By.xpath("(//*[@autocomplete='zip'])[1]"));
        postCode.sendKeys("31000");
        MyFunc.Bekle(1);

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("[class='Card-Type']")));
        actions.keyDown(Keys.ARROW_DOWN).click().perform();

        actions.moveToElement(driver.findElement(By.cssSelector("[class='Card-Type']")));
        actions.keyDown(Keys.ARROW_DOWN).click().perform();

        WebElement cardNumber = driver.findElement(By.cssSelector("[autocomplete='cc-number']"));
        cardNumber.sendKeys("4242 4242 4242 4242");
        MyFunc.Bekle(1);

        WebElement cardExpirity = driver.findElement(By.xpath("//*[@placeholder='MM / YY']"));
        cardExpirity.sendKeys("12/28");
        MyFunc.Bekle(1);

        WebElement cvs = driver.findElement(By.cssSelector("[autocomplete='cc-csc']"));
        cvs.sendKeys("315");
        MyFunc.Bekle(1);

        WebElement paybtn = driver.findElement(By.cssSelector("[class='Pay-Button']"));
        paybtn.click();
        MyFunc.Bekle(2);

        WebElement pass = driver.findElement(By.cssSelector("[class='right_i']"));
        pass.click();

    }
}




