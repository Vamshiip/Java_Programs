package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

//	public static void main(String[] args) {
	/*	System.out.println("restart");
        System.setProperty("Webdriver.chrome.driver" ,"\"C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"" );
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Earpods");
		driver.findElement(By.xpath("//input[@type='submit']")).click();


	}*/
		
		WebDriver driver; 

	     public void launchBrowser() {

	       System.setProperty("Webdriver.chrome.driver" ,"\"C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");

	        driver = new ChromeDriver();

	        driver.get("https://www.ebay.com/");

	    }

	    public void searchProduct() throws InterruptedException {

	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("JBL Speakers");

	        driver.findElement(By.xpath("//input[@type='submit']")).click();

	        Thread.sleep(2000);

	        //driver.findElement(By.xpath("")).click();

	        System.out.println("The title of the page is :" + driver.getTitle());   

	    }

	    public void navigate() throws InterruptedException {

	        Thread.sleep(2000);

	        driver.navigate().to("https://www.simplilearn.com/");

	        Thread.sleep(2000);

	        driver.navigate().back();

	    }

	    public void closeBrowser() {

	        driver.quit();

	    }

	    public static void main(String[] args) throws InterruptedException {

	        Auto obj = new Auto(); 

	        obj.launchBrowser(); 

	        obj.searchProduct();

	        obj.navigate();

	        obj.closeBrowser();
	    }
	
}
