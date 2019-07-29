package stepDefination;
		
import java.util.List;
import DependentAPI.APIs;
import org.openqa.selenium.By;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import DependentAPI.ExcelOperations;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import DependentInterfaces.ProjectConstants;
import org.openqa.selenium.firefox.FirefoxDriver;


public class perfromSteps implements ProjectConstants {
	
	WebDriver driver;
	APIs si = new APIs();
	ExcelOperations excel = new ExcelOperations();
	
	@Given("^Open the Firefox and launch Gamil URL$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
		System.out.println("This Step open the Firefox and launch the application.");	
		System.setProperty(FireFoxKey, FireFoxDriverPath);
		driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
    	driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		Thread.sleep(2000);
        				
    }		

    @When("^I login with following credentials$")					
    public void enter_the_incorrect_Username_and_Password(DataTable dt) throws Throwable 							
    {		
    	System.out.println("This step enter the Username and Password on the login page.");
    	List<String> list = dt.asList(String.class);
    	
    		String username=(list.get(0));
    		String pwd=(list.get(1));
   	
    	driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys(username);
		Thread.sleep(2000);
		si.takeScreenshot(driver, "scr1");
		excel.excelDataWrite("Sheet2", 1, 0, "PASS");
		driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		excel.excelDataWrite("Sheet2", 2, 0, "PASS");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(pwd);
		Thread.sleep(2000);
		si.takeScreenshot(driver, "scr2");
		excel.excelDataWrite("Sheet2", 3, 0, "PASS");
		driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
		Thread.sleep(2000);	

    }	
  

    @Then("^Close the browser$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
    	System.out.println("Closing the browser.");	
    	driver.close();
    					
    }		

}
