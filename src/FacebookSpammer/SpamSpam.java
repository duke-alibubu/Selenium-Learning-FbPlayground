package FacebookSpammer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpamSpam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Your Chrome Driver location
		String driverLocation = "C:\\...chromedriver.exe";
		
		//Your Facebook account & pwd
		String username = "youraccount@gmail.com";
		String password = "yourpassword";
		
		
		System.setProperty("webdriver.chrome.driver", driverLocation);
        WebDriver driver = new ChromeDriver();
        
        //Go to Facebook
        driver.get("https://www.facebook.com/");
        loginFacebook(driver, username, password);
	}
	
	private static void loginFacebook(WebDriver driver, String username, String password) {
		WebElement uname = driver.findElement(By.id("email"));
        WebElement pwd = driver.findElement(By.id("pass"));
        WebElement submit = driver.findElement(By.id("u_0_8"));

        uname.sendKeys(username);
        pwd.sendKeys(password);
        submit.submit(); 
	}

}
