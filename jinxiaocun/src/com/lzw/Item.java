package com.lzw;

public class Item {
private String id;//id�������
private String name;//name����
public Item(){
	//Ĭ�Ϲ��췽��
}
public Item(String id,String name){
	this.id=id;
	this.name=name;
	//�����������Գ�ʼ���Ĺ��췽��
}
public String getId(){
	return id;//���id���Եķ���
}
public void setId(String id){
	this.id=id;//����id���Եķ���
}
public String getName(){
	return name;//���name���Եķ���
}
public void setName(String name){
	this.name=name;//����name���Եķ���
}
public String toString(){
	return getName();//��дtoString����������ֻ���name����
}
}
