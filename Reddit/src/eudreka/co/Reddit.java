package eudreka.co;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddit {

	public static void main(String[] args) throws InterruptedException{
		//Setting Up the Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\Jar\\New Driver 91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Open Reddit link()
		driver.get("https://www.reddit.com");
		Thread.sleep(10000);

		//Identifying WebElement; in reddit site there is no search buttn; therefore using Enter key;Creating webelement for the same;
		WebElement searchBox = driver.findElement(By.id("header-search-bar"));
		//		driver.findElement(By.id("header-search-bar")).sendKeys("python");
		searchBox.sendKeys("python");
		//Take some time off xd
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);		//Using the ENTER Key;
		//		driver.findElement(By.id("header-search-bar")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println("Page Search Completed");
		
		// Joining the Python group, in here i don't need to create WebElement, but had to search for xpath
		driver.findElement(By.xpath("//*[@id=\"SHORTCUT_FOCUSABLE_DIV\"]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[3]/div/div[2]/div[1]/div/a/div[3]/button")).click();;
		Thread.sleep(4000);

		//Asking for a email - Apple - Google; Getting a feeling - xpath will help here
		//		driver.findElement(By.id("regEmail")).sendKeys("Test123@gmail.com");

		//		System.out.println("should be adding gmail id");
		//		driver.findElement(By.xpath("//*[@id=\"regEmail\"]")).sendKeys("Test123@gmail.com");
		//		System.out.println("Should be added");



		WebElement emailBox = driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div[2]/form/fieldset[1]/input[2]"));
		emailBox.sendKeys("test123@gmail.com");
		System.out.println("Value should be put in gmail");

		//		Lets start with continue as gmail
//		driver.findElement(By.id("google-sso")).click();
//		driver.findElement(By.name("identifier")).click();
//		System.out.println("It will not be able to find" + "if it is - then babae I m wrong");
		Thread.sleep(5000);


		driver.close();
	}
}
