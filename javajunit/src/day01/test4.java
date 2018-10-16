package day01;
//ʹ��select��װ����
//��demoֻ�ʺ����ʼǣ��������У�����42��

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
		//��װ����������Select����
		WebElement we =driver.findElement
				(By.xpath(".//*[@id='ttbar-myjd']/div[1]/i[1]"));
		Actions action = new Actions(driver);  
		 action.clickAndHold();// �����ͣ�ڵ�ǰλ�ã��ȵ�����Ҳ��ͷ�
		//we.click();
		Select s=new Select(we);
		//ͨ��ѡ����ı�������ѡ��
		s.selectByVisibleText("��������");
		//ͨ��ѡ������ѡ�񣬴�0��ʼ
		s.selectByIndex(1);
		//ͨ��ֵ��ѡ��
		s.selectByValue("6");
		//��õ�ǰ��ѡ�еĵ�һ��ѡ����ı���ֵ
		String t=s.getFirstSelectedOption().getText();
		assertTrue(t.contains("��������"));
		//��ȡ���е�ѡ��
		List<WebElement> all=s.getOptions();
		//����������������,ʹ�ñ���List
		for(WebElement o:all){
			if(o.getText().contains("��������")){
				o.click();
				break;
			}
		}
		//�л�����Ϣ��ʾ��Alert
		Alert a=driver.switchTo().alert();
		assertTrue(a.getText().contains("��������"));
		//�ر���ʾ��
		a.accept();//����ر���ʾ�򣨽���ѡ�������
		a.dismiss();//���ȡ�����߷�
		Thread.sleep(3000);
		//����ʾ����֣�ֱ�ӵ���IDE����ķ����������Լ���װ�������д˽�з���
	}

}
