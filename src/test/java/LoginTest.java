import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    // 1.Variabila globala
    public WebDriver driver;

    // 2.Metoda test
    @Test
    public void metodaTest(){
        //Creare browser
        System.setProperty("webdriver.chrome.driver","C:\\automation\\Chromedriver\\chromedriver.exe");

       //deschide un browser / accesezi URL'ul

        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Index.html");

        //Facem browserul modul maximize
        driver.manage().window().maximize();

        //Declar elementul SignIn

        WebElement SignInElement = driver.findElement(By.id("btn1"));
        SignInElement.click();

        WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "Usceh96@yahoo.com";
        emailElement.sendKeys(emailValue);

        WebElement passwordElement = driver.findElement(By.cssSelector("input[type='Password']"));
        String passwordValue = "Poateprealow96";
        passwordElement.sendKeys(passwordValue);

        WebElement clickElement = driver.findElement(By.id("enterbtn"));
        clickElement.click();



    }

}
