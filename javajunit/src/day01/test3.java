package day01;
//使用isSelected判断是否被选中
//isEnabled是否可用（有些空件置灰可以用来判断）
//isDisplayed()是否显示
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test3 {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver=new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("file:///E:/Selenium/Selenium1/example/check.html");
		driver.manage().window().maximize();
		//断言摇滚被选中
		assertTrue(driver.findElement(By.id("m1")).isSelected());
		assertFalse(driver.findElement(By.id("m2")).isSelected());
		assertFalse(driver.findElement(By.id("m3")).isSelected());
		//判断“流行复选框”如果未被选中，点击来选中
		WebElement we=driver.findElement(By.id("m3"));
		if(!we.isSelected()){
			we.click();
		}
		driver.findElement(By.id("s1")).click();
		assertTrue(driver.findElement(By.id("s1")).isSelected());
	}

}
