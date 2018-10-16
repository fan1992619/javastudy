package day01;
//ʹ��List<WebElement> list
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetAttribute;

public class test2 {
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
		driver.get("https://www.jd.com/");
		//�������
		driver.manage().window().maximize();
		//ʹ��List����id�������е�class���Ե�ͼƬ
		List<WebElement> list=driver.findElement(By.id("seckill"))
		.findElements(By.tagName("img"));
		//����һ������E����LIST�������õ�ͼƬ
		for(WebElement e:list){
			String f=e.getAttribute("class");//��ÿһ��class���Ե�ֵ��ֵ������F
			//�ж�f�Ƿ����"J_sk_item sk_item sk_item_1"������Ǿ���click()����
			//�˲�����������ǿ
			if (f.equals("sk_item_img")){
			e.click();
			break;
			}
		}
	}

}
