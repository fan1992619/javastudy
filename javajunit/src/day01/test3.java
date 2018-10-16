package day01;
//ʹ��isSelected�ж��Ƿ�ѡ��
//isEnabled�Ƿ���ã���Щ�ռ��ûҿ��������жϣ�
//isDisplayed()�Ƿ���ʾ
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
		//����ҡ����ѡ��
		assertTrue(driver.findElement(By.id("m1")).isSelected());
		assertFalse(driver.findElement(By.id("m2")).isSelected());
		assertFalse(driver.findElement(By.id("m3")).isSelected());
		//�жϡ����и�ѡ�����δ��ѡ�У������ѡ��
		WebElement we=driver.findElement(By.id("m3"));
		if(!we.isSelected()){
			we.click();
		}
		driver.findElement(By.id("s1")).click();
		assertTrue(driver.findElement(By.id("s1")).isSelected());
	}

}
