package day01;
//使用select封装对象
//此demo只适合做笔记，不能运行，报错42行

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class test4 {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver =new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.jd.com/");
		driver.manage().window().maximize();
		//封装分类下拉框Select对象
		WebElement we =driver.findElement
				(By.xpath(".//*[@id='ttbar-myjd']/div[1]/i[1]"));
		Actions action = new Actions(driver);  
		 action.clickAndHold();// 鼠标悬停在当前位置，既点击并且不释放
		//we.click();
		Select s=new Select(we);
		//通过选项的文本内容来选择
		s.selectByVisibleText("待处理订单");
		//通过选项编号来选择，从0开始
		s.selectByIndex(1);
		//通过值来选择
		s.selectByValue("6");
		//获得当前被选中的第一个选项的文本的值
		String t=s.getFirstSelectedOption().getText();
		assertTrue(t.contains("待处理订单"));
		//获取所有的选项
		List<WebElement> all=s.getOptions();
		//包含“待处理订单”,使用遍历List
		for(WebElement o:all){
			if(o.getText().contains("待处理订单")){
				o.click();
				break;
			}
		}
		//切换到信息提示框Alert
		Alert a=driver.switchTo().alert();
		assertTrue(a.getText().contains("待处理订单"));
		//关闭提示框
		a.accept();//点击关闭提示框（建议选择这个）
		a.dismiss();//点击取消或者否
		Thread.sleep(3000);
		//有提示框出现，直接调用IDE里面的方法，不用自己封装对象或者写私有方法
	}

}
