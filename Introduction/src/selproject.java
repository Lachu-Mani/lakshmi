import org.openqa.selenium.WebDriver;//giving knowledge of chromedriver to the class
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;//giving knowledge of webdriver to the class
//import org.openqa.selenium.firefox.FirefoxDriver;

public class selproject  {
	//the chrome driver has agreed to implement all the methods presnt in webdriver. web 
	// webdriver is the interface that is a group of related  methods, names but no body/empty bodies. the respective class has to implement the body.
//  In other words, these driver classes have followed the contract of WebDriver by implementing all the methods of the WebDriver interface.interface ia the contract that all classes must follow. web driver being an interface, all the classes must follow the webdriver methods , which does not have any body , only name of methods. when a class implements the interface, it agrees that all classes provide implementation/bodies to all defined methods in interface.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.Chrome.driver","C:\\Users\\kaize\\Documents\\chromedriver.exe");//for invoking chrome browser, it uses chromedriver.exe
//invoking browsers
		//chrome browser has its class chromedriver-methods- to use the methods of that class object is needed to access the methods in that class
//ChromeDriver driver= new ChromeDriver();	// this driver object hass access to webdriver methods and its own class methods.
//WebDriver driver = new ChromeDriver();//new- memory allocation for the object driver.instantiate driver object. In order for the code to automate  successfully all other browsers, we need to use only the webdriver methods(common acroos all browser). if own class methods are used in code, which may not work in automating other browsers.
	//firefox launch
//System.setProperty("WebDriver.gecko.driver", "C:\\Users\\kaize\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
 
		//WebDriver driver1 = new FirefoxDriver();
 //launch edge
		//learning git with manikandan
		System.setProperty("webdriver.edge.driver", ".C:\\Users\\kaize\\Downloads\\edgedriver_win64\\msedgedriver.exe");	
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
 System.out.println(driver.getTitle());	
 System.out.println(driver.getCurrentUrl());
 driver.close();
driver.quit();	
	}

}
