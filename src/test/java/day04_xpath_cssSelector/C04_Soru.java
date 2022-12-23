package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Soru {
    public static void main(String[] args) throws InterruptedException {

         /*
       1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna basin
    3- Delete butonu’nun gorunur oldugunu test edin
    4- Delete tusuna basin
    5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        */



        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();


        WebElement deleteButonu=driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));

        if (deleteButonu.isDisplayed()){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        Thread.sleep(3000);


        driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();


        WebElement addRemoveYazisi=driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
       if (addRemoveYazisi.isDisplayed()){
           System.out.println(  "passed");

        }else {
           System.out.println("failed");
       }




        driver.close();











    }
}
