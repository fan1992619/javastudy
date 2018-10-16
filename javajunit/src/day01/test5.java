package day01;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;

public class test5 {

	//jd��¼ҳ���������κ���Ϣ��ֱ�ӵ����¼���Ե�������ʾ��Ϣ�Ƿ�
	//�Ƿ����������Ϣ���ݽ��ж���
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
	public void test() throws InterruptedException {
		driver.get("https://www.jd.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("���¼")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("�˻���¼")).click();
		driver.findElement(By.id("loginsubmit")).click();
		//�ж���ʾ���Ƿ����
		Alert a=driver.switchTo().alert();
		assertTrue(isAlertPresent());
	}

}
