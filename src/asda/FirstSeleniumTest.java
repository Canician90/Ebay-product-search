package asda;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



    public class FirstSeleniumTest {

    WebDriver driver; 

    public void launchBrowser() throws InterruptedException {

System.setProperty ("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("JBL Speakers");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#gh-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#gh-p-1 > a")).click();
        driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.quit();
        

    }
    public static void main(String[] args) throws InterruptedException {

        FirstSeleniumTest obj = new FirstSeleniumTest(); 

        obj.launchBrowser(); 

        obj.searchProduct(); }






	private void searchProduct() {
		// TODO Auto-generated method stub
		
	}
    }
    
    
  
