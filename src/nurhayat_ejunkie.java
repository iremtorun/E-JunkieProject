import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Driver;

public class nurhayat_ejunkie extends BaseDriver {
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

        WebElement country = driver.findElement(By.xpath("(//*[@autocomplete='country'])[1]"));
        country.isSelected();
        MyFunc.Bekle(1);

       WebElement frame2 = driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(frame2);

        WebElement cardType = driver.findElement(By.xpath("//*[@class='Card-Type']"));
        cardType.isSelected();
        MyFunc.Bekle(2);



        WebElement cardNumber = driver.findElement(By.xpath("//*[@class='Card-Number']"));
        cardNumber.sendKeys("4242 4242 4242 4242");
        MyFunc.Bekle(1);

        WebElement cardExpirity = driver.findElement(By.xpath("//*[@placeholder='MM / YY']"));
        cardExpirity.sendKeys("12/2028");
        MyFunc.Bekle(1);

        WebElement CVC = driver.findElement(By.xpath("//*[@placeholder='000']"));
        CVC.sendKeys("315");
        MyFunc.Bekle(1);




        //  WebElement nextBtn= driver.findElement(By.id("btnNext"));
        // nextBtn.click();


        //  MyFunc.Bekle(2);
    }
}
