package com.lzw;

public class Item {
private String id;//id编号属性
private String name;//name属性
public Item(){
	//默认构造方法
}
public Item(String id,String name){
	this.id=id;
	this.name=name;
	//包含所有属性初始化的构造方法
}
public String getId(){
	return id;//获得id属性的方法
}
public void setId(String id){
	this.id=id;//设置id属性的方法
}
public String getName(){
	return name;//获得name属性的方法
}
public void setName(String name){
	this.name=name;//设置name属性的方法
}
public String toString(){
	return getName();//重写toString（）方法，只输出name属性
}
}
