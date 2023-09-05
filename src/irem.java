import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class irem extends BaseDriver {
    @Test
    public void pay(){
        driver.get("https://www.e-junkie.com/wiki/demo/paypal");
       WebElement cart= driver.findElement(By.xpath("//a[text()='Add to Cart']"));
       cart.click();
       MyFunc.Bekle(1);

       WebElement frame=driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']"));
       driver.switchTo().frame(frame);

        WebElement cCard = driver.findElement(By.xpath("//*[@class='Payment-Button CC']"));
        cCard.click();
        MyFunc.Bekle(3);

       WebElement pay= driver.findElement(By.cssSelector("[type='button'][class='Pay-Button']"));
       pay.click();



    }


}
