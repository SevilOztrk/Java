package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_drivermethod {
    public static void main(String[] args) throws InterruptedException {


        // biz browserleri olusturudugumuz driver sayesinde  otomate edebiliyoruz.
        // bunun icin her testin basinda mutlaka driver objesi olusturucaz.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\SEVİL\\Desktop\\selenium\\com.Team105Selenium\\src\\drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();


        driver.get("https://www.amazon.com");

        // acilan sayfanin basliginin amazon icerdigini test edin.

        String expectedKelime="amazon";
        String actualResult= driver.getTitle();

        if (actualResult.contains(expectedKelime)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title amazon icermiyor, test FAILED");
            System.out.println(driver.getTitle());
        }



        // gittigimiz sayfanin URL'nin https://www.amazon.com/ oldugunu test edin.

        String expectedUrl="https://www.amazon.com/";
        String actualUrl=driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){

            System.out.println("url testi PASSED");

        }else {
            System.out.println("Url istediginiz degerde degil");
            System.out.println(driver.getTitle());
        }


        Thread.sleep(3000);

        driver.close();













    }
}
