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
        //�������
        driver.manage().window().maximize();
        //��ȡ��ҳ����
        String b=driver.getTitle();
        //������ҳ�����Ƿ����"��Ʒ�ͼ�"
        assertTrue(b.contains("��Ʒ�ͼ�"));
        driver.findElement(By.partialLinkText("���¼")).click();
        driver.findElement(By.linkText("�˻���¼")).click();
        //��ȡ��ҳURL·��
        String c=driver.getCurrentUrl();
        //�������������Ƿ����"jd.com"
        assertTrue(c.contains("jd.com"));
        driver.findElement(By.id("loginname")).sendKeys("498904925@qq.com");
        //��ȡ�û����ı����ֵ
        String a=driver.findElement(By.id("loginname")).getAttribute("value");
        //�����û����ı����ֵ�Ƿ����
        assertEquals("498904925@qq.com",a);
        driver.findElement(By.id("nloginpwd")).sendKeys("61904925fy");
        //��ȡ��½��ť��ֵ
        String d=driver.findElement(By.id("loginsubmit")).getText();
        //���Ե�¼��ť��ֵ�Ƿ����
        assertEquals("��    ¼", d);
        driver.findElement(By.id("loginsubmit")).click();
        Thread.sleep(3000);
        //��ȡ��¼�ɹ��û��˻����Ĵ��ı���ֵ
        String e=driver.findElement(By.linkText("fan1992619")).getText();
        //�����û��˻����Ƿ����
        assertEquals("fan1992619", e);   
	}

}
