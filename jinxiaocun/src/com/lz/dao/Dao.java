package com.lz.dao;

import java.sql.DriverManager;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import com.lzw.Item;
import com.lzw.dao.model.*;
public class Dao {
//�������ݿ������۵�����
	protected static String dbClassName="oracle.jdbc.driver.OracleDriver";
	//����������ݿ��URL
	protected static String dbUrl="jdbc:oracle:thin:@localhost:1521:orcl";
	//����������ݿ���û���
	protected static String dbUser="system";
	//����������ݿ������
	protected static String dbPwd="1234";
	//�������ݿ�����Ӷ���
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
			//��չ��췽������ֹ����Dao���ʵ������
		}
}
