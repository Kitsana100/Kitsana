import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class Mid {

	@Test
	void test() throws InterruptedException {		
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "D:\\644259005\\chromedriver.exe");
		driver = new ChromeDriver();
		
		   driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		   
		   driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("Kitsana");
		   driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Hora");
		   driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("110 หมู่ 7");
		   driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("Malaiman");
		   driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys(" Mung Nakhonpathom");
		   driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("Nakhonpathom");
		   driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("713000");
		   driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("kitsanahora13@gmail.com");
		   driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys("02/08/2023");
		   driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("0981089180");
		   WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"vfb-20-0\"]"));
	        radio1.click();
	        WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"vfb-20-1\"]"));
	        radio2.click();
	        WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]"));
	        radio3.click();
	        WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"vfb-20-3\"]"));
	        radio4.click();
	        WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"vfb-20-4\"]"));
	        radio5.click();
	        WebElement radio6 = driver.findElement(By.xpath("//*[@id=\"vfb-20-5\"]"));
	        radio6.click();
	        driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("Mid");
	        driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("99");
	        driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
	       
	      
	        String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();

	        assertEquals("Dynamic Transaction Verification",result);
	        
	        Thread.sleep(4000);
	         driver.quit();
	         driver = null;
	}

}