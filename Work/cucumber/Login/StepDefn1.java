package smartbear;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
public class StepDefn1{
WebDriver driver=null;
@Given ("I am on user registration page$")
public void goToLogin() {

System.setProperty("webdriver.chrome.driver","D://eclipse-jee-neon-3-win32-x86_64//Selenium Jar//SEL_JAR//chromedriver_win32//chromedriver.exe");
//Initiate web browser instance. driver new ChromeDrivez ():
driver=new ChromeDriver();
driver.navigate().to ("http://secure.smartbearsoftware.com/samples/TestCompletell/WebOrders/Login-BARX");
}
@When ("^1 enter valid data on the page!")

@Then ("^User registration should be successful$")
public void User_registration_should_be_successful () {

if(driver.getCurrentUrl().equalsIgnoreCase("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx")){

System.out.println("Test Pass");
} else {

System.out.println("Test Failed");
}
driver.close();
}
}
