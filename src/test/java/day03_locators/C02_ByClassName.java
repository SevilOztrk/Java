package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        // amazona gidip nutella icin arama yapin.
        // ilk sayfada çıkan ürünlerin içerisinde
        // en yuksek fiyatı bulun.


        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);


        // WebElement bir obje oldugundan, direk yazidralaamz.


        Thread.sleep(2000);
        driver.close();







    }
}
