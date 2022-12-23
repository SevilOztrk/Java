package day02_driverMethotlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.navigate().to("https://www.amazon.com");

        // get ile ayni islevi yapar

        Thread.sleep(2000);
        driver.get("https://www.wisequarter.com");


        Thread.sleep(2000);

        // yeniden amazon'a donelim.
        driver.navigate().back();

        // tekrar wisequarter.com'a gitmek istersek

        driver.navigate().forward();
        Thread.sleep(2000);
        driver.quit();



    }
}
