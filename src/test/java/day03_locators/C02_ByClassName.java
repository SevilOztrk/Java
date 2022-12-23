package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;
import java.util.List;

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

        List<WebElement> fiyatlarListesi=driver.findElements(By.className("a-price-whole"));
        System.out.println(fiyatlarListesi); // WebElement bir obje oldugundan, direk yazidralaamz.

        // Bunun icin for each loop kullanarak her bir webelement uzerindeki yazilari tek tek yazdirmaliyiz.

        for (WebElement each: fiyatlarListesi
             ) {
            System.out.println(each.getText()); // her bir web elementin uzerindeki yaziyi al
        }

        // en yuksek fiyati bulmak icin java bilgilerimizi kullanalim
        // web elementlerden getText ile fiyati String olarak al
        // String fiyati kiyaslama yapabilmek icin Integer'a cevir
        // en yuksek fiyati bulup yazdir.


        String fiyatStr;
        Integer fiyat1Int;

        Integer enYuksekFiyat=0;

        // yakup ve Sevil
        for (WebElement each: fiyatlarListesi
        ) {

            fiyatStr=each.getText();
            fiyat1Int=Integer.parseInt(fiyatStr);

            if (fiyat1Int>enYuksekFiyat){
                enYuksekFiyat=fiyat1Int;
            }
        }
        System.out.println("E.Y.U.F:" + enYuksekFiyat);


        Thread.sleep(2000);
        driver.close();







    }
}
