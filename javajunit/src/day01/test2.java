package day01;
//使用List<WebElement> list
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
		//窗口最大化
		driver.manage().window().maximize();
		//使用List遍历id下面所有的class属性的图片
		List<WebElement> list=driver.findElement(By.id("seckill"))
		.findElements(By.tagName("img"));
		//定义一个变量E接收LIST表里面获得的图片
		for(WebElement e:list){
			String f=e.getAttribute("class");//将每一个class属性的值赋值给变量F
			//判断f是否包含"J_sk_item sk_item sk_item_1"。如果是就做click()动作
			//此步骤出错。需待加强
			if (f.equals("sk_item_img")){
			e.click();
			break;
			}
		}
	}

}
