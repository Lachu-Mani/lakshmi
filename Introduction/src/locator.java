import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args)	 {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\kaize\\Documents\\chromedriver1\\chromedriver.exe");
WebDriver driver1= new ChromeDriver();
driver1.get("https://rahulshettyacademy.com/locatorspractice/");
driver1.findElement(By.id("inputUsername")).sendKeys("lachu");



	}

}
