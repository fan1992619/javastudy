package com.lz.dao;

import java.sql.DriverManager;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import com.lzw.Item;
import com.lzw.dao.model.*;
public class Dao {
//定义数据库驱动累的名称
	protected static String dbClassName="oracle.jdbc.driver.OracleDriver";
	//定义访问数据库的URL
	protected static String dbUrl="jdbc:oracle:thin:@localhost:1521:orcl";
	//定义访问数据库的用户名
	protected static String dbUser="system";
	//定义访问数据库的密码
	protected static String dbPwd="1234";
	//声明数据库的链接对象
	public static Commection conn=null;
	static{
		try{
			if(conn==null){
				Class.forName(dbClassName).newInstance();
				conn=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
			}
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}
		private Dao(){
			//封闭构造方法，禁止创建Dao类的实力对象
		}
}
