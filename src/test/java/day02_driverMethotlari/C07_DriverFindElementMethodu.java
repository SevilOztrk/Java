package day02_driverMethotlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_DriverFindElementMethodu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com"); // amazona git


        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); // elementi bul.


        aramaKutusu.sendKeys("Java"); // biseyler mi göndermek istersin?
        Thread.sleep(2000);
        aramaKutusu.clear(); // temizlemek mi istersin?


        aramaKutusu.sendKeys("Nutella"); // java ve nutellayı beraber aratir.
        aramaKutusu.submit(); // enter'a bas demek



        Thread.sleep(1000);
        driver.close();





    }
}
