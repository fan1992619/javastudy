package day01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {
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
        driver.get("https://www.jd.com");
        //窗口最大化
        driver.manage().window().maximize();
        //获取网页标题
        String b=driver.getTitle();
        //断言网页标题是否包含"正品低价"
        assertTrue(b.contains("正品低价"));
        driver.findElement(By.partialLinkText("请登录")).click();
        driver.findElement(By.linkText("账户登录")).click();
        //获取网页URL路径
        String c=driver.getCurrentUrl();
        //断言链接里面是否包含"jd.com"
        assertTrue(c.contains("jd.com"));
        driver.findElement(By.id("loginname")).sendKeys("498904925@qq.com");
        //获取用户名文本框的值
        String a=driver.findElement(By.id("loginname")).getAttribute("value");
        //断言用户名文本框的值是否相等
        assertEquals("498904925@qq.com",a);
        driver.findElement(By.id("nloginpwd")).sendKeys("61904925fy");
        //获取登陆按钮的值
        String d=driver.findElement(By.id("loginsubmit")).getText();
        //断言登录按钮的值是否相等
        assertEquals("登    录", d);
        driver.findElement(By.id("loginsubmit")).click();
        Thread.sleep(3000);
        //获取登录成功用户账户名的纯文本的值
        String e=driver.findElement(By.linkText("fan1992619")).getText();
        //断言用户账户名是否相等
        assertEquals("fan1992619", e);   
	}

}
