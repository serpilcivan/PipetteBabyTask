import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    WebDriver driver;

    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\QUADRO\\Desktop\\Installers\\drivers\\chromedriver.exe");
        System.out.print("Opening Chrome...");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts();
        //open web page
        driver.get("https://pipettebaby.com/");
        System.out.println("● Open https://pipettebaby.com/");

    }
    public void userLogin(){
        driver.findElement(By.id("onetrust-close-btn-container")).click();
        //click user icon
        driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/header/div[2]/div[1]/div/ul/li[4]")).click();
        System.out.println("● Go to Account Page");
        //click Sign Up
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='/account/register']")).click();
        System.out.println("● Go to Create Account Page");
        //fill the fields in Sign Up Page and submit button
        driver.findElement(By.id("field-first-name")).sendKeys("Serpil");
        driver.findElement(By.id("field-last-name")).sendKeys("Civan");
        driver.findElement(By.id("field-email")).sendKeys("serpilcivan17@gmail.com");
        driver.findElement(By.id("field-password")).sendKeys("testtest");
        driver.findElement(By.className("customer-btn")).click();
        System.out.println("● User created");
    }



    public static void main(String[] args) throws Exception {
        Demo demo = new Demo();
        demo.launchBrowser();
        demo.userLogin();

    }
}